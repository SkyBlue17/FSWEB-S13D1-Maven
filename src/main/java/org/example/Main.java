package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
       if (0<=clock && clock<=23) {
           if (isBarking) {
               return clock < 8 || clock > 20;
           }
       }
       return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return 19 >= firstAge && 13 <= firstAge || 19 >= secondAge && 13 <= secondAge || 19 >= thirdAge && 13 <= thirdAge;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     if (isSummer) {
         return temp>=25 && temp<=45;
     }
     return temp>=25 && temp<=35;
    }

    public static double area(double width, double height) {
       if (width>=0 && height>=0) {
           return width*height;
       }
       return -1;
    }

    public static double area(double radius) {
       if (radius>=0) {
           return radius*radius*Math.PI;
       }
       return -1;
    }
}
