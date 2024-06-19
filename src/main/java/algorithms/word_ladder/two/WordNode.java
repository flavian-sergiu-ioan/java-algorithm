package algorithms.word_ladder.two;

public class WordNode {
    String word;
    int numSteps;
    WordNode pre;

    public WordNode(String word, int numSteps, WordNode pre) {
        this.word = word;
        this.numSteps = numSteps;
        this.pre = pre;
    }

    @Override
    public String toString() {
        return "WordNode{" +
                "word='" + word + '\'' +
                ", numSteps=" + numSteps +
                ", pre=" + pre +
                '}';
    }
}
