import java.util.Scanner;

public class invoice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        // input of BILL TO details.
        System.out.print("Please enter the Bill To details: \n");
        System.out.print("Name: ");
        String bill_to_name = scanner.nextLine();

        System.out.print("Address: ");
        String bill_to_address = scanner.nextLine();

        System.out.print("City, State, ZIP: ");
        String bill_to_city = scanner.nextLine();

        System.out.print("GSTIN: ");
        String bill_to_gstin = scanner.nextLine();

        System.out.print("Contact: ");
        String bill_to_contact = scanner.nextLine();

        System.out.print("Email: ");
        String bill_to_email = scanner.nextLine();

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        // input of SHIP TO details.
        System.out.print("Please enter the Ship To details: \n");
        System.out.print("Name: ");
        String ship_to_name = scanner.nextLine();

        System.out.print("Address: ");
        String ship_to_address = scanner.nextLine();

        System.out.print("City, State, ZIP: ");
        String ship_to_city = scanner.nextLine();

        System.out.print("GSTIN: ");
        String ship_to_gstin = scanner.nextLine();

        System.out.print("Contact: ");
        String ship_to_contact = scanner.nextLine();

        System.out.print("Email: ");
        String ship_to_email = scanner.nextLine();

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        // input of PRODUCT 1 details.
        System.out.println("***************************************************** PRODUCT 1 ****************************************************");
        System.out.println("Please enter the product details: ");
        System.out.print("Enter Product code: ");
        int product_1_code = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product name: ");
        String product_1_name = scanner.nextLine();

        System.out.print("Enter HSN code: ");
        int product_1_hsn = scanner.nextInt();

        System.out.print("Enter Quantity: ");
        double product_1_quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Units: ");
        String product_1_units = scanner.nextLine();

        System.out.print("Enter Rate: ");
        double product_1_rate = scanner.nextDouble();

        System.out.print("Enter Tax(%): ");
        double product_1_tax = scanner.nextDouble();

        // calculations for PRODUCT 1
        double product_1_total = (product_1_quantity * product_1_rate);
        double product_1_tax_amount = (product_1_total * (product_1_tax/100));
        double product_1_amount = product_1_total + product_1_tax_amount;
        scanner.nextLine();

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        // input of PRODUCT 2 details.
        System.out.println("***************************************************** PRODUCT 2 ****************************************************");

        System.out.println("Please enter the product details: ");
        System.out.print("Enter Product code: ");
        int product_2_code = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product name: ");
        String product_2_name = scanner.nextLine();



        System.out.print("Enter HSN code: ");
        int product_2_hsn = scanner.nextInt();

        System.out.print("Enter Quantity: ");
        double product_2_quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Units: ");
        String product_2_units = scanner.nextLine();

        System.out.print("Enter Rate: ");
        double product_2_rate = scanner.nextDouble();

        System.out.print("Enter Tax(%): ");
        double product_2_tax = scanner.nextDouble();

        // calculations for PRODUCT 2
        double product_2_total = (product_2_quantity * product_2_rate);
        double product_2_tax_amount = (product_2_total * (product_2_tax/100));
        double product_2_amount = product_2_total + product_2_tax_amount;
        scanner.nextLine();

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        // input of PRODUCT 3 details.
        System.out.println("***************************************************** PRODUCT 3 ****************************************************");
        System.out.println("Please enter the product details: ");
        System.out.print("Enter Product code: ");
        int product_3_code = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product name: ");
        String product_3_name = scanner.nextLine();

        System.out.print("Enter HSN code: ");
        int product_3_hsn = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Quantity: ");
        double product_3_quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Units: ");
        String product_3_units = scanner.nextLine();

        System.out.print("Enter Rate: ");
        double product_3_rate = scanner.nextDouble();

        System.out.print("Enter Tax(%): ");
        double product_3_tax = scanner.nextDouble();

        // calculations for PRODUCT 3
        double product_3_total = (product_3_quantity * product_3_rate);
        double product_3_tax_amount = (product_3_total * (product_3_tax/100));
        double product_3_amount = product_3_total + product_3_tax_amount;
        scanner.nextLine();

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        // input of PRODUCT 4 details.
        System.out.println("***************************************************** PRODUCT 4 ****************************************************");
        System.out.println("Please enter the product details: ");
        System.out.print("Enter Product code: ");
        int product_4_code = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product name: ");
        String product_4_name = scanner.nextLine();

        System.out.print("Enter HSN code: ");
        int product_4_hsn = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Quantity: ");
        double product_4_quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Units: ");
        String product_4_units = scanner.nextLine();

        System.out.print("Enter Rate: ");
        double product_4_rate = scanner.nextDouble();

        System.out.print("Enter Tax(%): ");
        double product_4_tax = scanner.nextDouble();

        // calculations for PRODUCT 4
        double product_4_total = (product_4_quantity * product_4_rate);
        double product_4_tax_amount = (product_4_total * (product_4_tax/100));
        double product_4_amount = product_4_total + product_4_tax_amount;
        scanner.nextLine();

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        // input of PRODUCT 5 details.
        System.out.println("***************************************************** PRODUCT 5 ****************************************************");
        System.out.println("Please enter the product details: ");
        System.out.print("Enter Product code: ");
        int product_5_code = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product name: ");
        String product_5_name = scanner.nextLine();

        System.out.print("Enter HSN code: ");
        int product_5_hsn = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Quantity: ");
        double product_5_quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Units: ");
        String product_5_units = scanner.nextLine();

        System.out.print("Enter Rate: ");
        double product_5_rate = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Tax(%): ");
        double product_5_tax = scanner.nextDouble();
        scanner.nextLine();

        // calculations for PRODUCT 5
        double product_5_total = (product_5_quantity * product_5_rate);
        double product_5_tax_amount = (product_5_total * (product_5_tax/100));
        double product_5_amount = product_5_total + product_5_tax_amount;
        scanner.nextLine();

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        // input of PRODUCT 6 details.
        System.out.println("***************************************************** PRODUCT 6 ****************************************************");
        System.out.println("Please enter the product details: ");
        System.out.print("Enter Product code: ");
        int product_6_code = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product name: ");
        String product_6_name = scanner.nextLine();

        System.out.print("Enter HSN code: ");
        int product_6_hsn = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Quantity: ");
        double product_6_quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Units: ");
        String product_6_units = scanner.nextLine();

        System.out.print("Enter Rate: ");
        double product_6_rate = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Tax(%): ");
        double product_6_tax = scanner.nextDouble();
        scanner.nextLine();

        // calculations for PRODUCT 6
        double product_6_total = (product_6_quantity * product_6_rate);
        double product_6_tax_amount = (product_6_total * (product_6_tax/100));
        double product_6_amount = product_6_total + product_6_tax_amount;
        scanner.nextLine();

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        // input of PRODUCT 7 details.
        System.out.println("***************************************************** PRODUCT 7 ****************************************************");

        System.out.println("Please enter the product details: ");
        System.out.print("Enter Product code: ");
        int product_7_code = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Product name: ");
        String product_7_name = scanner.nextLine();

        System.out.print("Enter HSN code: ");
        int product_7_hsn = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Quantity: ");
        double product_7_quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Units: ");
        String product_7_units = scanner.nextLine();

        System.out.print("Enter Rate: ");
        double product_7_rate = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Tax(%): ");
        double product_7_tax = scanner.nextDouble();
        scanner.nextLine();

        // calculations for PRODUCT 7
        double product_7_total = (product_7_quantity * product_7_rate);
        double product_7_tax_amount = (product_7_total * (product_7_tax/100));
        double product_7_amount = product_7_total + product_7_tax_amount;
        scanner.nextLine();

        System.out.println("--------------------------------------------------------------------------------------------------------------------");

        // SUBTOTAL, DISCOUNT AND GRAND TOTAL calculations
        double sub_amount = product_1_amount + product_2_amount + product_3_amount + product_4_amount + product_5_amount + product_6_amount + product_7_amount;

        float discount = (0.6368f/100);
        double discount_amount = sub_amount * discount;

        double grand_total = sub_amount - discount_amount;



        // OUTPUT OF THE INVOICE
        System.out.println("\n\nBill To:                                                         Ship To:");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-65s %-54s||", bill_to_name, ship_to_name);
        System.out.printf("\n%-65s %-54s||", bill_to_address, ship_to_address);
        System.out.printf("\n%-65s %-54s||", bill_to_city, ship_to_city);
        System.out.printf("\n%-65s %-54s||", bill_to_gstin, ship_to_gstin);
        System.out.printf("\n%-65s %-54s||", bill_to_contact, ship_to_contact);
        System.out.printf("\n%-65s %-54s||", bill_to_email, ship_to_email);
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("      Payment Date: & days from date of delivery                  Payment terms: 100% against invoice");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("S.No  ||  Product Code  ||   Product Name     ||  HSN code  ||  Quantity  ||  Units  ||   Rate   ||  Tax  ||   Amount   ||");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("  1   ||  %-12d  ||  %-16s  ||  %-8d  ||  %-8.0f  ||  %-5s  ||  %-4.2f  ||  %-3.0f  ||  %-5.2f  ||%n", product_1_code, product_1_name, product_1_hsn, 
        product_1_quantity, product_1_units, product_1_rate, product_1_tax, product_1_amount);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("  2   ||  %-12d  ||  %-16s  ||  %-8d  ||  %-8.0f  ||  %-5s  ||   %-5.2f  ||  %-3.0f  ||  %-8.2f  ||%n", product_2_code, product_2_name, product_2_hsn, 
        product_2_quantity, product_2_units, product_2_rate, product_2_tax, product_2_amount);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("  3   ||  %-12d  ||  %-16s  ||  %-8d  ||  %-8.0f  ||  %-5s  ||   %-5.2f  ||  %-3.0f  ||  %-8.2f  ||%n", product_3_code, product_3_name, product_3_hsn, 
        product_3_quantity, product_3_units, product_3_rate, product_3_tax, product_3_amount);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("  4   ||  %-12d  ||  %-16s  ||  %-8d  ||  %-8.0f  ||  %-5s  ||   %-5.2f  ||  %-3.0f  ||  %-8.2f  ||%n", product_4_code, product_4_name, product_4_hsn, 
        product_4_quantity, product_4_units, product_4_rate, product_4_tax, product_4_amount);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("  5   ||  %-12d  ||  %-16s  ||  %-8d  ||  %-8.0f  ||  %-5s  ||   %-5.2f  ||  %-3.0f  ||  %-8.2f  ||%n", product_5_code, product_5_name, product_5_hsn, 
        product_5_quantity, product_5_units, product_5_rate, product_5_tax, product_5_amount);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("  6   ||  %-12d  ||  %-16s  ||  %-8d  ||  %-8.0f  ||  %-5s  ||   %-5.2f  ||  %-3.0f  ||  %-8.2f  ||%n", product_6_code, product_6_name, product_6_hsn, 
        product_6_quantity, product_6_units, product_6_rate, product_6_tax, product_6_amount);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("  7   ||  %-12d  ||  %-16s  ||  %-8d  ||  %-8.0f  ||  %-5s  ||   %-5.2f  ||  %-3.0f  ||  %-8.2f  ||%n", product_7_code, product_7_name, product_7_hsn, 
        product_7_quantity, product_7_units, product_7_rate, product_7_tax, product_7_amount);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("                                                                                           Total            || %-6.2f ||%n", sub_amount);
        System.out.println("                                                                                                            ||----------||");
        System.out.printf("                                                                                           Discounts        ||  %-6.2f  ||%n", discount_amount);
        System.out.println("                                                                                                            ||----------||");
        System.out.printf("                                                                                           Grand Total      || %-6.2f ||%n", grand_total);
        System.out.println("                                                                                      ======================||==========||");
        System.out.println("                                                                           ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
    }
}