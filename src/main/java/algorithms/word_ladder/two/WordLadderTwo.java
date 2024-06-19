package algorithms.word_ladder.two;

import java.util.*;

public class WordLadderTwo {

    public static void main(String[] args) {
        String begin = "hit";
        String end = "cog";
        Set<String> wordSet = new HashSet<>(Arrays.asList("hot","dot","dog","lot","log"));
        System.out.println(findLadder(begin, end, wordSet));
    }

    private static List<List<String>> findLadder(String begin, String end, Set<String> dic) {
        List<List<String>> result = new ArrayList<>();

        LinkedList<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(begin, 1, null));

        dic.add(end);
        int minStep = 0;

        Set<String> visited = new HashSet<>();
        Set<String> unvisited = new HashSet<>();

        unvisited.addAll(dic);

        int preNumSteps = 0;

        while(!queue.isEmpty()) {
            System.out.println(queue);
            WordNode top = queue.remove();
            String word = top.word;
            int currNumsteps = top.numSteps;

            if (word.equals(end)) {
                if (minStep == 0) {
                    minStep = top.numSteps;
                }

                if (top.numSteps == minStep && minStep != 0) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add(top.word);
                    while (top.pre != null) {
                        list.add(0, top.pre.word);
                        top = top.pre;
                    }
                    result.add(list);
                    continue;
                }
            }

            if (preNumSteps < currNumsteps) {
                unvisited.removeAll(visited);
            }

            preNumSteps = currNumsteps;

            char[] arr = word.toCharArray();
            for (int i = 0; i< arr.length; i++) {
                for (char c ='a'; c<='z'; c++) {
                    char temp = arr[i];
                    if(arr[i] != c) {
                        arr[i]=c;
                    }
                    String newWord = new String(arr);
                    if (unvisited.contains(newWord)) {
                        queue.add(new WordNode(newWord, top.numSteps+1, top));
                        visited.add(newWord);
                    }

                    arr[i]=temp;
                }
            }

        }

        return result;
    }
}
