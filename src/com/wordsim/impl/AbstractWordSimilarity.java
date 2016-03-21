package com.wordsim.impl;

import com.wordsim.SimilarityMeasure;
import com.wordsim.WordSimilarity;
import edu.cmu.lti.ws4j.Relatedness;


/**
 * Copyright (C) 2016 Scupids - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author aapa
 */
public abstract class AbstractWordSimilarity implements WordSimilarity {
    @Override
    public Double getWordSimilarity(String word1, String word2, SimilarityMeasure measure) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public Double getWordSimilarity(String word1, String word2, String sentence1, String sentence2,
                                    SimilarityMeasure measure) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public Double getWordSimilarity(String word1, int word1sense, String word2, int word2sense, String pos,
                                    SimilarityMeasure measure) {
        return null;
    }

    @Override
    public Double getWordSimilarity(String word1, String word2, int word2sense, String pos, SimilarityMeasure measure) {
        return null;
    }

    @Override
    public Double getWordSimilarity(String word1, String word2, String pos, SimilarityMeasure measure) {
        return null;
    }

    @Override
    public Relatedness getSimilaritySynset(String word1, String word2, SimilarityMeasure measure) {
        throw new UnsupportedOperationException("");
    }
}
