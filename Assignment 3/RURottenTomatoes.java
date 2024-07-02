/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Janine Yanes, jqy2@scarletmail.rutgers.edu, jqy2
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

    	int reviewers = Integer.parseInt(args[0]);
    	int movies = Integer.parseInt(args[1]);
   		int[][] ratings = new int[reviewers][movies];
		int count = 0;
		for (int r = 0; r < ratings.length; r++) {
			for (int m = 0; m < ratings[r].length; m++){
				ratings[r][m] = Integer.parseInt(args[count + 2]);
				count++;
			}
		}
		int bestMovie = 0;
		int bestMovieIndex = 0;
		int movieSum = 0;
		for (int m = 0; m < ratings[0].length; m++){
		for (int r = 0; r < ratings.length; r++) {
			movieSum += ratings[r][m];
		}
		if (movieSum > bestMovie) {
			bestMovie = movieSum;
			bestMovieIndex = m;
		}
		movieSum = 0;
		}
		System.out.println(bestMovieIndex);
		}	
}
