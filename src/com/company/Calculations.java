package com.company;

public class Calculations {

    public static void generateException(int run){

        int a;
        int numbers[] = new int[2];
        System.out.println("Input value " + run);

        try{

            switch(run){
                case 0: a = 10/run;     break;
                case 1: numbers[4] = 4; break;
                case 2: return;
            }

        }catch (ArithmeticException e){

            System.out.println("You cannot divide by zero");
            return;

        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("There is no such index in the array ");

        }finally {

            System.out.println("This code will always be executed ");
        }
    }

}
