import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // WEIGHT CONVERSION PROGRAM


        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert gram to kgs");
        System.out.println("2: Convert kgs to gram");

        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("Enter the weight in gram: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.001;
            System.out.println("The new weight in kgs is: " + newWeight + "Kg");
        }
        else if (choice == 2) {
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 1000;
            System.out.println("The new weight in gram is: " + newWeight + "gram");

        }
        else{
            System.out.println("That was not a valid choice!");
        }


        scanner.close();
    }
}
