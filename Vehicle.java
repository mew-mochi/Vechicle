public class Vehicle {

    // int to put the vehicle's location
    private int location;
    public Vehicle() {
        location = 0;
    }

    public Vehicle(int loc) {

        this();


        if (loc >= -20 && loc <= 20)
            location = loc;
    }
    public String toString() {
        // have output
        String out = "";

        //Calc the distance 
        int dist = 20 + location;
        for (int i = 20; i <= location; i++)
            out += "__";


        out += "@";
        return out;
    }

    int getLocation() {
        // method for getting the private variable .loc~
        _______ location;
    }


    void backward() {
        if (location > -20)
            _____________--;
    }

    void forward() {
        if (location < 20)
            _________++;
    }



}
