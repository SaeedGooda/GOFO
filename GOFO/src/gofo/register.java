package gofo;
import gofo.eWallet;

public class register {
    private String name;
    private int id;
    private static int n = 1;
    private String email;
    private int phone;
    private String city;
    private String password;
    private String player_playgroundOwner;
    public eWallet e;
    register(){
        this.name = "";
        set_id();
        this.email = "";
        this.phone = 0;
        this.city = "";
        this.password = "";
        this.player_playgroundOwner = "";
    }
    register(String name , String email , int phone , String city , String password , String player_playgroundOwner , eWallet e){
        this.name = name;
        set_id();
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.password = password;
        this.player_playgroundOwner = player_playgroundOwner;
        this.e = e;
    }
    public void set_name(String name){
        this.name = name;
    }
    public String get_name(){
        return this.name;
    }
    public void set_id(){
        this.id = this.n;
        this.n +=1;
    }
    public int get_id(){
        return this.id;
    }
    public void set_email(String email){
        this.email = email;
    }
    public String get_email(){
        return this.email;
    }
    public void set_phone(int phone){
        this.phone = phone;
    }
    public int get_phone(){
        return this.phone;
    }
    public void set_city(String city){
        this.city = city;
    }
    public String get_city(){
        return this.city;
    }
    public void set_password(String password){
        this.password = password;
    }
    public String get_password(){
        return this.password;
    }
    
    public void set_player_playgroundOwner(String player_playgroundOwner){
        this.player_playgroundOwner = player_playgroundOwner;
    }
    public String get_player_playgroundOwner(){
        return this.player_playgroundOwner;
    }
    public void add_eWallet(eWallet e){
        this.e = e;
    }
    public eWallet get_eWallet(){
        return this.e;
    }
    @Override
    public String toString(){
        return ("Name: " + this.name + "\n" + "id: " + this.id + "\n" + "Email: " + this.email + "\n" 
                + "Phone: " + this.phone + "\n" + "City: " + this.city + "\n" + "password: " + this.password 
                + "\n" + "type: " + this.player_playgroundOwner +"\n" + "eWallet Inforamtion: \n" + this.e + "\n");  
    } 
}
