
package car;

/**
 *
 * @author kathrynhodge
 */
public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
   
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    
    // f(x,y,z) = x + 1/z - y;
    // Say x = 5;
    // f(5) = 5 + 1 = 6;
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    
    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }
    
    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
    
    public void getIn() {
        // numberOfPeopleInCar = numberOfPeopleInCar + 1;
        numberOfPeopleInCar++;
    }
    
    public void getOut() {
      //  numberOfPeopleInCar = numberOfPeopleInCar - 1;
        numberOfPeopleInCar--;
    }
    
    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }
   
    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       Car birthdayPresent = new Car(500, 5000.545, true);
        System.out.println("Birthday Car v1");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles Left:" + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles:" + birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday Car v2");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday Car v3");
        birthdayPresent.printVariables();
        
        
//        System.out.println("Christmas Car");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();
    }
    
}
