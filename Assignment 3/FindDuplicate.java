/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Janine Yanes, jqy2@scarletmail.rutgers.edu, jqy2
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {

		int n = args.length; 
    	int[] nums = new int[n];
		int count = 0;
		int search = 0;
		int test = 0;
    	for (int i = 0; i < n; i++) nums [i] = Integer.parseInt(args[i]);
		for (int i = 0; i < nums.length; i++) {
			search += 1;
			for (int j = 0; j < nums.length; j++) {
			if (search == nums[j]) count += 1;
			if (count > 1) test = count;
			}
			count = 0;
		}
		System.out.println(test > 1);
	}
}
