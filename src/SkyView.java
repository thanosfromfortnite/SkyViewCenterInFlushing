public class SkyView {
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
