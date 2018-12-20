import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer analyzer = new JaccardTextAnalyzer();
        TextAnalyzer cosAnalyzer = new CosineSimilarity();
        Scanner sc = new Scanner(System.in);
        String consolWord1;
        String consolWord2;
        System.out.println("Откуда считываем значения?\nКонсоль - 1. Файл - 2");
        int params = Integer.parseInt(sc.nextLine());
        switch (params) {
            case 1:
                System.out.println("Первый текст");
                consolWord1 = sc.nextLine();
                System.out.println("Второй текст");
                consolWord2 = sc.nextLine();
                double coef = analyzer.analyze(new SimpleTextProvider(consolWord1), new SimpleTextProvider(consolWord2));
                double cosCoef = cosAnalyzer.analyze(new SimpleTextProvider(consolWord1), new SimpleTextProvider(consolWord2));
                System.out.println("Коэффициент схожести по Джакарду: " + coef);
                System.out.println("Косинусова мера: " + cosCoef);
                break;
            case 2:
                File file1 = new File("C:\\Users\\Alexey\\Desktop\\HomeWork15\\src\\files\\Text1.txt");
                File file2 = new File("C:\\Users\\Alexey\\Desktop\\HomeWork15\\src\\files\\Text2.txt");
                double coefFile = analyzer.analyze(new FileTextProvider(file1), new FileTextProvider(file2));
                double cosCoefFile = cosAnalyzer.analyze(new FileTextProvider(file1), new FileTextProvider(file2));
                System.out.println("Джакард через файл "+coefFile);
                System.out.println("Косинус через файл "+cosCoefFile);
                break;
            default:
                System.err.println("Такого параметра нет");
                break;
        }
    }
}
