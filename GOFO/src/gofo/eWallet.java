package gofo;
import java.util.Scanner;

public class eWallet {
    private String name;
    private String password;
    private double balance;
    eWallet(){
        name = "";
        password = "";
        balance = 0.0;
    }
    eWallet(String name , String password , double balance){
        this.name = name;
        this.password = password;
        this.balance = balance;
    }
    public void set_name(String name){
        this.name = name;
    }
    public String get_name(){
        return this.name;
    }
    public void set_password(String password){
        this.password = password;
    }
    public String get_password(){
        return this.password;
    }
    public void set_balance(double balance){
        this.balance = balance;
    }
    public double get_balance(){
        return this.balance;
    }
    @Override
    public String toString(){
        return "name: " + this.name + "\n" + "password: " + this.password + "\n" + "balance: " + this.balance + "\n";
    }
}
