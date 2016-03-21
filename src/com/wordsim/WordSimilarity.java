package com.wordsim;

import edu.cmu.lti.ws4j.Relatedness;

public interface WordSimilarity {

    /***
     * todo word1 change to inputword, word2 to slotword  and similarly for wordsense, pos could be converted to enum,
     *
     * @param word1
     * @param word2
     * @param measure
     * @return
     */


    Double getWordSimilarity(String word1, String word2, SimilarityMeasure measure);

    Double getWordSimilarity(String word1, String word2, String sentence1, String sentence2,
                             SimilarityMeasure measure);
    Double getWordSimilarity(String word1, int word1sense, String word2, int word2sense, String pos, SimilarityMeasure measure);

    Double getWordSimilarity(String word1, String word2, int word2sense, String pos, SimilarityMeasure measure);

    Double getWordSimilarity(String word1, String word2, String pos, SimilarityMeasure measure);

    Relatedness getSimilaritySynset(String word1, String word2, SimilarityMeasure measure);
}
