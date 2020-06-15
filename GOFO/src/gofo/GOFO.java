package gofo;
import java.util.ArrayList;
import java.util.Scanner;
import gofo.register;
import gofo.login;
import gofo.period;
import gofo.playground;
import gofo.DB;
import gofo.eWallet;

public class GOFO {
    static Scanner input = new Scanner(System.in);
    public static void main_menu(){
        System.out.println("\t***********************************");
        System.out.println("\tWelcome To Playgrounds' Application");
        System.out.println("\t***********************************");
        System.out.println("Please choose from the following:");
        System.out.println("*********************************");
        System.out.println("\t1-Register");
        System.out.println("\t2-Login");
    }
    public static void about_program(){
        System.out.println("This program used to help players to book playground that is near to them online");
    }
    public static void main(String[] args) {
        DB db = new DB();
        book_playground b = new book_playground();
        eWallet e = new eWallet("saeed" ,"0000" , 5000);
        register x = new register("saeed" , "saeed@gmail.com" , 0000 , "Cairo" , "1234" , "player" , e);
        db.store_register(x);
        eWallet e2 = new eWallet("ahmed" , "0000" , 10000 );
        register y = new register("ahmed" , "ahmed@gmail.com" , 1111 , "Giza" , "4321" , "playgroundOwner" , e2);
        db.store_register(y);
        playground play1 = new playground();
        play1.set_name("aaaa");
        play1.set_location("Cairo");
        play1.set_size(1000);
        play1.set_price_per_hour(100);
        play1.set_available_hours(1,5);
        play1.set_cancellation_period(2, 3);
        db.active_playground(play1);
        playground play2 = new playground();
        play2.set_name("bbbb");
        play2.set_location("Giza");
        play2.set_size(1000);
        play2.set_price_per_hour(120);
        play2.set_available_hours(1,8);
        play2.set_cancellation_period(2, 3);
        db.active_playground(play2);
        playground play3 = new playground();
        play3.set_name("cccc");
        play3.set_location("Cairo");
        play3.set_size(1000);
        play3.set_price_per_hour(140);
        play3.set_available_hours(1,5);
        play3.set_cancellation_period(2, 3);
        db.active_playground(play3);
        playground play4 = new playground();
        play4.set_name("dddd");
        play4.set_location("Giza");
        play4.set_size(1000);
        play4.set_price_per_hour(120);
        play4.set_available_hours(1,5);
        play4.set_cancellation_period(2, 3);
        db.store_playground(play4);
        main_menu();
        int regiser_login = input.nextInt();
        if(regiser_login == 1){
            register r = new register();
            System.out.print("Enter Name: ");
            String register_name = input.next();
            r.set_name(register_name);
            System.out.print("Enter Email: ");
            String register_email = input.next();
            r.set_email(register_email);
            System.out.print("Enter Phone: ");
            int register_phone = input.nextInt();
            r.set_phone(register_phone);
            System.out.print("Enter City: ");
            String register_city = input.next();
            r.set_city(register_city);
            System.out.print("Enter Password: ");
            String register_Password = input.next();
            r.set_password(register_Password);
            while (true){
                System.out.println("Register_Type: 1- player   2- playgroundOwner");
                int choose = input.nextInt();
                if(choose == 1){
                    r.set_player_playgroundOwner("player");
                    db.store_register(r);
                    break;
                }
                else if(choose == 2){
                    r.set_player_playgroundOwner("playgroundOwner");
                    db.store_register(r);
                    break;
                }
                else{
                    System.out.println("Please choose 1 or 2");
                }
            }
            System.out.println("eWallet Information: ");
            System.out.print("Enter eWallet name: ");
            String eWallet_name = input.next();
            System.out.print("Enter eWallet password: ");
            String eWallet_password = input.next();
            System.out.print("Enter eWallet balance: ");
            double eWallet_balance = input.nextDouble();
            eWallet ee = new eWallet(eWallet_name , eWallet_password , eWallet_balance);
            r.add_eWallet(ee);
            System.out.println("\t\tYou are registerd at GOFO");
            System.out.print("\t\t Hello ");
            System.out.println(r.get_name());
            if(r.get_player_playgroundOwner() == "playgroundOwner"){
                while(true){
                    System.out.println("Please choose: ");
                    System.out.println("\t 1- add playground");
                    System.out.println("\t 2- view eWallet information");
                    System.out.println("\t 3- About this program");
                    System.out.println("\t 4- Exit");
                    int choose = input.nextInt();
                    if(choose == 1){
                        playground p = new playground();
                        System.out.print("Enter name: ");
                        String playground_name = input.next();
                        p.set_name(playground_name);
                        System.out.print("Enter location: ");
                        String playground_location = input.next();
                        p.set_location(playground_location);
                        System.out.print("Enter size: ");
                        double playground_size = input.nextDouble();
                        p.set_size(playground_size);
                        System.out.print("Enter price per hour: ");
                        double playground_price = input.nextDouble();
                        p.set_size(playground_price);
                        System.out.println("Enter available hours: ");
                        System.out.print("\tFrom: ");
                        int from = input.nextInt();
                        System.out.print("\tTo: ");
                        int to = input.nextInt();
                        p.set_available_hours(from , to);
                        System.out.println("Enter cancellation period: ");
                        System.out.print("\tFrom: ");
                        int from1 = input.nextInt();
                        System.out.print("\tTo: ");
                        int to1 = input.nextInt();
                        p.set_cancellation_period(from1, to1);
                        db.store_playground(p);
                        System.out.println("\tPlayground added and in review");
                    }
                    else if(choose == 2){
                        System.out.println(ee.toString());
                    }
                    else if(choose == 3){
                        about_program();
                    }
                    else if(choose == 4){
                        break;
                    }
                    else{
                        System.out.println("Please choose 1 , 2 , 3 or 4");
                    }
                }
            }
            else if(r.get_player_playgroundOwner() == "player"){
                 while(true){
                    System.out.println("Please choose: ");
                    System.out.println("\t 1- Book playground");
                    System.out.println("\t 2- view eWallet information");
                    System.out.println("\t 3- About this program");
                    System.out.println("\t 4- Exit");
                    int choose = input.nextInt();
                    int j = 0;
                    if(choose == 1){
                        System.out.println("Playgrounds available to you");
                        db.show_playground_at_specific_location(r.get_city());
                        System.out.print("Please write the playground that you want: ");
                        String name = input.next();
                        for(int i = 0 ; i < db.active_playgrounds.size() ; i++){
                            if(db.active_playgrounds.get(i).get_name().equals(name)){
                                j = i;
                            }
                        }
                        System.out.println("Period: ");
                        System.out.print("\tFrom: ");
                        int f = input.nextInt();
                        System.out.print("\tTo: ");
                        int t = input.nextInt();
                        int c = t - f;
                        System.out.print("price is : ");
                        System.out.println(c * db.active_playgrounds.get(j).get_price_per_hour());
                        System.out.println("Do you want to book this playground?");
                        String yy = input.next();
                        if(yy.equals("yes") || yy.equals("Yes")){
                            b.book(db.active_playgrounds.get(j) , r);
                            r.e.set_balance(r.e.get_balance() - (c * db.active_playgrounds.get(j).get_price_per_hour()));
                            if(r.e.get_balance() < 0){
                                System.out.println("You haven't enough money");
                            }
                            else{
                                db.store_book_playground(b);
                                System.out.println("You are booked the playground");
                            }
                        }
                    }
                    else if(choose == 2){
                        System.out.println(ee.toString());
                    }
                    else if(choose == 3){
                        about_program();
                    }
                    else if(choose == 4){
                        break;
                    }
                    else{
                        System.out.println("Please choose 1 , 2 , 3 or 4");
                    }
                }
            }
        }
        else if(regiser_login == 2){
            login l = new login();
            System.out.print("Enter Name: ");
            String login_name = input.next();
            l.set_Lname(login_name);
            System.out.print("Enter Password: ");
            String login_Password = input.next();
            l.set_Lpassword(login_Password);
            if(db.check(l) == -1){
                System.out.println("\tIncorrect username or password");
            }
            else if(db.check(l) == -2){
                    System.out.println("\t Hello Admin");
                    while(true){
                        System.out.println("Please choose: ");
                        System.out.println("\t 1- Approve playground");
                        System.out.println("\t 2- Showing all active playground");
                        System.out.println("\t 3- exit");
                        int choose = input.nextInt();
                        if(choose == 1){
                            System.out.println("\t All playgrounds in review");
                            db.print_all_playgrounds_in_review();
                            System.out.println("Please enter the playground that you want to active it:");
                            int rr = 0;
                            String name = input.next();
                            if(db.check_playground_name(name) == -2){
                                System.out.println("the playground name not found");
                            }
                            else{
                                db.active_playground(db.all_playgrounds_in_review.get(db.check_playground_name(name)));
                                db.all_playgrounds_in_review.remove(db.check_playground_name(name));
                                System.out.println("playground as approved");
                            }
                        }
                        else if(choose == 2){
                            db.print_active_playgrounds();
                        }
                        else if(choose == 3){
                            break;
                        }
                        else {
                            System.out.println("Please enter 1 or 2");
                        }
                    }
                }
            else{
                System.out.println("\tYou are logged in");
                if(db.all_registers.get(db.check(l)).get_player_playgroundOwner() == "player"){
                    System.out.print("\t Hello ");
                    System.out.println(db.all_registers.get(db.check(l)).get_name());
                    while(true){
                        System.out.println("Please choose: ");
                        System.out.println("\t 1- Book playground");
                        System.out.println("\t 2- view eWallet information");
                        System.out.println("\t 3- About this program");
                        System.out.println("\t 4- Exit");
                        int choose = input.nextInt();
                        int j = 0;
                        if(choose == 1){
                            System.out.println("Playgrounds available to you");
                            db.show_playground_at_specific_location(db.all_registers.get(db.check(l)).get_city());
                            System.out.print("Please write the playground that you want: ");
                            String name = input.next();
                            for(int i = 0 ; i < db.active_playgrounds.size() ; i++){
                                if(db.active_playgrounds.get(i).get_name().equals(name)){
                                    j = i;
                                }
                            }
                            System.out.println("Period: ");
                            System.out.print("\tFrom: ");
                            int f = input.nextInt();
                            System.out.print("\tTo: ");
                            int t = input.nextInt();
                            int c = t - f;
                            System.out.print("price is : ");
                            System.out.println(c * db.active_playgrounds.get(j).get_price_per_hour());
                            System.out.println("Do you want to book this playground?");
                            String yy = input.next();
                            if(yy.equals("yes") || yy.equals("Yes")){
                                b.book(db.active_playgrounds.get(j) , db.all_registers.get(db.check(l)));
                                db.all_registers.get(db.check(l)).e.set_balance(db.all_registers.get(db.check(l)).e.get_balance() - (c * db.active_playgrounds.get(j).get_price_per_hour()));
                                if(db.all_registers.get(db.check(l)).e.get_balance() < 0){
                                    System.out.println("You haven't enough money");
                                }
                                else{
                                    db.store_book_playground(b);
                                    System.out.println("You are booked the playground");
                                }
                            }
                        }
                        else if(choose == 2){
                            System.out.println(db.all_registers.get(db.check(l)).e.toString());
                        }
                        else if(choose == 3){
                            about_program();
                        }
                        else if(choose == 4){
                            break;
                            }
                        else{
                            System.out.println("Please choose 1 , 2 , 3 or 4");
                        }
                    }
                }
                else if(db.all_registers.get(db.check(l)).get_player_playgroundOwner() == "playgroundOwner"){
                    while(true){
                        System.out.println("Please choose: ");
                        System.out.println("\t 1- add playground");
                        System.out.println("\t 2- view eWallet information");
                        System.out.println("\t 3- About this program");
                        System.out.println("\t 4- Exit");
                        int choose = input.nextInt();
                        if(choose == 1){
                            playground p = new playground();
                            System.out.print("Enter name: ");
                            String playground_name = input.next();
                            p.set_name(playground_name);
                            System.out.print("Enter location: ");
                            String playground_location = input.next();
                            p.set_location(playground_location);
                            System.out.print("Enter size: ");
                            double playground_size = input.nextDouble();
                            p.set_size(playground_size);
                            System.out.print("Enter price per hour: ");
                            double playground_price = input.nextDouble();
                            p.set_size(playground_price);
                            System.out.println("Enter available hours: ");
                            System.out.print("\tFrom: ");
                            int from = input.nextInt();
                            System.out.print("\tTo: ");
                            int to = input.nextInt();
                            p.set_available_hours(from , to);
                            System.out.println("Enter cancellation period: ");
                            System.out.print("\tFrom: ");
                            int from1 = input.nextInt();
                            System.out.print("\tTo: ");
                            int to1 = input.nextInt();
                            p.set_cancellation_period(from1, to1);
                            db.store_playground(p);
                            System.out.println("\tPlayground added and in review");
                        }
                        else if(choose == 2){
                            System.out.println(db.all_registers.get(db.check(l)).e.toString());
                        }
                        else if(choose == 3){
                            about_program();
                        }
                        else if(choose == 4){
                            break;
                        }
                        else{
                            System.out.println("Please choose 1 , 2 , 3 or 4");
                        }
                    }
                }
            }
        }
    }
}