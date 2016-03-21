package com.wordsim;

/**
 * https://github.com/scupid-admin/altin/issues/51
 */
public enum SimilarityMeasure {

    /**
     * the shortest path that connects the senses in the is-a (hypernym/hypnoym) taxonomy
     */
    Path("path"),

    /**
     * based on the shortest path that connects the senses (as above) and the maximum depth of the taxonomy in which
     * the senses occur. The relationship is given as -log(p/2d) where p is the shortest path length and d the
     * taxonomy depth.
     */
    Leacock_Chodorow("lch"),

    /**
     * based on the depth of the two senses in the taxonomy and that of their Least Common Subsumer (most specific
     * ancestor node)
     */
    Wu_Palmer("wup"),

    /**
     * based on the Information Content (IC) of the Least Common Subsumer (most specific ancestor node)
     * <p>
     * simResnik(c1, c2) = − log P(LCS(c1, c2))
     * <p>
     * P(c) = Summation of count(w) for w∈set of words subsumed by concept c / the number of words in corpus and also
     * in thesaurus
     */
    Resnik("res"),

    /**
     * based on the Information Content (IC) of the Least Common Subsumer (most specific ancestor node) and that of
     * the two input Synsets.
     * <p>
     * The relationship is given by the equation 2 * IC(lcs) / (IC(s1) + IC(s2)).
     */
    Lin("lin"),

    /**
     * based on the Information Content (IC) of the Least Common Subsumer (most specific ancestor node) and that of
     * the two input Synsets.
     * <p>
     * The relationship is given by the equation 1 / (IC(s1) + IC(s2) - 2 * IC(lcs)).
     */
    Jiang_Conrath("jcn"),

    /**
     * Extends Lesk algorithm for word sense disambiguation. Makes use of glosses, a property of dictionaries.
     * <p>
     * simeLesk(c1, c2) = overlap(gloss(r(c1)), gloss(q(c2))) for r,q∈ set of possible WordNet relations
     */
    Lesk("lesk"),


    HirstStOnge("hso");

    private final String short_form;

    SimilarityMeasure(String short_form) {
        this.short_form = short_form;
    }

    public String getShort_form() {
        return short_form;
    }
}
