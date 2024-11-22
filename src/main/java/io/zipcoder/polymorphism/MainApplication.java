package io.zipcoder.polymorphism;

import io.zipcoder.pets.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

        // Method to ask the user for input with a custom prompt
        public static int getUserInt(Scanner scanner, String prompt) {
            System.out.println(prompt);
            int input = scanner.nextInt();
            scanner.nextLine();
            return input;
        }

        public static String getUserString(Scanner scanner, String prompt) {
            System.out.println(prompt);
            return scanner.nextLine();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Pet> pets = new ArrayList<>();

            int numOfPets = getUserInt(scanner, "How many pets do you have?");
            System.out.println("You have " + numOfPets + " pets.");
            if (numOfPets == 0) {
                System.out.println("You must hate animals.");
            } else if (numOfPets > 0) {
                for (int i = 1; i <= numOfPets; i++) {
                    System.out.println("Tell me about Pet #" + i + ".");
                    String petType = getUserString(scanner, "What kind of pet are they?");
                    String petName = getUserString(scanner, "What is their name?");
                    Pet pet = new Pet(petType, petName);
                    pets.add(pet);
                }

            } //need to figure out negative value error
            System.out.println("You have the following pets:");
            for (Pet pet : pets) {
                System.out.println("Pet type: " + pet.getType() + ", Pet name: " + pet.getName());
            }

            scanner.close();
        }
}
