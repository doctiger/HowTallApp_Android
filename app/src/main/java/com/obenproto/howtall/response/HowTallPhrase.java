package com.obenproto.howtall.response;

public class HowTallPhrase {

    private String message;
    private int phraseId;
    private int phraseNumber;
    private String sentence;

    public String getMessage() {
        return message;
    }

    public int getPhraseId() {
        return phraseId;
    }

    public int getPhraseNumber() {
        return phraseNumber;
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public String toString() {
        return "HowTallPhrase{" +
                "message='" + message + '\'' +
                ", phraseId=" + phraseId +
                ", phraseNumber=" + phraseNumber +
                ", sentence='" + sentence + '\'' +
                '}';
    }
}
