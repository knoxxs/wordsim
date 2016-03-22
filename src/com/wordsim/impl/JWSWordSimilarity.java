package com.wordsim.impl;

import com.wordsim.SimilarityMeasure;
import edu.sussex.nlp.jws.*;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Copyright (C) 2016 Scupids - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * @author kumar
 */
public class JWSWordSimilarity extends AbstractWordSimilarity {

    private final static String wordnetpath = "C:/Users/kumar/git/wordsim/WordNet";
    private static JWS jws = new JWS(wordnetpath, "2.1");


    JiangAndConrath jcn = jws.getJiangAndConrath();
    AdaptedLesk adplesk = jws.getAdaptedLesk();
    AdaptedLeskTanimoto adpleskwithhypo = jws.getAdaptedLeskTanimoto();
    AdaptedLeskTanimotoNoHyponyms adpleskwithouthypo = jws.getAdaptedLeskTanimotoNoHyponyms();
    HirstAndStOnge hso = jws.getHirstAndStOnge();
    LeacockAndChodorow lch = jws.getLeacockAndChodorow();
    Lin lin = jws.getLin();
    Resnik res = jws.getResnik();
    WuAndPalmer wup = jws.getWuAndPalmer();
    Path path = jws.getPath();

    /***
     * lize karo. fir  return object.objectname(functionname(1))
     *
     * @param word1
     * @param word1sense
     * @param word2
     * @param word2sense
     * @param pos
     * @param measure
     * @return
     */
    @Override
    public Double getWordSimilarity(String word1, int word1sense, String word2, int word2sense, String pos, SimilarityMeasure measure) {
        Double score = 0.0;
        switch (measure) {
            case HirstStOnge:
                score = hso.hso(word1, word1sense, word2, word2sense, pos);
                break;

            case Leacock_Chodorow:
                score = lch.lch(word1, word1sense, word2, word2sense, pos);
                break;

            case Lesk:
                score = adpleskwithhypo.lesk(word1, word1sense, word2, word2sense, pos);
                break;

            case Resnik:
                score = res.res(word1, word1sense, word2, word2sense, pos);
                break;

            case Wu_Palmer:
                score = wup.wup(word1, word1sense, word2, word2sense, pos);
                break;

            case Jiang_Conrath:
                score = jcn.jcn(word1, word1sense, word2, word2sense, pos);
                break;

            case Lin:
                score = lin.lin(word1, word1sense, word2, word2sense, pos);
                break;

            case Path:
                score = path.path(word1, word1sense, word2, word2sense, pos);
                break;
            default:
                score = adpleskwithouthypo.lesk(word1, word1sense, word2, word2sense, pos);
                break;
        }

        return score;
    }

    @Override
    public Double getWordSimilarity(String word1, String word2, String pos, SimilarityMeasure measure) {
        Double score = 0.0;

        switch (measure) {
            case HirstStOnge:
                score = hso.max(word1, word2, pos);
                break;

            case Leacock_Chodorow:
                score = lch.max(word1, word2, pos);
                break;

            case Lesk:
                score = adpleskwithhypo.max(word1, word2, pos);
                break;

            case Resnik:
                score = res.max(word1, word2, pos);
                break;

            case Wu_Palmer:
                score = wup.max(word1, word2, pos);
                break;

            case Jiang_Conrath:
                score = jcn.max(word1, word2, pos);
                break;

            case Lin:
                score = lin.max(word1, word2, pos);
                break;

            case Path:
                score = path.max(word1, word2, pos);
                break;
            default:
                score = adpleskwithouthypo.max(word1, word2, pos);
                break;
        }

        return score;
    }


    /***
     * @param word1
     * @param word2
     * @param word2sense
     * @param pos
     * @param measure
     * @return
     */
    @Override
    public Double getWordSimilarity(String word1, String word2, int word2sense, String pos, SimilarityMeasure measure) {
        //JiangAndConrath var3 = jws.getJiangAndConrath();
        Double score = 0.0;
        TreeMap tm = new TreeMap();


        switch (measure) {
            case HirstStOnge:
                tm = hso.hso(word1, word2, word2sense, pos);
                break;

            case Leacock_Chodorow:
                tm = lch.lch(word1, word2, word2sense, pos);
                break;

            case Lesk:
                tm = adpleskwithhypo.lesk(word1, word2, word2sense, pos);
                break;

            case Resnik:
                tm = res.res(word1, word2, word2sense, pos);
                break;

            case Wu_Palmer:
                tm = wup.wup(word1, word2, word2sense, pos);
                break;

            case Jiang_Conrath:
                tm = jcn.jcn(word1, word2, word2sense, pos);
                break;

            case Lin:
                tm = lin.lin(word1, word2, word2sense, pos);
                break;

            case Path:
                tm = path.path(word1, word2, word2sense, pos);
                break;
            default:
                tm = adpleskwithouthypo.lesk(word1, word2, word2sense, pos);
                break;
        }
        String wordsense = MaxScoreSense(tm);
        score = (Double) tm.get(wordsense);
        System.out.println(wordsense);
        return score;
    }

    public String MaxScoreSense(TreeMap tm) {
        Double score = 0.0;
        String wordsense = null;
        Set set = tm.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            Double tempscore = (Double) me.getValue();
            if (score < tempscore) {
                score = tempscore;
                wordsense = (String) me.getKey();
            }
        }

        return wordsense;
    }


}
