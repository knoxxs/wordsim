package com.wordsim.impl;

import edu.sussex.nlp.jws.JWS;
import edu.sussex.nlp.jws.JiangAndConrath;

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
        String wordnetpath = "C:/Users/kumar/git/wordsim/WordNet";
        JWS jws = new JWS(wordnetpath, "2.1");
        JiangAndConrath var3 = jws.getJiangAndConrath();
        System.out.println("Jiang & Conrath\n");
        Double s = var3.jcn("bank", 1, "river", 1, "n");
        System.out.print(s);

    }


}
