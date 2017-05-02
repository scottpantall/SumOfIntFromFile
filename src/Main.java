/**
 *
 * @author Scott Pantall
 */
import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main (String[] args) throws IOException {
        Path file = Paths.get(args[0]);
        BufferedReader buffer = Files.newBufferedReader(file);
        String line;
        int sum = 0;
        
        while ((line = buffer.readLine()) != null) {
            sum += Integer.parseInt(line.trim());
        }
        System.out.println(sum);
    }
}
