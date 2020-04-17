package LabsMaven.Lab10;


/**
 * StringData class to hold data on words contained in a text file. Implements Comparable interface
 * to determine sorting orders. compareTo() method is used to determine sorting order. sorts by
 * number of occurrances is descending order followed by length in descending order
 */
public class StringData implements Comparable {

    private String word;
    private int count;
    private int length;

    public StringData(String word, int count) {
        this.word = word;
        int wordLen = word.length();
        this.length = wordLen;
        this.count = count;
    }

    public StringData(String word) {
        this.word = word;
        int wordLen = word.length();
        this.length = wordLen;
        // this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return this.getWord() + " " + this.getCount();
    }

    /**
     * Compares two StringData objects first by number of occurances, followed by length Descending
     * order for each, in other words prioritizes words with the highest occurance, followed by the
     * longest word length
     */
    @Override
    public int compareTo(Object o) {
        StringData other = (StringData) o;

        if (this.getCount() < other.getCount()) {
            return -1;
        } else if (this.getCount() > other.getCount()) {
            return 1;
        } else {
            if (this.getLength() < other.getLength()) {
                return -1;
            } else if (this.getLength() > other.getLength()) {
                return 1;
            } else {
                return 0;
            }
        }

    }

    @Override
    public boolean equals(Object obj) {
        StringData other = (StringData) obj;
        if (this.getCount() == other.getCount()) {
            return true;
        } else {
            return false;
        }
    }


}
