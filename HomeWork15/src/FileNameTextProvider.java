import java.io.File;

public class FileNameTextProvider extends FileTextProvider {
    public FileNameTextProvider(File input) {
        super(input);
    }

    @Override
    public String getText() {
        String fileName = input.getName();
        String text = super.getText();
        return fileName + " " + text;
    }
}
