public class IfElse {
    public static void main(String[] args) {
        System.out.println("If Else");

        boolean isAlien = false;
        if(!isAlien) { // or isAlien == false
            System.out.println("It is not alien!");
            System.out.println("I am not scared in alien!");
        }

        int topScore = 80;
        if(topScore >= 100) {
            System.out.println("You got a perfect score!");
        } else {
            System.out.println("Better luck next time.");
        }

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than secondTop score and less than 100");
        }
        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the condition are true");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true statement!");
        }

        String makeOfCar = "Mercedes";
        boolean isDomestic = makeOfCar == "Mercedes" ? false : true;
        if(isDomestic){
            System.out.println("This car is domestic to our country.");
        }
    }
}