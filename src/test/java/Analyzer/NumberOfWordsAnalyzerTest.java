package Analyzer;import org.junit.Test;import static org.junit.Assert.assertEquals;public class NumberOfWordsAnalyzerTest {    @Test    public void analyzeTest(){        String test = "a bb ccc bb a";        assertEquals(Long.valueOf(5), new NumberOfWordsAnalyzer().analyze(test));    }}