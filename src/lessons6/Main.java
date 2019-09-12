package lessons6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        printSeason(Season.WINTER);
        Bird swallow = new Bird();
        Plane to154 = new Plane();
        Fish fish = new Fish();

        ArrayList<Flyable> flyers = new ArrayList<>();
        flyers.add(swallow);
        flyers.add((to154));
        flyers.add(fish);
        for (Flyable entity : flyers) {
            entity.sleep();
        }

        ArrayList<Etable> ettables = new ArrayList<>();
        ettables.add(fish);
        ettables.add(swallow);
        for (Etable entity : ettables) {
            entity.eat();
        }

        Season season = Season.WINTER;
    }

    public static void printSeason(Season season) {
        switch (season) {
            case AUTUM:
                System.out.println("The autum is c");
                break;
            case SPRING:
                System.out.println("The spring is c");
                break;
            case SUMMER:
                System.out.println("The summer is c");
                break;
            case WINTER:
                System.out.println("The winter is c");
                break;
        }
        System.out.println(season);
        System.out.println("Hello conflict!");
        System.out.println("Try again!");
    }
}
