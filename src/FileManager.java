import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void writeToTextFile(String filename, String data) throws IOException {
        FileWriter fileWriter = new FileWriter(filename, true);
        fileWriter.write(data + "\n");
        fileWriter.close();
    }
}
