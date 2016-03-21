package com.wordsim;

import edu.cmu.lti.ws4j.Relatedness;

public interface WordSimilarity {

    Double getWordSimilarity(String word1, String word2, SimilarityMeasure measure);

    Double getWordSimilarity(String word1, String word2, String sentence1, String sentence2,
                             SimilarityMeasure measure);

    Relatedness getSimilaritySynset(String word1, String word2, SimilarityMeasure measure);
}
