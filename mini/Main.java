
import java.util.Scanner;
import java.lang.System;
import java.io.*;

interface HotelDetails {
    public void rooms();

    public void staff();

    public void amenities();

    public void checkin_out();

    public void rules();
}

class AllDetails implements HotelDetails {
    public void rooms() {
        System.out.println("\n\n");
        System.out.println("........................................................");
        System.out.println("Details of rooms are given below :");
        System.out.println("AC single room = 1500");
        System.out.println("AC double sharing room = 2000");
        System.out.println("Non AC single room = 1000");
        System.out.println("Non AC double sharing rooms = 1200");
        System.out.println("Many more rooms are available according to your choices...");
        System.out.println("........................................................");
        System.out.println("\n\n");

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
                    ad.rooms();
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