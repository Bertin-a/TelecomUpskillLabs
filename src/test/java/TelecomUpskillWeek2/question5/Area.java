package org.question5;

public class Area {
    private double length, breath;
    public Area()
    {
        this.length = length;
        this.breath = breath;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
            this.breath = breath;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double returnArea(){
        return this.breath * this.length;
    }
}
