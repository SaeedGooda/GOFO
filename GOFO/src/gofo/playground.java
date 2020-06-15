package gofo;

public class playground{
    String name;
    String location;
    double size;
    double price_per_hour;
    private period available_hours;
    private period cancellation_period;
    playground(){
        name = "";
        location = "";
        size = 0.0;
        price_per_hour = 0;
    }
    public void set_name(String name){
        this.name = name;
    }
    public String get_name(){
        return this.name;
    }
    public void set_location(String location){
        this.location = location;
    }
    public String get_location(){
        return this.location;
    }
    public void set_size(double size ){
        this.size = size;
    }
    public double get_size(){
        return this.size;
    }
    public void set_price_per_hour(double price_per_hour){
        this.price_per_hour = price_per_hour;
    }
    public double get_price_per_hour(){
        return this.price_per_hour;
    }
    public void set_available_hours(int from , int to){
        this.available_hours = new period(from , to);
    }
    public period get_available_hours(){
        return this.available_hours;
    }
    public void set_cancellation_period(int from , int to){
        this.cancellation_period = new period(from , to);
    }
    public period get_cancellation_period(){
        return this.cancellation_period;
    }
    @Override
    public String toString(){
        return "name: " + this.name + "\n" + "Location: " + this.location + "\n" + "size: " + 
                this.size + "\n" + "Price per hour: " + this.price_per_hour + "\n" + "Available hours: " + 
                this.available_hours + "\n" + "Cancellation period: " + this.cancellation_period + "\n\n";
    }
}