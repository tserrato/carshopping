import java.util.Scanner;

import java.util.Scanner;

public class main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int totalCost = 0;
        totalCost += base();
        totalCost += options();

        System.out.println("Your total cost is :" + totalCost);

    }

    public static int base() {
        System.out.println("Our inventory:");
        System.out.println("Model 1 - $15,000");
        System.out.println("Model 2 - $24,000");
        System.out.println("Model 3 - $40,000");
        System.out.println("Which base model did the customer choose? " + "(enter full model name) > ");
        String model = in.nextLine();
        switch (model.toLowerCase()) {
            case "model 1":
            return 15000;

                
            case "model 2":
            return 24000;

                
            case "model 3":
            return 40000;

                
            default:
            return -1;
        }
    }

    public static int options() {
        System.out.println("1 -Remote Start- $1000");
        System.out.println("2 -OnStar- $1000");
        System.out.println("3 -ABS- $500");
        System.out.println("4 -Adjustable Controls- $1000");
        System.out.println("5 -Sunroof- $800");
        System.out.println("6 -Cold Weather- $1500");
        System.out.println("7 -GPS- $1500");
        System.out.println("Which would you like to add? " + "(enter number) > ");
        int addOn = in.nextInt();
        switch (addOn) {
            case 1:
            return 1000;

                
            case 2:
            return 1000;

                
            case 3:
            return 500;

            case 4:
            return 1000;

                
            case 5:
            return 800;

                
            case 6:
            return 1500;

            case 7:
            return 1500;

                
            default:
            return -1;
        
        }
    }
}