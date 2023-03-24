package model;

public abstract class Sequence {
    private String sequence;

    public Sequence(String sequence) {
        this.sequence = sequence;
    }

    public double calculateGCContent() {
        float gcContent = 0;
        if (length() == 0)
            return gcContent;

        float gcLength = calculateGcLength();
        gcContent = gcLength / length();

        return gcContent;
    }

    private int calculateGcLength() {
        int gcLength = 0;
        char[] dnaCharArray = sequence
                .toLowerCase()
                .toCharArray();

        for (char letter : dnaCharArray) {
            if (letter == 'c' || letter == 'g') {
                gcLength++;
            }
        }

        return gcLength;
    }

    public int length() {
        return sequence.length();
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}
