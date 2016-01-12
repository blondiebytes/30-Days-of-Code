
package animal;

public class Cat extends Animal {
    
    public Cat() {
        super(7);
        System.out.println("A cat has been created");
    }
    
    public void meow() {
        System.out.println("A cat meows!");
    }
    
    public void prance() {
        System.out.println("A cat is prancing");
    }
    
}
