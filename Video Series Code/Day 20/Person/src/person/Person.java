/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import static person.HairColor.*;

/**
 *
 * @author kathrynhodge
 */
public class Person {
    
    HairColor hairColor = BLACK;
    
    public Person() {
        int a = 5;
    }
    
    public static void main(String[] args) {
       Person peterParker = new Person();
       Person spiderMan = peterParker;
       
       spiderMan.hairColor = PINK;
       
       System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);
       System.out.println("Hair Color of Spiderman: " + spiderMan.hairColor);
    }
    
}
