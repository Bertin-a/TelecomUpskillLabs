package TelecomUpskillWeek3.Utility;

public abstract class randomNumberGenerator {
    public static int random(int num){
        int randomNumber = (int) (Math.random() * num);
        return randomNumber;
    }
}
