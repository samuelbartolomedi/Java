package Entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;
    public static double COUVERT = 4.0;

    public double cover() {
        return COUVERT;
    }

    public double ticket() {
        if (this.gender == 'F' || this.gender == 'f') {
            return 8.0;
        }
        else{
            return 10.0;
        }
    }

    public double feeding(){
        return (beer * 5.0) + (softDrink * 3.0) + (barbecue * 7.0);
    }

    public double total(){
        if (feeding() > 30.0) {
            return feeding() + ticket();
        }
        else {
            return feeding() + ticket() + cover();
        }
    }
}
