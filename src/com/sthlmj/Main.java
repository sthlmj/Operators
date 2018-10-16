package com.sthlmj;

/**
 * Java operators summary link:
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
 *
 * Java operator precedence table:
 * http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
 */

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;  //result = 3
        System.out.println("1 + 2 = " + result);  //result = 3

        int previousResult = result;  //previousResult = 3

        result = result - 1;  //result = 2
        System.out.println(previousResult + " - 1 = " + result);  //previousResult = 3 result = 2

        previousResult = result;  //previousResult = 3   //result = 2

        result = result * 10;  //result = 20
        System.out.println(previousResult + " * 10 = " + result);  //2 * 10 = 20

        previousResult = result;  //previousResult = 20
        result = result / 5;  //result = 4
        System.out.println(previousResult + " / 5 = " + result); //20 / 5 = 4

        /**
         * The remainder operator, sometimes called modulo, returns the number that remains after the right-hand
         * number divides into the left-hand number as many times as it evenly can: 11 % 3 equals 2
         * because 3 fits into 11 three times, leaving 2 as the remainder.
         */
        previousResult = result;  //previousResult = 4
        result = result % 3;  //result = 1   //4 % 3 = 1
        System.out.println(previousResult + " % 3 = " + result);  // 4 % 3 = 1

        previousResult = result;  //previousResult = 4
        result = result + 1;  //result = 2

        System.out.println("Result is now " + result);

        result++;  //increment by 1
        System.out.println("Result is now " + result);

        result--;  //decrement by 1
        System.out.println("Result is now " + result);

        result += 2;  //increment by 2
        System.out.println("Result is now " + result);

        result *= 10;  //increment by *10
        System.out.println("Result is now " + result);

        result -= 10;  //decrement by 10
        System.out.println("Result is now " + result);

        result /= 10;  //decrement by /10
        System.out.println("Result is now " + result);

        boolean isAlien = false;  //sets isAlien to false
        if (isAlien == false)  //evaluate if isAlien is false, if false sout.
            System.out.println("It is not an alien!");

        int topScore = 80;  //sets topScore to 100
        if (topScore >= 100)  //evaluate if topScore == 100 or != 100 or >= 100 or < 100 or <= 100
            System.out.println("You got the high score!");
        else
            System.out.println("You didn't get the high score :(");

        int secondTopScore = 81;  //sets secondTopScore to 60
        /**
         * Using and && operators
         * Evaluates if topScore is bigger then secondTopScore and topScore less then 100.
         * Both conditions must be true to run the if.
         * Brackets () on the two conditions to make it more readable
         */
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than top score less then 100");
        else
            System.out.println("topScore is set to: " + topScore);
            System.out.println("secondTopScore is set to: " + secondTopScore);
            System.out.println("And you wanted to evaluate if: " + "topScore > secondTopScore && topScore < 100 ");
            System.out.println("topScore is: " + topScore + " and secondTopScore is: " + secondTopScore);

        /**
         * Using or || operator
         */
        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        /**
         * ternary operator below reads:
         * is isCar true? if true return true, otherwise : (the colon :) return false.
         *
         * format of ternary operator
         */
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        /**
         * challenge
         * 1. create a double variable with the value 20
         * 2. create a second variable of the type double with the value 80
         * 3. add both numbers up and multiply by 25
         * 4. use the remainder operator to figure out the remainder from the sum of #3 divided by 40
         * 5. write an "if" statement that displays a message "total was over the limit"
         *      if the remaining total (#4) is equal to 20 or less.
         */

        //1 -> 3
        double myFirstValue = 20d;
        double mySecondValue = 80d;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal: " + myTotal);

        //4
        // how many times does 2040 go into 2500? 2500 / 40 = 62,5
        // 62 * 40 = 2480. 20 is over the limit.
        double remainderOfMyTotal = myTotal % 40;
        System.out.println("remainderOfMyTotal: " + remainderOfMyTotal);

        if(remainderOfMyTotal <= 20)
            System.out.println("Total was over the limit");
        else
            System.out.println("Total was NOT over the limit");
    }
}
