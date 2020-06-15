package gofo;

public class login{
    private String Lname;
    private String Lpassword;
    login(){}
    login(String Lname , String Lpassword){
        this.Lname = Lname;
        this.Lpassword = Lpassword;
    }
    public void set_Lname(String Lname){
        this.Lname = Lname;
    }
    public String get_Lname(){
        return this.Lname;
    }
    public void set_Lpassword(String Lpassword){
        this.Lpassword = Lpassword;
    }
    public String get_Lpassword(){
        return this.Lpassword;
    }
    @Override
    public String toString(){
      return "Name: " + this.Lname + "\n" + "Password: " + this.Lpassword + "\n";  
    }
}
