package org.question2;

import java.util.logging.Level;

import static org.question2.Main.Color.printcolors;

public class Main {
    enum Color {
        RED("#FF0000"),
        GREEN("#00FF00"),
        BLUE("#0000FF"),
        YELLOW("#FFFF00"),
        BLACK("#000000");

        private String colorCode;

        Color(String colorCode) {

            this.colorCode = colorCode;
        }

        public String getColorCode() {
            return colorCode;
        }
        public static void printcolors(){
            for (Color pickColors : Color.values()){
                System.out.println(pickColors.name()+ ": " + pickColors.getColorCode());
            }
        }
    }
    public static void main(String[] args){

        printcolors();
    }
}
