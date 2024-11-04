import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class M2 {
    public static void main(String[] args) {
       if (args.length == 0) {
            System.out.println("Please specify one or more files.");
            return;
        }

        for (String fileName : args) {
            int lineCount = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                while (reader.readLine() != null) {
                    lineCount++;
                }
                System.out.println(fileName + ": " + lineCount + " lines");
            } catch (IOException e) {
                System.err.println("Error reading file " + fileName + ": " + e.getMessage());
            }
        }
    }
}
