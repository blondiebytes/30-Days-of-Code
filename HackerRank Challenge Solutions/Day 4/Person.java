  import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class Person {
  
  		int age;
  
		public Person(int initialAgeOfPerson) {
  			// Add some more code to run some checks on initialAgeOfPerson,
        	// before setting its value to age
            if (initialAgeOfPerson < 0) {
            	System.out.println("This person is not valid, setting age to 0.");
                age = 0;
            } else {
            	age = initialAgeOfPerson;
			}
		}

		public void amIOld() {
  			// Do some computations in here and print out 
            // the correct statement to the console 
        	// using System.out.println()...
            if (age < 13) {
            	System.out.println("You are young.");
            } else if (age >= 13 && age < 18) {
            	System.out.println("You are a teenager.");
            } else {
            	System.out.println("You are old.");
            }
            
		}

		public void yearPasses() {
  			// Increment the age of the person in here
            age++;
		}
    
		public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int numberOfTestCases = sc.nextInt();
      		for (int i = 0; i < numberOfTestCases; i++) {
        		int age = sc.nextInt();
          		Person p = new Person(age);
          		p.amIOld();
          		for (int j = 0; j < 3; j++) {
            		p.yearPasses();
          		}
          		p.amIOld();
                System.out.println();
        	}
        }
    }