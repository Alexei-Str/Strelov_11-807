
import java.util.List;

public class SearchEngineImpl implements SearchEngine {
    TextAnalyzer analyzer;

    public SearchEngineImpl(TextAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        for (int i = 0; i < sources.size(); i++) {
            for (int j = sources.size()-1; j > i ; j--) {
                if (analyzer.analyze(target, sources.get(j-1)) < analyzer.analyze(target, sources.get(j))) {
                    TextProvider t = sources.get(j-1);
                    sources.set(j-1,sources.get(j));
                    sources.set(j,t);
                }
            }
        }
        return sources;
    }

}