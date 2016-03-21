/**
 * http://www.nltk.org/howto/wordnet.html
 * <p>
 * https://www.eecis.udel.edu/~trnka/CISC889-11S/lectures/greenbacker-WordNet-Similarity.pdf
 */
public enum SimilarityMeasure {

    /**
     * based on the shortest path that connects the senses (as above) and the maximum depth of the taxonomy in which
     * the senses occur. The relationship is given as -log(p/2d) where p is the shortest path length and d the
     * taxonomy depth.
     */
    Leacock_Chodorow("lch"),

    Wu_Palmer("wup"),;

//    hso, lch, lesk, res, wup, jcn, lin, path

    private String short_form;

    SimilarityMeasure(String short_form) {
        this.short_form = short_form;
    }

    public Object get_implementation_object(String implementation_name) {

    }
}
