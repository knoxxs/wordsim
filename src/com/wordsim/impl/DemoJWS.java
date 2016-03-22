package com.wordsim.impl;

import com.wordsim.SimilarityMeasure;

/**
 * Copyright (C) 2016 Scupids - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author kumar
 */


/***
 * http://wn-similarity.sourceforge.net/
 */
public class DemoJWS {


    public static void main(String args[]) {
        /*
        String wordnetpath = "C:/Users/kumar/git/wordsim/WordNet";
        JWS jws = new JWS(wordnetpath, "2.1");
        JiangAndConrath var3 = jws.getJiangAndConrath();
        System.out.println("Jiang & Conrath\n");
        Double s = var3.jcn("bank", 1, "river", 1, "n");
        System.out.print(s);
        */
        //SimilarityMeasure measure = new SimilarityMeasure();
        JWSWordSimilarity jwsws = new JWSWordSimilarity();
        Double score = jwsws.getWordSimilarity("car", 1, "bus", 1, "n", SimilarityMeasure.HirstStOnge);
        System.out.print(score);
    }


}
