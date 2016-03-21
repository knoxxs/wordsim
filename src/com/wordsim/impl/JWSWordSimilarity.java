package com.wordsim.impl;

import com.wordsim.SimilarityMeasure;
import edu.sussex.nlp.jws.JWS;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by kumar on 21-03-2016.
 */
public class JWSWordSimilarity extends AbstractWordSimilarity {

    private final String wordnetpath = "C:/Program Files (x86)/WordNet";
    private final JWS jws;

    public JWSWordSimilarity() {
        jws = new JWS(wordnetpath, "2.1");
    }


    /***
     * similarity measure ka object banao and sahi metrics se initialize karo. fir  return object.objectname(functionname(1))
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

        //measure

        return super.getWordSimilarity(word1, word1sense, word2, word2sense, pos, measure);
    }

    @Override
    public Double getWordSimilarity(String word1, String word2, SimilarityMeasure measure) {
        return super.getWordSimilarity(word1, word2, measure);
    }


    /***
     * same lekin treemap return hoga.     abb tree map ka dekho
     *
     * @param word1
     * @param word2
     * @param word2sense
     * @param pos
     * @param measure
     * @return
     */
    @Override
    public Double getWordSimilarity(String word1, String word2, int word2sense, String pos, SimilarityMeasure measure) {

        Double score = 0.0;
        String wordsense = null;
        TreeMap tm = new TreeMap();

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

        System.out.println(wordsense);

        return score;
    }


    // TODO: 21-03-2016  jws may not be initialised,  throw exception?
    // JiangAndConrath var3 = jws.getJiangAndConrath();
    //System.out.println("Jiang & Conrath\n");


    // TreeMap var4 = var3.jcn("apple", "banana", "n");
    //Iterator var5 = var4.keySet().iterator();


/*

    private RelatednessCalculator getMeasure(SimilarityMeasure measure) {
        RelatednessCalculator rc = null;
        switch (measure) {
            case HirstStOnge:
                rc = new HirstStOnge(db);
                break;

            case Leacock_Chodorow:
                rc = new LeacockChodorow(db);
                break;

            case Lesk:
                rc = new Lesk(db);
                break;

            case Resnik:
                rc = new Resnik(db);
                break;

            case Wu_Palmer:
                rc = new WuPalmer(db);
                break;

            case Jiang_Conrath:
                rc = new JiangConrath(db);
                break;

            case Lin:
                rc = new Lin(db);
                break;

            case Path:
                rc = new Path(db);
                break;
        }
        return rc;
    }
*/

}
