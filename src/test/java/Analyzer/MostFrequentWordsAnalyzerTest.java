package Analyzer;import org.junit.Test;import static org.junit.Assert.assertArrayEquals;public class MostFrequentWordsAnalyzerTest {    @Test    public void analyzeTest(){        String test = "a bb ccc bb a a";        String[] testArray = {"a","bb","ccc"};        assertArrayEquals(testArray, new MostFrequentWordsAnalyzer().analyze(test));    }}