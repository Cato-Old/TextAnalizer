package Analyzer;import java.util.Arrays;import java.util.List;import java.util.Map;import java.util.stream.Collectors;public class MostFrequentWordsAnalyzer implements Analyzer<List<String>> {    @Override    public List<String> analyze(String text) {        Map<String,Long> wordsMap = Arrays                .stream(text                                .toLowerCase()                                .split("[\\/\\. -]|\\r?\\n"))                .map(x->x.replaceAll("[^\\p{LD}\\s]",""))                .filter(x->!x.matches(""))                .collect(Collectors.groupingBy(x->x, Collectors.counting()));        return wordsMap                .entrySet()                .stream()                .sorted((x,y)->y.getValue().compareTo(x.getValue()))                .limit(10)                .map(Map.Entry::getKey)                .collect(Collectors.toList());    }    @Override    public String analyzeWithFormattedOutput(String text) {        return "The most frequent words are: " + analyze(text).toString();    }}