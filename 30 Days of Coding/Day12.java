//Problem--------------https://www.hackerrank.com/challenges/30-inheritance/problem
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	    private int[] testScores;
        
    
    
    
    public Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName, lastName, id);
        this.testScores = testScores;
        }
   public Character calculate(){
       char grade;
       int sum = 0;
       int avg;
       for (int i = 0; i < testScores.length; i++) {
           sum = testScores[i]+sum ;
       }
       avg = sum/testScores.length;
       if(avg>=90 && avg<=100) grade = 'O';
       else if (avg >=80&& avg<90) grade = 'E';
       else if (avg>=70 && avg<80) grade = 'A';
       else if (avg>=55 && avg <70) grade = 'P';
       else if (avg >=40 && avg <55) grade = 'D';
       else grade = 'T';
       
       
       
       
       return grade;
   }
    
    
  
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
