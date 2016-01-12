
package animal;

public class Dog extends Animal {
    
    public Dog() {
        super(15);
        System.out.println("A dog has been created.");
    }
    
    public void ruff() {
        System.out.println("The dog says ruff");
    }
    
    public void run() {
        System.out.println("A dog is running");
    }
    
}
