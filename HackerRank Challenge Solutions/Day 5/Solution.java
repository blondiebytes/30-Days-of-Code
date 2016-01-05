public class Person {
  
    int age;	
	public Person(int initial_Age) {
  		// Add some more code to run some checks on initial_Age
            if(initial_Age < 0){
                System.out.println("This person is not valid, setting age to 0."); 
                this.age = 0;
            }else{
             
                 this.age = initial_Age;   
            }    
    }

	public void amIOld() {
  		// Do some computations in here and print out the correct statement to the console 
        // using System.out.println()...
            
            if(this.age < 13){
                System.out.println("You are young.");
            }else{
                if(this.age <18 ){
                    System.out.println("You are a teenager.");
                }else{
                    System.out.println("You are old.");
                }
            }
        }

	public void yearPasses() {
  		// Increment the age of the person in here
        this.age = this.age + 1;
	}

