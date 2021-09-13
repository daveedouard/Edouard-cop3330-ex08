/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex08;

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = input.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = input.nextInt();

        int split = (slices*pizzas)/people;
        int remainder = (slices*pizzas)%people;

        System.out.print(people+" people with "+pizzas+" pizzas ("+(slices*pizzas)+" slices)\nEach person gets "+split+" pieces of pizza.\nThere are "+remainder+" leftover pieces.");


    }
}
