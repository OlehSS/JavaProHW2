package work.space3.project;

import java.awt.*;

public class Bike {

    private String bikeName;
    private BikeClasses bikeClasses;
    private int speed;
    private String color;
    private int price;

    public Bike(String bikeName, BikeClasses bikeClasses, int speed, String color, int price) {
        this.bikeName = bikeName;
        this.bikeClasses = bikeClasses;
        this.speed = speed;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeName='" + bikeName + '\'' +
                ", bikeClasses=" + bikeClasses +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
