import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchEngineImp implements SearchEngine {
    private TextAnalyzer analyzer = new JaccardTextAnalyzer();
    private TextAnalyzer cosAnalyzer = new CosineSimilarity();

    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jacard(1) or Cosine(2)?");
        int params = sc.nextInt();
        List<TextProvider> name = new ArrayList<>();
        switch (params) {
            case 1:
                return sort(sources, params, target);
            case 2:
                 return sort(sources, params, target);
        }
        return null;
    }

    private List<TextProvider> sort(List<TextProvider> sources, int params, TextProvider target) {
        double coef1 = 0.0;
        double coef2 = 0.0;
        for (int i = 0; i < sources.size(); i++) {
            for (int j = sources.size() - 1; j > i; j--) {
                switch (params) {
                    case 1: {
                        coef1 = analyzer.analyze(target, sources.get(j - 1));
                        coef2 = analyzer.analyze(target, sources.get(j));
                        break;
                    }
                    case 2: {
                        coef1 = cosAnalyzer.analyze(target, sources.get(j - 1));
                        coef2 = cosAnalyzer.analyze(target, sources.get(j));
                        break;
                    }
                    default:
                        System.out.println("ERROR");
                        break;
                }
                if (coef1 < coef2) {
                    TextProvider text = sources.remove(j - 1);
                    sources.add(j, text);
                }
            }
        }
        return sources;
    }
}
