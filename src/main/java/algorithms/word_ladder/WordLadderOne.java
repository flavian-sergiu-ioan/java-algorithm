package algorithms.word_ladder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class WordLadderOne {
    public static void main(String[] args) {
        String begin = "hit";
        String end = "cog";
        Set<String> wordSet = new HashSet<>(Arrays.asList("hot","dot","dog","lot","log"));
        System.out.println(laggerLength(begin, end, wordSet));
    }

    private static int laggerLength(String begin, String end, Set<String> dic) {
        LinkedList<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(begin, 1));

        dic.add(end);

        while(!queue.isEmpty()) {
            WordNode top = queue.remove();
            String word = top.word;

            if (word.equals(end)) {
                return top.numSteps;
            }

            char[] arr = word.toCharArray();
            for (int i = 0; i<arr.length; i++) {
                for (char c = 'a'; c<='z'; c++) {
                    char temp = arr[i];
                    if(arr[i]!=c) {
                        arr[i]=c;
                    }

                    String newWord = new String(arr);
                    if(dic.contains(newWord)) {
                        queue.add(new WordNode(newWord, top.numSteps+1));
                        System.out.println(newWord);
                        dic.remove(newWord);
                    }
                    arr[i] = temp;
                }
            }
        }
        return 0;
    }
}
