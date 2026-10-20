import java.util.Scanner;

//Matteo Thomasson
//10/12/26
//Chooses pets based on the user's favorite color, season, and name.

public class Main {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        String color;
        String season;
        String name;

        //get a valid color
        while (true) {
            System.out.println("Enter your favorite color (red, blue, or green):");
            color = scan.nextLine().trim().toLowerCase();

            if (color.equals("red")|| color.equals("blue")
                || color.equals("green")) {
                break;
            }

            System.out.println("That isn't a valid color. Try again :(");
        }

        // get a valid season.
        while (true) {
            System.out.println("Enter your favorite season (winter, spring, summer, or fall):");
            season = scan.nextLine().trim().toLowerCase();

            if (season.equals("winter") || season.equals("spring")
                    || season.equals("summer") || season.equals("fall")) {
                        break;
                    }

                    System.out.println("That isn't a valid season. Try again pls.");
        }

        //make sure the name starts with a letter
        while (true) {
            System.out.println("enter your name buddy:");
            name = scan.nextLine().trim();

            if (!name.isEmpty()) {
                String first = name.substring(0,1).toLowerCase();

                if ("abcdefghijklmnopqrstuvwxyz".indexOf(first) != -1) {
                    break;
                }
            }

            System.out.println("Please enter a name starting with a letter.");
        }

        String first = name.substring(0,1).toLowerCase();
        boolean vowel = "aeiou".indexOf(first) != -1;
        boolean consonant = !vowel;

        String pet = "pet rock";

        // pick the pet based on the rules
        if (color.equals("blue") && season.equals("fall")) {
            pet = "alligator";
        } else if (color.equals("blue") && season.equals("spring")) {
            pet = "ostrich";
        } else if (color.equals("green") && season.equals("winter") && consonant) {
            pet = "giraffe";
        } else if (color.equals("green") && !season.equals("fall")) {
            pet = "dog";
        } else if (color.equals("red") && vowel) {
            pet = "porcupine";
        } else if (color.equals("red")) {
            pet = "panda";
        } else if (season.equals("summer")) {
            pet = "pony";
        } else if (color.equals("blue") && consonant && !season.equals("summer") && !season.equals("fall")) {
            pet = "axolotl";
        }

        System.out.println("your perfect pet is: " + pet);

        scan.close();
    }
}