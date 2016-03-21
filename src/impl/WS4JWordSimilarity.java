package impl;

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
    public Double getWordSimilarity(String word1, String word2, SimilarityMeasureMetrics measure) {
        return getMeasure(measure).calcRelatednessOfWords(word1, word2);
    }

    private RelatednessCalculator getMeasure(SimilarityMeasureMetrics measure) {
        RelatednessCalculator rc = null;
        switch (measure) {
            case hso:
                rc = new HirstStOnge(db);
                break;

            case lch:
                rc = new LeacockChodorow(db);
                break;

            case lesk:
                rc = new Lesk(db);
                break;

            case res:
                rc = new Resnik(db);
                break;

            case wup:
                rc = new WuPalmer(db);
                break;

            case jcn:
                rc = new JiangConrath(db);
                break;

            case lin:
                rc = new Lin(db);
                break;

            case path:
                rc = new Path(db);
                break;
        }
        return rc;
    }

}
