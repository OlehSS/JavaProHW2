package work.space3;

import work.space3.project.Bike;
import work.space3.project.BikeClasses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Bike bike1 = new Bike("Canyon Griz", BikeClasses.MOUNTAIN, 20, "Grey", 4000);
        Bike bike2 = new Bike("BMX Capriolo", BikeClasses.FOR_CHILDREN, 14, "Colored", 1200);
        Bike bike3 = new Bike("Kross Hexagon", BikeClasses.HIGHWAY, 35, "Black", 1700);

        Bike[] bikes = {bike1, bike2, bike3};

        System.out.println(Arrays.toString(bikes));

        // Ответ на вопрос когда что превращается в строку: то что мы переписали в классе Bike изменяет вывод в строку
        // самого класса Bike, а Arrays.toString переводит в строку массив.
    }
}
