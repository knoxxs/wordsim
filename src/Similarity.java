
import edu.cmu.lti.ws4j.Relatedness;

public interface Similarity {

    public Double getSimilarityWord(String word1, String word2, SimilarityMeasureMetrics measure);
    public Relatedness getSimilarityWordSentence(String word1,String word2, String sentence1, String sentence2, SimilarityMeasureMetrics measure);
    // should replace relatedness with something else ...like double.
    public Relatedness getSimilaritySynset(String word1, String word2, SimilarityMeasureMetrics measure);
    //public Relatedness getSimilaritySynsetsentence();

}
