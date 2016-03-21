package com.wordsim.impl;

import edu.sussex.nlp.jws.JWS;
import edu.sussex.nlp.jws.JiangAndConrath;

/**
 * Created by kumar on 21-03-2016.
 */
public class DemoJWS {

    public static void main(String args[]) {
        String wordnetpath = "C:/Program Files (x86)/WordNet";
        JWS jws = new JWS(wordnetpath, "2.1");
        JiangAndConrath var3 = jws.getJiangAndConrath();
        System.out.println("Jiang & Conrath\n");
        Double s = var3.jcn("bank", 1, "river", 1, "n");
        System.out.print(s);

    }


}
