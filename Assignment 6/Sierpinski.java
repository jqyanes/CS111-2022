/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author: Janine Yanes, jqy2@scarletmail.rutgers.edu, jqy2
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {

	// WRITE YOUR CODE HERE
    double aSquared = Math.pow(length/2, 2);
    double cSquared = Math.pow(length, 2);
    if (length >= 0) return Math.pow(cSquared - aSquared, 0.5);
    else return (0 - Math.pow(cSquared - aSquared, 0.5));
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {

	// WRITE YOUR CODE HERE
    double[] xCoords = {x, x + (length/2), x - (length/2)};
    double[] yCoords = {y, y + height(length), y + height(length)};
    StdDraw.filledPolygon(xCoords, yCoords);
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {

	// WRITE YOUR CODE HERE
    filledTriangle(x, y, length);
    if (n <= 1) return;
    sierpinski(n - 1, x - length/2, y, length/2);
    sierpinski(n - 1, x + length/2, y, length/2);
    sierpinski(n - 1, x, y + height(length), length/2);
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {

	// WRITE YOUR CODE HERE 
    double[] x = {0, 1, 0.5};
    double[] y = {0, 0, height(1)};
    StdDraw.polygon(x, y);
    int n = Integer.parseInt(args[0]);
    sierpinski(n, 0.5, 0, 0.5);
    }
}
