package Activities;


import java.time.LocalDateTime;
import java.util.ArrayList;

class Plane {
    private int maxPassengers;
    private ArrayList<String> passengers;
    private LocalDateTime lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<String>();
    }

    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Sorry, the plane is full.");
        }
    }

    public LocalDateTime takeOff() {
        return LocalDateTime.now();
    }

    public void land() {
        lastTimeLanded = LocalDateTime.now();
        passengers.clear();
    }

    public LocalDateTime getLastTimeLanded() {
        return lastTimeLanded;
    }

    public ArrayList<String> getPassengers() {
        return passengers;
    }
}

public class Activity6 {
            public static void main(String[] args) throws InterruptedException {
            Plane plane = new Plane(10);

            plane.onboard("Alice");
            plane.onboard("Bob");
            plane.onboard("Charlie");
            plane.onboard("David");

            System.out.println("Take-off time: " + plane.takeOff());

            System.out.println("Passengers:");
            for (String passenger : plane.getPassengers()) {
                System.out.println(passenger);
            }

            Thread.sleep(5000);

            plane.land();

            System.out.println("Landing time: " + plane.getLastTimeLanded());
        }
    }


