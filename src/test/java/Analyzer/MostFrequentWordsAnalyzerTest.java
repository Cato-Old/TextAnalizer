package Analyzer;import org.junit.Test;import java.util.ArrayList;import java.util.Arrays;import static org.junit.Assert.assertEquals;public class MostFrequentWordsAnalyzerTest {    @Test    public void analyzeTest(){        String test = "a bb ccc bb a \r\na";        String[] testArray = {"a","bb","ccc"};        assertEquals(new ArrayList(Arrays.asList(testArray)), new MostFrequentWordsAnalyzer().analyze(test));    }}