
import edu.cmu.lti.ws4j.Relatedness;

public interface WordSimilarity {

    Double getWordSimilarity(String word1, String word2, SimilarityMeasureMetrics measure);

    Double getWordSimilarity(String word1, String word2, String sentence1, String sentence2,
                             SimilarityMeasureMetrics measure);

    Relatedness getSimilaritySynset(String word1, String word2, SimilarityMeasureMetrics measure);
}
