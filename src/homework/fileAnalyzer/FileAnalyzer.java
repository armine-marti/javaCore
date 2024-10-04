package homework.fileAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileAnalyzer {

    public Map<String, Integer> wordMap(String path) throws IOException {
        // Читаем файл, составляем мапу слово-количество и возвращаем ее

        Map<String, Integer> uniqueWordCount = new HashMap<>();
        try (BufferedReader bReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bReader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();
                        int beforeCount = uniqueWordCount.getOrDefault(word, 0);
                        int newCount = beforeCount + 1;
                        uniqueWordCount.put(word, newCount);
                    }
                }
            }
        }
        return uniqueWordCount;
    }

    public int totalWordCount(String path) throws IOException {
        int wordCount = 0;
        try (BufferedReader bReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bReader.readLine()) != null) {
                String[] words = line.split("\\W+");
                wordCount += words.length;

            }
        }
        System.out.println("Total number of words is " + wordCount);
        return wordCount;
    }

    public int uniqueWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем количество уникальных слов
        Map<String, Integer> uniqueWordCount = new HashMap<>();
        try (BufferedReader bReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bReader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();
                        int beforeCount = uniqueWordCount.getOrDefault(word, 0);
                        int newCount = beforeCount + 1;
                        uniqueWordCount.put(word, newCount);
                    }
                }
            }
        }

        return uniqueWordCount.size();
    }

    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        // Читаем файл, находим топ-N часто встречающихся слов
        Map<String, Integer> uniqueWordCount = new HashMap<>();
        try (BufferedReader bReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bReader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();
                        int beforeCount = uniqueWordCount.getOrDefault(word, 0);
                        int newCount = beforeCount + 1;
                        uniqueWordCount.put(word, newCount);
                    }
                }
            }
        }
        String mostPopularWord = null;
        int wordFrequency = 0;
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : uniqueWordCount.entrySet()) {
            if (entry.getValue() > wordFrequency) {
                mostPopularWord = entry.getKey();
                wordFrequency = entry.getValue();
                result.put(mostPopularWord, wordFrequency);
            }
        }
        return result;
    }

    public int countWordOccurrences(String path, String word) throws IOException {
        // Читаем файл, находим количество вхождений слова и возвращаем это число
        int count = 0;
        try (BufferedReader bReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bReader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String searchedWord : words) {
                    if (word.equalsIgnoreCase(searchedWord)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
