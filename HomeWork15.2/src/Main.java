import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //то же, что в v00
        TextAnalyzer a = new JaccardTextAnalyzer();
        TextAnalyzer b = new CosineSimilarity();
        String s1 = "Мама мыла раму, а я ничего не делал";
        String s2 = "Я совсем ничего не делал";
        double coef1 = a.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
        double coef12 = b.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
        System.out.println("Жаккард для просто строк: " + coef1);
        System.out.println("Косинусная мера для просто строк: " + coef12);

        //Тоже вычисляем коэффициент, только сравниваем текст, хранящийся в двух файлах.
        //Текст в файлах точно такой же как при сравнении выше, поэтому результаты одинаковые
        File f1 = createFile("f1.txt", s1);
        //File f1 = new File("f1.txt");
        //File f2 = new File("f2.txt");
        File f2 = createFile("f2.txt", s2);
        double coef2 = a.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
        double coef22 = b.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
        System.out.println("Жаккард для содержимого файлов: " + coef2);
        System.out.println("Косинусная мера для содержимого файлов: " + coef22);
        //f1.delete(); f2.delete();
    }

    //Method for testing only.
    static File createFile(String fileName, String content) throws FileNotFoundException {
        File f = new File(fileName);
        PrintWriter pw = new PrintWriter(f);
        pw.print(content);
        pw.close();
        return f;
    }
}