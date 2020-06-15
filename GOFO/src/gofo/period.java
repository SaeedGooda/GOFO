package gofo;

public class period{
    private int from;
    private int to;
    period(){
        from = 0;
        to = 0;
    }
    period(int from , int to){
        this.from = from;
        this.to = to;
    }
    public void set_from(int from){
        this.from = from;
    }
    public int get_from(){
        return this.from;
    }
    public void set_to(int to){
        this.to = to;
    }
    public int get_to(){
        return this.to;
    }
    @Override
    public String toString(){
        return "From: " + this.from + "       " + "To: " + this.to;
    }
}
