
package animal;

public class Dog extends Animal {
    
    public Dog() {
        super(15);
        System.out.println("A dog has been created.");
    }
    
    public void eat() {
        System.out.println("A dog is eating");
    }
    
    //public abstract eat();
    
    public void sleep() {
        System.out.println("A dog is sleeping");
    }
    
    public void ruff() {
        System.out.println("The dog says ruff");
    }
    
    public void run() {
        System.out.println("A dog is running");
    }
    
}
