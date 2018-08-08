package main.java.com.DeadProg.Homework4;

public class Sentence extends Word{
    private Word sentence;

    public Sentence(String word, Word sentence) {
        super(word);
        this.sentence = sentence;
    }
}
