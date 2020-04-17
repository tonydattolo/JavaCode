////////////////////////////////////////////////////////////////////////////////////
// C212
//
// Released: 4/9/20
//
// Lab 10
// @Author Tony Dattolo, tdattolo
// Last Edited: 4/15/2020
//
//
// Part 2: FrequencyCounter
// FOR GRADERS: Few point of clarification. As per the instructions, I sorted the
//              ArrayList<StringData> in descending order according to count (# of occurances).
//              It did not specify how to sort words with the same equivalence, so I sorted
//              words with the same number of occurances secondarily by length and did this
//              in descending order as well.
//      
//
//
////////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

/**
 * FrequencyCounter class. Takes in a filename argument, analyzes the data, and outputs it
 * to statistics.txt
 */
public class FrequencyCounter {

    public static void main(String[] args) throws FileNotFoundException {

        // FrequencyCounter instance =
        //         new FrequencyCounter("LabsMain\\src\\main\\java\\LabsMaven\\Lab10\\tinyTale.txt");

        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the file path of the text file you wish to analyze: ");
        String userInput = console.next();

        FrequencyCounter test0 = new FrequencyCounter(userInput);
        
        console.close();
        
    }

    private File file;

    private int totalWordCount;
    private int totalLineCount;
    private Map<String, Integer> wordCounter;
    private ArrayList<StringData> fileInformation;
    private Set<String> uniqueWords;

    /**
     * Constructor class for FrequencyCounter
     * @param filename name of the file you wish to observe
     */
    public FrequencyCounter(String filename) throws FileNotFoundException {
        this.file = new File(filename);
        this.totalLineCount = 0;
        this.totalWordCount = 0;
        this.wordCounter = new TreeMap();
        this.uniqueWords = new HashSet<>();
        this.fileInformation = new ArrayList<>();

        try {

            Scanner in = new Scanner(this.getFile());
            in.useDelimiter("[^A-za-z]+");

            while (in.hasNextLine()) {
                totalLineCount++;
                String[] currentLine = in.nextLine().split("\\s+");
                for (int i = 0; i < currentLine.length; i++) {
                    // update set storing unique words
                    this.addWord(currentLine[i]);

                    // check if word is in map, if it is, update counter value, if not, add and set
                    // value to 1
                    if (wordCounter.keySet().contains(currentLine[i])) {
                        wordCounter.put(currentLine[i], wordCounter.get(currentLine[i]) + 1);
                    } else {
                        wordCounter.put(currentLine[i], 1);
                    }

                    // update total word count
                    totalWordCount++;
                }
            }

            // Add StringData to ArrayList for use in reporting
            for (String currentWord : uniqueWords) {
                StringData temp = new StringData(currentWord, this.getWordCount(currentWord));
                this.addWordData(temp);
            }

            
            // sort treeset in descending order
            Collections.sort(fileInformation, Collections.reverseOrder());

            PrintWriter out =
                    new PrintWriter("LabsMain\\src\\main\\java\\LabsMaven\\Lab10\\statistics.txt");

            out.println(this.getFile() + " has " + this.getTotalWordCount() + " total words.");
            out.println(
                    this.getFile() + " has " + this.getUniqueWords().size() + " distinct words.");
            out.println(this.getFile() + " has " + this.getTotalLineCount() + " total lines.");
            for (StringData stringData : fileInformation) {
                out.println("Word: " + stringData.getWord() + ", Length: " + stringData.getLength()
                        + ", Occurances: " + stringData.getCount());
            }

            out.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public void addWord(String word) {
        this.uniqueWords.add(word);
    }

    public void addWordData(StringData nData) {
        this.fileInformation.add(nData);
    }

    public int getWordCount(String n) {
        return this.wordCounter.get(n);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public int getTotalWordCount() {
        return totalWordCount;
    }

    public void setTotalWordCount(int totalWordCount) {
        this.totalWordCount = totalWordCount;
    }

    public int getTotalLineCount() {
        return totalLineCount;
    }

    public void setTotalLineCount(int totalLineCount) {
        this.totalLineCount = totalLineCount;
    }

    public Map<String, Integer> getWords() {
        return wordCounter;
    }

    public void setWords(Map<String, Integer> words) {
        this.wordCounter = words;
    }

    public ArrayList<StringData> getFileInformation() {
        return fileInformation;
    }

    public void setFileInformation(ArrayList<StringData> fileInformation) {
        this.fileInformation = fileInformation;
    }

    public Set<String> getUniqueWords() {
        return uniqueWords;
    }

    public void setUniqueWords(Set<String> uniqueWords) {
        this.uniqueWords = uniqueWords;
    }

}
