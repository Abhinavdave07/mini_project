
import java.util.Scanner;
import java.lang.System;
import java.io.*;

interface HotelDetails {
    public void rooms(int n);

    public void staff();

    public void amenities();

    public void checkin_out();

    public void rules();

    public void booking(String book);

    public void details();

}

class AllDetails implements HotelDetails {
    public void rooms(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("........................................................");

        switch (n) {
            case 1:
                System.out.println("AC single room ");
                System.out.println("Price: 1500/-  \n");
                System.out.println("Facilities:\n");
                System.out.println("Breakfast and lunch included\n");
                System.out.println("Max 2 Guests\nTV\tGeyser");
                System.out.println("Do you want to book this room?");
                String book1 = scanner.nextLine();
                booking(book1);

                break;

            case 2:
                System.out.println("AC double sharing room ");
                System.out.println("Price: 2000/-  ");
                System.out.println("Facilities:\n");
                System.out.println("Breakfast, Lunch and Dinner included\n");
                System.out.println("Max 4 Guests\nTV\tGeyser");
                System.out.println("Do you want to book this room?");
                String book2 = scanner.nextLine();
                booking(book2);

                break;

            case 3:
                System.out.println("Non AC single-sharing room ");
                System.out.println("Price: 1000/-  \n");
                System.out.println("Facilities:\n");
                System.out.println("\n");
                System.out.println("Max 2 Guests\nTV\tGeyser");
                System.out.println("Do you want to book this room?");
                String book3 = scanner.nextLine();
                booking(book3);
                break;

            case 4:
                System.out.println("Non AC double sharing rooms");
                System.out.println("Price: 1200/-  \n");
                System.out.println("Facilities:\n");
                System.out.println("\n");
                System.out.println("Max 4 Guests\nTV\tGeyser");
                System.out.println("Do you want to book this room?");
                String book4 = scanner.nextLine();
                booking(book4);
                break;
            default:
                System.out.println("Enter correct choice!!");
                break;
        }
    }

    public void booking(String book) {
        if (book.equals("yes")) {
            details();
            System.out.println("Congratulations!! Your room has been booked successfully");
            System.out.println("_______________________________________________");
            System.out.println("\n");

        }

    }

    public void details() {
        int age, ph;

        String name, address, email;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name= ");
        name = scan.next();

        System.out.println("Enter your address= ");
        address = scan.next();

        System.out.println("Enter your email= ");
        email = scan.next();

        System.out.println("Enter your age= ");
        age = scan.nextInt();

        System.out.println("Enter your phone number= ");
        ph = scan.nextInt();

        try {
            FileWriter f = new FileWriter("User Details");
            f.write(name + "\n");
            f.write(address + "\n");
            f.write(email + "\n");
            f.write(age + "\n");
            f.write(ph + "\n");

            System.out.println("Data saved successfully");

            f.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public void staff() {
        System.out.println("\n\n");
        System.out.println("........................................................");
        System.out.println("Details of staff are given below : ");
        System.out.println("we have different staff for different purposes like");
        System.out.println(
                "Cleaning Staff(07272-33252) \n Room Service(07272-25564) \n Laundry(07272-43215) \n Kitchen Staff(07272-48935) \n Security(07272-98513) ");
        System.out.println("........................................................");
        System.out.println("\n\n");

    }

    public void amenities() {
        System.out.println("\n\n");
        System.out.println("........................................................");
        System.out.println("Facilities which will be given during stay like ...");
        System.out.println("24 hours room service");
        System.out.println("Restaurant");
        System.out.println("Travel Assistance");
        System.out.println("& many more services.");
        System.out.println("........................................................");
        System.out.println("\n\n");
    }

    public void checkin_out() {
        System.out.println("\n\n");
        System.out.println("........................................................");
        System.out.println("Booking in both online and offline mode is available");
        System.out.println("Need to chechout in next 24 hours of checkin");
        System.out.println("........................................................");
        System.out.println("\n\n");
    }

    public void rules() {
        System.out.println("\n\n");
        System.out.println("........................................................");
        System.out.println("Goverment issued id card is required during booking");
        System.out.println("Guest below the age of 18 are not allowed without parents");
        System.out.println("Smoling is prohibited");
        System.out.println("Pets are not allowed");
        System.out.println("........................................................");
        System.out.println("\n\n");
    }
}

public class Main {

    public static void main(String[] args) {
        int x, age, ph;
        int input;
        String name, address, email;
        Scanner sc = new Scanner(System.in);
        AllDetails ad = new AllDetails();
        boolean continueLoop = true;
        do {
            System.out.println("Enter 1 to know details of rooms...");
            System.out.println("Enter 2 to know details of staff...");
            System.out.println("Enter 3 to know aminities... ");
            System.out.println("Enter 4 to know details of check in and check out...");
            System.out.println("Enter 5 to know rules and regulations of hotel... ");
            System.out.println("Enter 6 to enter your details... ");
            System.out.println("Enter 7 to read your entered details... ");
            System.out.println("Enter 8 for exit...");
            System.out.print("Enter  your choice = ");
            x = sc.nextInt();
            switch (x)

            {
                case 1: {

                    System.out.println("\n\n");
                    System.out.println("........................................................");
                    System.out.println("Details of rooms are given below :");
                    System.out.println("1. AC single room ");
                    System.out.println("2. AC double sharing room ");
                    System.out.println("3. Non AC single room ");
                    System.out.println("4. Non AC double sharing rooms ");
                    System.out.println("........................................................");
                    System.out.println("\n\n");
                    System.out.println("Choose");
                    input = sc.nextInt();

                    ad.rooms(input);
                }
                    break;

                case 2: {
                    ad.staff();
                }

                    break;

                case 3: {
                    ad.amenities();
                }
                    break;

                case 4: {
                    ad.checkin_out();
                }
                    break;
                case 5: {
                    ad.rules();
                }
                    break;

                case 6: {
                    System.out.println("Enter your name= ");
                    name = sc.next();

                    System.out.println("Enter your address= ");
                    address = sc.next();

                    System.out.println("Enter your email= ");
                    email = sc.next();

                    System.out.println("Enter your age= ");
                    age = sc.nextInt();

                    System.out.println("Enter your phone number= ");
                    ph = sc.nextInt();

                    try {
                        FileWriter f = new FileWriter("User Details");
                        f.write(name + "\n");
                        f.write(address + "\n");
                        f.write(email + "\n");
                        f.write(age + "\n");
                        f.write(ph + "\n");

                        System.out.println("Data saved successfully");

                        f.close();

                    } catch (FileNotFoundException fnfe) {
                        System.out.println(fnfe);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    }

                }
                    break;

                case 7: {
                    System.out.println("Please wait while your details are fetched.......");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Your data is shown below_-: ");

                    try {
                        FileReader f = new FileReader("User Details");
                        BufferedReader br = new BufferedReader(f);
                        String line;
                        while ((line = br.readLine()) != null)
                            System.out.println(line);
                        br.close();
                        f.close();

                    } catch (FileNotFoundException fnfe) {
                        System.out.println(fnfe);
                    } catch (IOException ioe) {
                        System.out.println(ioe);
                    }
                }

                    break;

                case 8: {
                    System.exit(0);
                }

                default:
                    System.out.println("Enter correct choice");

            }
        } while (continueLoop);
    }
}