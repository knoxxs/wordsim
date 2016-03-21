import com.wordsim.SimilarityMeasure;
import com.wordsim.impl.WS4JWordSimilarity;

public class test {
    public static void main(String args[]) {
        WS4JWordSimilarity s = new WS4JWordSimilarity();

        s.getWordSimilarity("bank", "bank", SimilarityMeasure.HirstStOnge);
    }

}