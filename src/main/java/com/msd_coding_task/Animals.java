package com.msd_coding_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3.  Inside of a main function (so we can run the function):
 * *   Create an instance of a list that contains the following strings:
 * <p>
 * i.      Bird, Cat, Dog, Tiger, Elephant
 * <p>
 * *   Call a function to iterate through the list and return all animals with more than 3 letters
 * *   Print the list to console
 * 1.  Inside of a main function (so we can run the function):
 * *   Create an instance of a list that contains the following integers:
 * <p>
 * i.      1, 5, 8, 10, 14
 * <p>
 * *   Call a function to iterate through the list and return a Boolean if a given integer is present
 * <p>
 * i.      Example: true if looking for 5, false if looking for 3
 * <p>
 * *   Print the Boolean
 */
public class Animals {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>(Arrays.asList("Bird", "Cat", "Dog", "Tiger", "Elephant"));
        findAnimals(animals);
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 5, 8, 10, 14));
        findInteger(numbers, 6);

    }

    public static void findAnimals(List<String> animals) {
        List<String> animalsMoreThanThree = new ArrayList<>();
        for (String each : animals) {
            if (each.length() > 3) {
                animalsMoreThanThree.add(each);
            }
        }
        System.out.println((animalsMoreThanThree));

    }

    public static void findInteger(List<Integer> numbers, int value) {
        Boolean found = false;
        for (Integer each : numbers) {
            if (each == value) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}

