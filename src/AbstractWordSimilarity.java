import edu.cmu.lti.ws4j.Relatedness;

/**
 * Copyright (C) 2016 Scupids - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author aapa
 */
public class AbstractWordSimilarity implements WordSimilarity {
    @Override
    public Double getWordSimilarity(String word1, String word2, SimilarityMeasureMetrics measure) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public Double getWordSimilarity(String word1, String word2, String sentence1, String sentence2,
                                    SimilarityMeasureMetrics measure) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public Relatedness getSimilaritySynset(String word1, String word2, SimilarityMeasureMetrics measure) {
        throw new UnsupportedOperationException("");
    }
}
