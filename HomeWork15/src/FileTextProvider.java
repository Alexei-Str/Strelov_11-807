import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileTextProvider implements TextProvider {
    File input;

    FileTextProvider(File input) {
        this.input = input;
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();
        try (Scanner sc = new Scanner(input)) {
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
        return sb.toString();
    }
}
