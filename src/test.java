public class test {
    public static void main(String args[]) {
        SimilarityWS4J s = new SimilarityWS4J();

        s.getSimilarityWord("bank", "bank", SimilarityMeasureMetrics.hso);
    }

}