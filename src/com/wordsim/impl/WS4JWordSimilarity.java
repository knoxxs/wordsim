package com.wordsim.impl;

import com.wordsim.SimilarityMeasure;
import edu.cmu.lti.lexical_db.ILexicalDatabase;
import edu.cmu.lti.lexical_db.NictWordNet;
import edu.cmu.lti.ws4j.RelatednessCalculator;
import edu.cmu.lti.ws4j.impl.*;
import edu.cmu.lti.ws4j.util.WS4JConfiguration;

public class WS4JWordSimilarity extends AbstractWordSimilarity {
    private final ILexicalDatabase db;

    public WS4JWordSimilarity() {
        WS4JConfiguration.getInstance().setMFS(true);
        db = new NictWordNet();
    }

    @Override
    public Double getWordSimilarity(String word1, String word2, SimilarityMeasure measure) {
        return getMeasure(measure).calcRelatednessOfWords(word1, word2);
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

}
