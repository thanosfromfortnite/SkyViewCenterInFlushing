public class SkyView {
        /*
      JESSE HAN
      MR FOLWELL
      PD 4/5 AP JAVA
      DONUT STEEL
       */
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols]; int pos = 0;

        for (int i = 0; i < view.length; i ++) {
            if (i % 2 == 0) {
                for (int j = 0; j < view[i].length; j ++) {
                    view[i][j] = scanned[pos];
                    pos ++;
                }
            }
            else {
                for (int j = view[i].length - 1; j >= 0; j --) {
                    view[i][j] = scanned[pos];
                    pos ++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double total = 0.0; int numCounted = 0;

        for (int i = startRow; i <= endRow; i ++) {
            for (int j = startCol; j <= endCol; j ++) {
                total += this.view[i][j]; numCounted ++;
            }
        }
        return (double) (total / numCounted);
    }
}
/*
    We're talking away
    I don't know what
    I'm to say I'll say it anyway
    Today's another day to find you
    Shying away
    I'll be coming for your love, okay?
    Take on me (take on me)
    Take me on (take on me)
    I'll be gone
    In a day or two
    So needless to say
    I'm odds and ends
    But I'll be stumbling away
    Slowly learning that life is okay
    Say after me
    It's no better to be safe than sorry
    Take on me (take on me)
    Take me on (take on me)
    I'll be gone
    In a day or two
 */