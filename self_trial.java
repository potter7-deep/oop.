import java.util.Scanner;

public class self_trial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your amount balance: ");
            double balance = scanner.nextDouble();

            if(balance < 0){
                System.out.println("your balance is negative");
            }else if(balance == 0){
                System.out.println("your balance is zero");
            }else{
                System.out.print("0. Sh20 = Kredo 60 Midnyt\n1. Data OFA\n2. Minute OFA MOTO\n3. Dabo Kredo\n4. Minutes\n5. FLEX\n6. Okoa calls\nEnter your choice: ");
                int choice = scanner.nextInt();

                switch(choice){
                    case 0:
                        System.out.print("Chagua njia ya kulipa Sh20:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                        int payChoice = scanner.nextInt();

                            switch(payChoice){
                                case 1:
                                    System.out.print("Please enter your M-pesa pin: ");
                                    int pin = scanner.nextInt();

                                    System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased Kredo 60 Midnyt for Sh20 from your M-PESA account.\nYour new balance is: " + (balance));
                                    break;
                                case 2:
                                    if(balance >= 20){
                                        System.out.print("\nTransaction successful.\nYou have purchased Kredo 60 Midnyt for Sh20 from your Airtime balance.\nYour new balance is: " + (balance - 20));
                                    }else{
                                        System.out.print("\nInsufficient funds to complete this transaction.");}
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                        break;
                    case 1:
                        System.out.println("\n1. Daily + Hourly\n2. Weekly + Monthly\nEnter your choice: ");
                        int dataChoice = scanner.nextInt();

                            switch(dataChoice){
                                case 1:
                                    System.out.println("1. Sh5 = 240MB 1hr\n2. Sh60 = 1.5GB 24hrs\n3. Sh100 = 3GB 24hrs\n4. Sh200 = 6GB 24hrs\n5. Sh20 = 1GB 1hr\nEnter your choice: ");
                                    int dailyChoice = scanner.nextInt();
                                        switch(dailyChoice){
                                            case 1:
                                                System.out.println("Chaguaa njia ya kulipa Sh5:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                                int payChoice1 = scanner.nextInt();

                                                    switch(payChoice1){
                                                        case 1:
                                                            System.out.print("Please enter your M-pesa pin: ");
                                                            int pin = scanner.nextInt();

                                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 240MB for 1hr at Sh5 from your M-PESA account.\nYour new balance is: " + (balance));
                                                            break;
                                                        case 2:
                                                            if(balance >= 5){
                                                            System.out.println("You have successfully purchased 240MB for 1hr at Sh5\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 5));
                                                            }else{
                                                                System.out.println("Insufficient funds to complete this transaction.");
                                                            }
                                                            break;
                                                            default:
                                                                System.out.println("Invalid choice");
                                                    }
                                                break;
                                            case 2:
                                                System.out.println("Chaguaa njia ya kulipa Sh60:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                                int payChoice2 = scanner.nextInt();

                                                    switch(payChoice2){
                                                        case 1:
                                                            System.out.print("Please enter your M-pesa pin: ");
                                                            int pin = scanner.nextInt();

                                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 1.5GB for 24hrs at Sh60 from your M-PESA account.\nYour new balance is: " + (balance));
                                                            break;
                                                        case 2:
                                                            if(balance >= 60){
                                                            System.out.println("You have successfully purchased 1.5GB for 24hrs at Sh60\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 60));
                                                            }else{
                                                                System.out.println("Insufficient funds to complete this transaction.");
                                                            }
                                                            break;
                                                            default:
                                                                System.out.println("Invalid choice");
                                                    }
                                                break;
                                            case 3:
                                                System.out.println("Chaguaa njia ya kulipa Sh100:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                                int payChoice3 = scanner.nextInt();

                                                    switch(payChoice3){
                                                        case 1:
                                                            System.out.print("Please enter your M-pesa pin: ");
                                                            int pin = scanner.nextInt();

                                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 3GB for 24hrs at Sh100 from your M-PESA account.\nYour new balance is: " + (balance));
                                                            break;
                                                        case 2:
                                                            if(balance >= 100){
                                                            System.out.println("You have successfully purchased 3GB for 24hrs at Sh100\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 100));
                                                            }else{
                                                                System.out.println("Insufficient funds to complete this transaction.");
                                                            }
                                                            break;
                                                            default:
                                                                System.out.println("Invalid choice");
                                                    }
                                                break;
                                            case 4:
                                                System.out.println("Chaguaa njia ya kulipa Sh200:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                                int payChoice4 = scanner.nextInt();
                                                    switch(payChoice4){
                                                        case 1:
                                                            System.out.print("Please enter your M-pesa pin: ");
                                                            int pin = scanner.nextInt();

                                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 6GB for 24hrs at Sh200 from your M-PESA account.\nYour new balance is: " + (balance));
                                                            break;
                                                        case 2:
                                                            if(balance >= 200){
                                                            System.out.println("You have successfully purchased 6GB for 24hrs at Sh200\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 200));
                                                            }else{
                                                                System.out.println("Insufficient funds to complete this transaction.");
                                                            }
                                                            break;
                                                            default:
                                                                System.out.println("Invalid choice");
                                                    }
                                                break;
                                            case 5:
                                                System.out.println("Chaguaa njia ya kulipa Sh20:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                                int payChoice5 = scanner.nextInt();
                                                    switch(payChoice5){
                                                        case 1:
                                                            System.out.print("Please enter your M-pesa pin: ");
                                                            int pin = scanner.nextInt();
                                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 1GB for 1hr at Sh20 from your M-PESA account.\nYour new balance is: " + (balance));
                                                            break;
                                                        case 2:
                                                            if(balance >= 20){
                                                            System.out.println("You have successfully purchased 1GB for 1hr at Sh20\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 20));
                                                            }else{
                                                                System.out.println("Insufficient funds to complete this transaction.");
                                                            }
                                                            break;
                                                            default:
                                                                System.out.println("Invalid choice");
                                                    }
                                                break;
                                            default:
                                                System.out.println("Invalid choice");
                                        }
                                    break;
                                case 2:
                                    System.out.println("1. Sh150 = 1.5GB 7days\n2. Sh300 = 3GB 30days\n3. Sh500 = 6GB 30days\n4. Sh1000 = 15GB 30days\n5. Sh700 = 6GB 7days\nEnter your choice: ");
                                    int weeklyChoice = scanner.nextInt();
                                        switch(weeklyChoice){
                                            case 1:
                                                System.out.println("Chaguaa njia ya kulipa Sh150:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                                int payChoice6 = scanner.nextInt();
                                                    switch(payChoice6){
                                                        case 1:
                                                            System.out.print("Please enter your M-pesa pin: ");
                                                            int pin = scanner.nextInt();

                                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 1.5GB for 7days at Sh150 from your M-PESA account.\nYour new balance is: " + (balance));
                                                            break;
                                                        case 2:
                                                            if(balance >= 150){
                                                            System.out.println("You have successfully purchased 1.5GB for 7days at Sh150\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 150));
                                                            }else{
                                                                System.out.println("Insufficient funds to complete this transaction.");
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            case 2:
                                                System.out.println("Chaguaa njia ya kulipa Sh300:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                                int payChoice7 = scanner.nextInt();
                                                    switch(payChoice7){
                                                        case 1:
                                                            System.out.print("Please enter your M-pesa pin: ");
                                                            int pin = scanner.nextInt();

                                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 3GB for 30days at Sh300 from your M-PESA account.\nYour new balance is: " + (balance));
                                                            break;
                                                        case 2:
                                                            if(balance >= 300){
                                                            System.out.println("You have successfully purchased 3GB for 30days at Sh300\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 300));
                                                            }else{
                                                                System.out.println("Insufficient funds to complete this transaction.");
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            case 3:
                                                System.out.println("Chaguaa njia ya kulipa Sh500:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                                int payChoice8 = scanner.nextInt();
                                                    switch(payChoice8){
                                                        case 1:
                                                            System.out.print("Please enter your M-pesa pin: ");
                                                            int pin = scanner.nextInt();

                                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 6GB for 30days at Sh500 from your M-PESA account.\nYour new balance is: " + (balance));
                                                            break;
                                                        case 2:
                                                            if(balance >= 500){
                                                            System.out.println("You have successfully purchased 6GB for 30days at Sh500\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 500));
                                                            }else{
                                                                System.out.println("Insufficient funds to complete this transaction.");
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            case 4:
                                                System.out.println("Chaguaa njia ya kulipa Sh1000:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                                int payChoice9 = scanner.nextInt();
                                                    switch(payChoice9){
                                                        case 1:
                                                            System.out.print("Please enter your M-pesa pin: ");
                                                            int pin = scanner.nextInt();

                                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 15GB for 30days at Sh1000 from your M-PESA account.\nYour new balance is: " + (balance));
                                                            break;
                                                        case 2:
                                                            if(balance >= 1000){
                                                            System.out.println("You have successfully purchased 15GB for 30days at Sh1000\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 1000));
                                                            }else{
                                                                System.out.println("Insufficient funds to complete this transaction.");
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            case 5:
                                                System.out.println("Chaguaa njia ya kulipa Sh700:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                                int payChoice10 = scanner.nextInt();
                                                    switch(payChoice10){
                                                        case 1:
                                                            System.out.print("Please enter your M-pesa pin: ");
                                                            int pin = scanner.nextInt();

                                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 6GB for 7days at Sh700 from your M-PESA account.\nYour new balance is: " + (balance));
                                                            break;
                                                        case 2:
                                                            if(balance >= 700){
                                                            System.out.println("You have successfully purchased 6GB for 7days at Sh700\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 700));
                                                            }else{
                                                                System.out.println("Insufficient funds to complete this transaction.");
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            default:
                                                System.out.println("Invalid choice");
                                        }
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                        break;
                    case 2:
                        System.out.println("OFA MOTO!\n1. Sh20 = Kredo 60 Midnyt\n2. Sh20 = 45 Mins, 3hrs\n3. Sh50 = 120 Mins, 7hrs\n4. Sh100 = 250 Mins, 15hrs\nEnter your choice: ");
                        int motoChoice = scanner.nextInt();

                        switch(motoChoice){
                            case 1:
                                System.out.println("Chaguaa njia ya kulipa Sh20:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                int payChoice11 = scanner.nextInt();
                                    switch(payChoice11){
                                        case 1:
                                            System.out.print("Please enter your M-pesa pin: ");
                                            int pin = scanner.nextInt();
                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased Kredo 60 Midnyt for Sh20 from your M-PESA account.\nYour new balance is: " + (balance));
                                            break;
                                        case 2:
                                            if(balance >= 20){
                                                System.out.println("You have successfully purchased Kredo 60 Midnyt for Sh20\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 20));
                                            }else{
                                                System.out.println("Insufficient funds to complete this transaction.");
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                            }
                            break;
                        case 2:
                            System.out.println("Chaguaa njia ya kulipa Sh20:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                            int payChoice12 = scanner.nextInt();
                                switch(payChoice12){
                                    case 1:
                                        System.out.print("Please enter your M-pesa pin: ");
                                        int pin = scanner.nextInt();

                                        System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 45 Mins, 3hrs for Sh20 from your M-PESA account.\nYour new balance is: " + (balance));
                                        break;
                                    case 2:
                                        if(balance >= 20){
                                            System.out.println("You have successfully purchased 45 Mins, 3hrs for Sh20\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 20));
                                        }else{
                                            System.out.println("Insufficient funds to complete this transaction.");
                                            }
                                            break;
                                    default:
                                        System.out.println("Invalid choice");
                                }
                                break;
                            case 3:
                                System.out.println("Chaguaa njia ya kulipa Sh50:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                int payChoice13 = scanner.nextInt();
                                    switch(payChoice13){
                                        case 1:
                                            System.out.print("Please enter your M-pesa pin: ");
                                            int pin = scanner.nextInt();

                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 120 Mins, 7hrs for Sh50 from your M-PESA account.\nYour new balance is: " + (balance));
                                            break;
                                        case 2:
                                            if(balance >= 50){
                                                System.out.println("You have successfully purchased 120 Mins, 7hrs for Sh50\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 50));
                                            }else{
                                                System.out.println("Insufficient funds to complete this transaction.");
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                }
                                break;
                            case 4:
                                System.out.println("Chaguaa njia ya kulipa Sh100:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                int payChoice14 = scanner.nextInt();
                                    switch(payChoice14){
                                        case 1:
                                            System.out.print("Please enter your M-pesa pin: ");
                                            int pin = scanner.nextInt();

                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 250 Mins, 15hrs for Sh100 from your M-PESA account.\nYour new balance is: " + (balance));
                                            break;
                                        case 2:
                                            if(balance >= 100){
                                                System.out.println("You have successfully purchased 250 Mins, 15hrs for Sh100\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 100));
                                            }else{
                                                System.out.println("Insufficient funds to complete this transaction.");
                                                }
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                        }
                                        break;

                            default:
                                System.out.println("Invalid choice");
                        }
                        break;
                    case 3:
                        System.out.println("1. Sh 5 = Kredo 15\n2. Sh 10 = Kredo 35\n3. Sh15 = Kredo 60 Midnyt\nEnter your choice: ");
                        int daboChoice = scanner.nextInt();
                        switch(daboChoice){
                            case 1:
                                System.out.println("Chaguaa njia ya kulipa Sh5:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                int payChoice15 = scanner.nextInt();
                                    switch(payChoice15){
                                        case 1:
                                            System.out.print("Please enter your M-pesa pin: ");
                                            int pin = scanner.nextInt();

                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased Kredo 15 for Sh5 from your M-PESA account.\nYour new balance is: " + (balance));
                                            break;
                                        case 2:
                                            if(balance >= 5){
                                            System.out.println("You have successfully purchased Kredo 15 for Sh5\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 5));
                                            }else{
                                                System.out.println("Insufficient funds to complete this transaction.");
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                    }
                                break;
                            case 2:
                                System.out.println("Chaguaa njia ya kulipa Sh10:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                int payChoice16 = scanner.nextInt();
                                    switch(payChoice16){
                                        case 1:
                                            System.out.print("Please enter your M-pesa pin: ");
                                            int pin = scanner.nextInt();    

                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased Kredo 35 for Sh10 from your M-PESA account.\nYour new balance is: " + (balance));
                                            break;
                                        case 2:
                                            if(balance >= 10){
                                            System.out.println("You have successfully purchased Kredo 35 for Sh10\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 10));
                                            }else{
                                                System.out.println("Insufficient funds to complete this transaction.");
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                    }
                                break;
                            case 3:
                                System.out.println("Chaguaa njia ya kulipa Sh15:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                int payChoice17 = scanner.nextInt();
                                    switch(payChoice17){
                                        case 1:
                                            System.out.print("Please enter your M-pesa pin: ");
                                            int pin = scanner.nextInt();

                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased Kredo 60 Midnyt for Sh15 from your M-PESA account.\nYour new balance is: " + (balance));
                                            break;
                                        case 2:
                                            if(balance >= 15){
                                            System.out.println("You have successfully purchased Kredo 60 Midnyt for Sh15\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 15));
                                            }else{
                                                System.out.println("Insufficient funds to complete this transaction.");
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                    }
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        break;
                    case 4:
                        System.out.println("0. Sh20 (Suprise Offers)\n1. Sh20 (455 Mins valid 3hrs)\n2. Sh30 (Kredo 90 valid Midnight)\n3. Sh50 (40 mins + 50 SMS till MIdnight)\nPlease enter your choice: ");
                        int offerChoice = scanner.nextInt();
                        switch(offerChoice){
                            case 0:
                                System.out.println("Chaguaa njia ya kulipa Sh20:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                int payChoice18 = scanner.nextInt();
                                    switch(payChoice18){
                                        case 1:
                                            System.out.print("Please enter your M-pesa pin: ");
                                            int pin = scanner.nextInt();

                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased a Suprise Offer for Sh20 from your M-PESA account.\nYour new balance is: " + (balance));
                                            break;
                                        case 2:
                                            if(balance >= 20){
                                            System.out.println("You have successfully purchased a Suprise Offer for Sh20\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 20));
                                            }else{
                                                System.out.println("Insufficient funds to complete this transaction.");
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                    }
                                break;
                            case 1:
                                System.out.println("Chaguaa njia ya kulipa Sh20:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                int payChoice19 = scanner.nextInt();
                                    switch(payChoice19){
                                        case 1:
                                            System.out.print("Please enter your M-pesa pin: ");
                                            int pin = scanner.nextInt();

                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 455 Mins valid 3hrs for Sh20 from your M-PESA account.\nYour new balance is: " + (balance));
                                            break;
                                        case 2:
                                            if(balance >= 20){
                                            System.out.println("You have successfully purchased 455 Mins valid 3hrs for Sh20\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 20));
                                            }else{
                                                System.out.println("Insufficient funds to complete this transaction.");
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                    }
                                break;
                            case 2:
                                System.out.println("Chaguaa njia ya kulipa Sh30:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                int payChoice20 = scanner.nextInt();
                                    switch(payChoice20){
                                        case 1:
                                            System.out.print("Please enter your M-pesa pin: ");
                                            int pin = scanner.nextInt();

                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased Kredo 90 valid Midnight for Sh30 from your M-PESA account.\nYour new balance is: " + (balance));
                                            break;
                                        case 2:
                                            if(balance >= 30){
                                            System.out.println("You have successfully purchased Kredo 90 valid Midnight for Sh30\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 30));
                                            }else{
                                                System.out.println("Insufficient funds to complete this transaction.");
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                    }
                                break;
                            case 3:
                                System.out.println("Chaguaa njia ya kulipa Sh50:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                int payChoice21 = scanner.nextInt();
                                    switch(payChoice21){
                                        case 1:
                                            System.out.print("Please enter your M-pesa pin: ");
                                            int pin = scanner.nextInt();

                                            System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased 40 mins + 50 SMS till MIdnight for Sh50 from your M-PESA account.\nYour new balance is: " + (balance));
                                            break;
                                        case 2:
                                            if(balance >= 50){
                                            System.out.println("You have successfully purchased 40 mins + 50 SMS till MIdnight for Sh50\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 50));
                                            }else{
                                                System.out.println("Insufficient funds to complete this transaction.");
                                            }
                                            break;
                                        default:
                                            System.out.println("Invalid choice");
                                    }
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        break;

                    case 5:
                            System.out.println("1. Sh 20 = 350, 2hrs\n2. Sh 30 = 500,2hrs\n3. Sh 50 = 350, Midnyt\n4. Sh 100 = 1000,midnyt\n5. Sh 1000 = 9000,30days\nPlease enter your choice: ");
                            int bundleChoice = scanner.nextInt();
                            switch(bundleChoice){
                                case 1:
                                    System.out.println("Chanuaa njia ya kulipa Sh20:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                    int payChoice22 = scanner.nextInt();
                                        switch(payChoice22){
                                            case 1:
                                                System.out.print("Please enter your M-pesa pin: ");
                                                int pin = scanner.nextInt();

                                                System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased Sh20 = 350, 2hrs from your M-PESA account.\nYour new balance is: " + (balance));
                                                break;
                                            case 2:
                                                if(balance >= 20){
                                                System.out.println("You have successfully purchased Sh20 = 350, 2hrs\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 20));
                                                }else{
                                                    System.out.println("Insufficient funds to complete this transaction.");
                                                }
                                                break;
                                            default:
                                                System.out.println("Invalid choice");
                                        }
                                    break;
                                case 2:
                                    System.out.println("Chaguaa njia ya kulipa Sh30:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                    int payChoice23 = scanner.nextInt();
                                        switch(payChoice23){
                                            case 1:
                                                System.out.print("Please enter your M-pesa pin: ");
                                                int pin = scanner.nextInt();

                                                System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased Sh30 = 500,2hrs from your M-PESA account.\nYour new balance is: " + (balance));
                                                break;
                                            case 2:
                                                if(balance >= 30){
                                                System.out.println("You have successfully purchased Sh30 = 500,2hrs\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 30));
                                                }else{
                                                    System.out.println("Insufficient funds to complete this transaction.");
                                                }
                                                break;
                                            default:
                                                System.out.println("Invalid choice");
                                        }
                                    break;
                                case 3:
                                    System.out.println("Chaguaa njia ya kulipa Sh50:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                    int payChoice24 = scanner.nextInt();
                                        switch(payChoice24){
                                            case 1:
                                                System.out.print("Please enter your M-pesa pin: ");
                                                int pin = scanner.nextInt();

                                                System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased Sh50 = 350, Midnyt from your M-PESA account.\nYour new balance is: " + (balance));
                                                break;
                                            case 2:
                                                if(balance >= 50){
                                                System.out.println("You have successfully purchased Sh50 = 350, Midnyt\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 50));
                                                }else{
                                                    System.out.println("Insufficient funds to complete this transaction.");
                                                }
                                                break;
                                            default:
                                                System.out.println("Invalid choice");
                                        }
                                    break;
                                case 4:
                                    System.out.println("Chaguaa njia ya kulipa Sh100:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                    int payChoice25 = scanner.nextInt();
                                        switch(payChoice25){
                                            case 1:
                                                System.out.print("Please enter your M-pesa pin: ");
                                                int pin = scanner.nextInt();

                                                System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased Sh100 = 1000,midnyt from your M-PESA account.\nYour new balance is: " + (balance));
                                                break;
                                            case 2:
                                                if(balance >= 100){
                                                System.out.println("You have successfully purchased Sh100 = 1000,midnyt\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 100));
                                                }else{
                                                    System.out.println("Insufficient funds to complete this transaction.");
                                                }
                                                break;
                                            default:
                                                System.out.println("Invalid choice");
                                        }
                                    break;
                                case 5:
                                    System.out.println("Chaguaa njia ya kulipa Sh1000:\n1. M-PESA\n2. Airtime\nEnter your choice: ");
                                    int payChoice26 = scanner.nextInt();
                                        switch(payChoice26){
                                            case 1:
                                                System.out.print("Please enter your M-pesa pin: ");
                                                int pin = scanner.nextInt();    

                                                System.out.print("Thank you for choosing Safaricom limited.\nPlease wait while we process your request...\nProcessing...\nTransaction successful.\nYou have purchased Sh1000 = 9000,30days from your M-PESA account.\nYour new balance is: " + (balance));
                                                break;
                                            case 2:
                                                if(balance >= 1000){
                                                System.out.println("You have successfully purchased Sh1000 = 9000,30days\nThank you for choosing Safaricom limited.\nYour new balance is: " + (balance - 1000));
                                                }else{
                                                    System.out.println("Insufficient funds to complete this transaction.");
                                                }
                                                break;
                                            default:
                                                System.out.println("Invalid choice");
                                        }
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                        break;
                    case 6:
                        System.out.println("Okoa Calls & SMS\n1. Sh50 = 40Mins,24hrs\n2. Sh100 = 100Mins,7days\n3. Sh200 = 250Mins,30days\n4. Sh300 = 400Mins,30days\n5. Sh500 = 800Mins,30days\nPlease enter your choice: ");
                        int okoaChoice = scanner.nextInt();
                        switch(okoaChoice){
                            case 1:
                                System.out.println("You have successfully subscribed to Okoa Calls & SMS Sh50 = 40Mins,24hrs. \nThank you for choosing Safaricom limited.");
                                break;
                            case 2:
                                System.out.println("You have successfully subscribed to Okoa Calls & SMS Sh100 = 100Mins,7days. \nThank you for choosing Safaricom limited.");
                                break;
                            case 3:
                                System.out.println("You have successfully subscribed to Okoa Calls & SMS Sh200 = 250Mins,30days. \nThank you for choosing Safaricom limited.");
                                break;
                            case 4:
                                System.out.println("You have successfully subscribed to Okoa Calls & SMS Sh300 = 400Mins,30days. \nThank you for choosing Safaricom limited.");
                                break;
                            case 5:
                                System.out.println("You have successfully subscribed to Okoa Calls & SMS Sh500 = 800Mins,30days. \nThank you for choosing Safaricom limited.");
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                        break;
                    default:
                        System.out.println("invalid choice");
                }
            }
    }
}
