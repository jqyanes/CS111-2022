/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Janine Yanes, jqy2@scarletmail.rutgers.edu, jqy2
 *
 *************************************************************************/

public class PolygonTransform {

    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
        double[] a = new double[array.length];
        for (int i = 0; i < array.length; i++) a[i] = array[i];
        return a;
        }
        
        // Scales the given polygon by the factor alpha. 
        public static void scale(double[] x, double[] y, double alpha) {
      for (int i = 0; i < x.length; i++) x[i] = (x[i] * alpha);
        for (int i = 0; i < y.length; i++) y[i] = (y[i] * alpha);
        }
        
        // Translates the given polygon by (dx, dy). 
        public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) x[i] = (x[i] + dx);
        for (int i = 0; i < y.length; i++) y[i] = (y[i] + dy);
        }
        
        // Rotates the given polygon theta degrees counterclockwise, about the origin. 
        public static void rotate(double[] x, double[] y, double theta) {
        double thetaRadians = ((theta / 360) * (2 * Math.PI));
        double[] x2 = new double[x.length];
        for (int i = 0; i < x.length; i++) x2[i] = x[i];
        for (int i = 0; i < x.length; i++) x[i] = ((x[i] * Math.cos(thetaRadians)) - (y[i] * Math.sin(thetaRadians)));
        for (int i = 0; i < y.length; i++) y[i] = ((y[i] * Math.cos(thetaRadians)) + (x2[i] * Math.sin(thetaRadians)));
        }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
    }
}
