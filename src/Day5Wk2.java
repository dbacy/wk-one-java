import Utils.java.java.Utils;

import java.time.LocalDateTime;

public class Day5Wk2 {
    public static void main(String[] args) {
        // float 32  7 dec.
        //double 64  15 dec.
        //bool  is true or false
        // char is a single letter
        // string can hold 2.147 billion  letters
        double amt = Utils.getDouble("Enter Loan Amt: ");
        double rate = Utils.getDouble("Enter Rate: ");
        int periods = Utils.getNumber("Number of months: ");
        double loanAmt = computePayment(amt, rate, periods);
        System.out.println("Monthly loan payment: " + loanAmt);

    }

    public static double computePayment(double loanAmt, double rate, int numPeriods) {
        double futureValue = 0;
        double interest = rate / 100.0;
        double partial1 = Math.pow((1 + interest), -numPeriods);
        double denominator = (1 - partial1) / interest;
        double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
        return answer;
        //gives my an enter active screen to find the amt i would pay every month for an x amt
    }       //  end of computePayment



    }




    // just a few rules to follow
    // public means everyone in the world can see it
    // static means its not used with a class
    //you will either see double or void      double means i want a  return value given back     void means i dont know what i want
    // after double or void i need to put a descriptive name
    // can have zero or hundreds of parameters
    //if it holds a return value put the first variable as the variable answer
    // private is so only ppl in your class can see it
    // if it needs information from the class then it will need to be static   if not needed then non static is used










