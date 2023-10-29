package io.zipcoder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int petAmount = scanner.nextInt();
        if (petAmount <= 0) {
            System.out.println("Well then, have a good day!");
            return;
        }
        petInquirer(scanner, petAmount);

    }

    private static void petInquirer(Scanner scanner, int petAmount) {
        Pet[] petArray = new Pet[petAmount];
        System.out.println("What kind are each one of your pets? Also, give each one of their names right after...");
        System.out.println();
        for(int i = 1; i <= petAmount; i++) {
            System.out.print("For Pet " + i + ", give your kind of pet: ");
            String kindOfPet = scanner.next();
            System.out.println();
            System.out.print("Give the " + kindOfPet + "'s name: ");
            String nameOfPet = scanner.next();
            Pet pet = petParser(kindOfPet, nameOfPet);
            System.out.println();
            petArray[i - 1] = pet;
        }
        for (Pet i : petArray) {
            System.out.println("Kind of Pet: " + i.getClass().getSimpleName() + ", Name: " + i.getName() + ", Sound: " + i.speak());
        }
    }

    private static Pet petParser(String kindOfPet, String nameOfPet) {
        String kind = kindOfPet.toLowerCase().trim();

        switch(kind) {
            case ("dog") :
                return new Dog(nameOfPet);
            case ("cat") :
                return new Cat(nameOfPet);
            case ("hamster") :
                return new Hamster(nameOfPet);
            default :
                throw new IllegalArgumentException("Pet not allowed");
        }

    }

}