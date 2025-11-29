import java.util.Scanner;

public class switch_case {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("Select EB connection type:\n1. Domestic\n2. Commercial\nPlease enter your choice (1-2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter a number of units: ");
        double units = scanner.nextDouble();

        double totalAmount = 0;
        final double DRATE_A = 15, DRATE_B = 18.50, DRATE_C = 24, DRATE_D = 28;
        final double CRATE_A = 20, CRATE_B = 25, CRATE_C = 30, CRATE_D = 35;

        switch(choice){
            case 1:
                if(units <= 100){

                    totalAmount = units * DRATE_A;

                }else if(units <= 200){

                    totalAmount = (100 * DRATE_A) + ((units - 100) * DRATE_B);

                }else if(units <= 500){

                    totalAmount = (100 * DRATE_A) + (100 * DRATE_B) + ((units - 200) * DRATE_C);

                }else{

                    totalAmount = (100 * DRATE_A) + (100 * DRATE_B) + (300 * DRATE_C) + ((units - 500) * DRATE_D);

                }
                break;
            case 2:
                if(units <= 100){

                    totalAmount = units * CRATE_A;

                }else if(units <= 200){

                    totalAmount = (100 * CRATE_A) + ((units - 100) * CRATE_B);

                }else if(units <= 500){

                    totalAmount = (100 * CRATE_A) + (100 * CRATE_B) + ((units - 200) * CRATE_C);

                }else{

                    totalAmount = (100 * CRATE_A) + (100 * CRATE_B) + (300 * CRATE_C) + ((units - 500) * CRATE_D);

                }
                break;
            default:
                System.out.println("Invalid choice! Please select either 1 or 2.");
                return;
        }
        System.out.println("Bill Amount: Ksh " + totalAmount);
        System.out.println("-----------------------------------------------------------------------------------");
    }
    
}
