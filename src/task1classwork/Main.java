package task1classwork;

import classwork.SwimAble;

public class Main {
    public static void main(String[] args) {
        SwimAble[] ocean = {
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Shark(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Duck(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle()
        };

        for (SwimAble oceans : ocean){
            oceans.swim();
        }
    }
}
