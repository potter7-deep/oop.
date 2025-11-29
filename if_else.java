import java.util.Scanner;

public class if_else {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("Enter a number of units: ");
            double units = scanner.nextDouble();

            final double rate1 = 15, rate2 = 18.50, rate3 = 24, rate4 = 28;

            double totalAmount;


            if(units <= 100){

                totalAmount = units * rate1;

            }else if(units <= 200){

                totalAmount = (100 * rate1) + ((units - 100) * rate2);

            }else if(units <= 500){

                totalAmount = (100 * rate1) + (100 * rate2) + ((units - 200) * rate3);

            }else{

                totalAmount = (100 * rate1) + (100 * rate2) + (300 * rate3) + ((units - 500) * rate4);
            }

            System.out.println("Total amount payable: " + totalAmount);
            System.out.println("-----------------------------------------------------------------------------------");
        
    }
}