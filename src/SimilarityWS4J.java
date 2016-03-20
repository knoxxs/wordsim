import edu.cmu.lti.jawjaw.pobj.POS;
import edu.cmu.lti.lexical_db.ILexicalDatabase;
import edu.cmu.lti.lexical_db.NictWordNet;
import edu.cmu.lti.lexical_db.data.Concept;
import edu.cmu.lti.ws4j.Relatedness;
import edu.cmu.lti.ws4j.RelatednessCalculator;
import edu.cmu.lti.ws4j.impl.*;public RelatednessCalculator getmeasure(SimilarityMeasureMetrics measure)
        {
        ILexicalDatabase db = new NictWordNet();
        RelatednessCalculator rc = null;
        switch(measure)
        {
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

import edu.cmu.lti.ws4j.util.WS4JConfiguration;

public class SimilarityWS4J implements Similarity {


    @Override
    public Double getSimilarityWord(String word1, String word2, SimilarityMeasureMetrics measure) {
        WS4JConfiguration.getInstance().setMFS(true);
        RelatednessCalculator rc = getmeasure(measure);
        Double s = rc.calcRelatednessOfWords(word1, word2);
        System.out.println( rc.getClass().getName()+"\t"+s );
        return s;
    }

    public RelatednessCalculator getmeasure(SimilarityMeasureMetrics measure)
    {
        ILexicalDatabase db = new NictWordNet();
        RelatednessCalculator rc = null;
        switch(measure)
        {
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

    @Override
    public Relatedness getSimilarityWordSentence(String word1, String word2, String sentence1, String sentence2,
                                                 SimilarityMeasureMetrics measure) {

        return null;
    }

    @Override
    public Relatedness getSimilaritySynset(String word1, String word2, SimilarityMeasureMetrics measure) {

        return null;
    }

}
