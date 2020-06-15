package gofo;
import java.util.Scanner;
import java.util.ArrayList;

class DB{
    DB(){}
    public ArrayList <register> all_registers = new ArrayList <>();
    public ArrayList <playground> all_playgrounds_in_review = new ArrayList <>();
    public ArrayList <playground> active_playgrounds = new ArrayList <>();
    public ArrayList <book_playground> playgrounds_booking = new ArrayList <>();
    public void store_register(register r){
        all_registers.add(r);
    }
    public void print_all_registers(){
        for(int i = 0 ; i < all_registers.size() ; i++){
            System.out.print(all_registers.get(i));
        }
    }
    public int check(login l){
        if(l.get_Lname().equals("admin") && l.get_Lpassword().equals("admin")){
            return -2;
        }
        else{
            for(int i = 0 ; i < all_registers.size() ; i++){
            if(l.get_Lname().equals(all_registers.get(i).get_name()) && l.get_Lpassword().equals(all_registers.get(i).get_password())){
                return i;
            }
        }
        }
        return -1;
    }
    public void store_playground(playground p){
        all_playgrounds_in_review.add(p);
    }
    public void print_all_playgrounds_in_review(){
        for(int i = 0 ; i < all_playgrounds_in_review.size() ; i++){
            System.out.print(all_playgrounds_in_review.get(i));
        }
    }
    public void active_playground(playground p){
        active_playgrounds.add(p);
    }
    public void print_active_playgrounds(){
        for(int i = 0 ; i < active_playgrounds.size() ; i++){
            System.out.print(active_playgrounds.get(i));
        }
    }
    public void show_playground_at_specific_location(String location){
        for(int i = 0 ; i < active_playgrounds.size() ; i++){
            if(active_playgrounds.get(i).get_location().equals(location)){
                System.out.println(active_playgrounds.get(i));
            }
        }
    }
    public void store_book_playground(book_playground b){
        playgrounds_booking.add(b);
    }
    public int check_playground_name(String name){
        for(int i = 0 ; i < all_playgrounds_in_review.size() ; i++){
            if(all_playgrounds_in_review.get(i).get_name().equals(name)){
                return i;
            }
        }
        return -2;
    }
}