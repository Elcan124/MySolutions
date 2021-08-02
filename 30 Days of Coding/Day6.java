
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     char[] chars = new char[10000];
     String [] sArr = new String[t];
     String [] sArrEven = new String[t];
     String[] sArrOdd = new String [t];
        for (int i = 0; i < t; i++) {
            sArr[i]= sc.next();
        }
        for (int i = 0; i < t; i++) {
            sArrEven[i] = "";
            sArrOdd[i] = "";
            
        }
        for (int i = 0; i < t; i++) {
            
            for (int j = 0; j <sArr[i].length(); j++) {
               
                if(j%2==0||j==0){
                 sArrEven[i]= sArrEven[i]+sArr[i].charAt(j);}
                else if(!(j%2==0)){
                    sArrOdd[i]= sArrOdd[i] + sArr[i].charAt(j);
                }
                
            }}
            for (int j = 0; j < t; j++) {
               
                 System.out.println(sArrEven[j]+" "+sArrOdd[j]);
           
            }
            
        }
        
     
    }
