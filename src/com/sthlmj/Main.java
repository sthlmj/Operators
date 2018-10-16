package com.sthlmj;

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
    }
}
