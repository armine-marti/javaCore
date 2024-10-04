package homework.fileAnalyzer;

import java.io.IOException;
import java.util.Map;

public class FileAnalyzerMain {
    private static final String FINAL_PATH = "C:\\Users\\alexa\\IdeaProjects\\javaCore\\src\\homework\\fileAnalyzer\\resources\\climate change.txt\\";

    public static void main(String[] args) throws IOException {

        FileAnalyzer fileAnalyzer = new FileAnalyzer();

        //first method call
        Map<String, Integer> textHashMap = fileAnalyzer.wordMap(FINAL_PATH);
        for (Map.Entry<String, Integer> entry : textHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        //second method call
        fileAnalyzer.totalWordCount(FINAL_PATH);
        System.out.println();

        //third method call
        int uniqueWordCount = fileAnalyzer.uniqueWordCount(FINAL_PATH);
        System.out.println("Number of unique words is " + uniqueWordCount);
        System.out.println();

        //fourth method call
        Map<String, Integer> topWords = fileAnalyzer.topFrequentWords(FINAL_PATH, 3);
        for (Map.Entry<String, Integer> entry : topWords.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
        //fifth method call
        int wordOccurrence = fileAnalyzer.countWordOccurrences(FINAL_PATH, "climate");
        System.out.println("This word appears " + wordOccurrence  + " times");

    }
}
