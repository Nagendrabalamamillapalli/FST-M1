package Activities;

public class Car {
    String color;
     String transmission;
    int make;
    int tyres;
    int doors;
    public Car() {
        tyres = 5;  // Set the initial value for the class attribute
        doors = 4;

    }
    public void displayCharacterstics(){
        System.out.println("Color of the car is " +color);
        System.out.println("Trasmission of the car is " +transmission);
        System.out.println("Makes of the car is " +make);
        System.out.println("Tyres of the car is " +tyres);
        System.out.println("Doors of the car is " +doors);

    }
    public void accelarate(){
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }
}
