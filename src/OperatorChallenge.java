public class OperatorChallenge {
    public static void main(String[] args){
        /*
        * 1 create a doubel variable with a value of 20.00
        * 2 create a second variable type double value = 80.00;
        * 3 add both numbers, then multiply by 100.00
        * 4 use the remainder operator, to figure out what remainder
        *   from the result of the operation in ste three,
        *   and 40.000, will be.
        * 5 create a boolean variable that assigns the value true,
        *   if the remainder in step four is 0.00 false if it's not zero
        * 6 output the boolean variable just to see the result is.
        * 7 write if-then state that display a message, 'got some remainder',
        *   if boolean in step five is not true.
        * */
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double result = (firstDouble + secondDouble) * 100.00d;
        double remainderResult = (double) (result % 40.00d);
        System.out.println(result / 40.00d);
        boolean isRemainder = (remainderResult == 0.0) ? true : false;
        System.out.println("Is Remainder : " + isRemainder);
        if(!isRemainder) {
            System.out.println("Got some remainder" + remainderResult);
        }

    }

}
