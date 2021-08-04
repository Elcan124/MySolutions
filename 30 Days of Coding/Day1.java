import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
          int i1 = scan.nextInt();
        double d1 = scan.nextDouble();
        scan.nextLine();
  
        String s1 = scan.nextLine();

        int result1 = i + i1;
        double result2 = d + d1;
        String result3 = s + s1;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    


        scan.close();
    }
}
