import picocli.CommandLine.*;import java.io.IOException;import java.nio.file.Files;import java.nio.file.Paths;import java.util.List;public class CLIApp{    @Option(names = "-f", description = "Path to file.")    String filePath;    public void run() throws IOException{        List<String> lines = Files.readAllLines(Paths.get(filePath));        String text = String.join(" ", lines);        MultiAnalizer.callAnalyzers(text);    }}