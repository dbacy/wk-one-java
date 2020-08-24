public class Day3Numbs {
    public static void main(String[] args) {

        // int, float, byte, double, long
        // the types for numbs

        String zipCode = "76259";

        System.out.println(zipCode + 1);
        //this will just add the one to the end


        int iZipCode = Integer.parseInt(zipCode);
        System.out.println(iZipCode + 1);
        // this way will add the 1 to the total already there


        //////// end of integer project


        System.out.println((5 + 7) * 5);


        int j = 10;
        j += 5; // j = j + 5
        System.out.println(j);


        j *= 3;
        System.out.println(j);

        int[] arrayOfInts = {2, 4, 6, 8, 10};
        int x = 4;
        System.out.println(arrayOfInts[x]);


        int k = 10;
        int n = ++k % 5;
        System.out.println("k " + k + " n " + n);

        // iteration ;and condition
        System.out.println(5 + 8 == 13);
        System.out.println(14 > 12);
        System.out.println(1 != 0);
        System.out.println(5 <= 3 + 2);
        // consider a conditional expresion


        // && = logical and || is logical or

        // && means both have to have both correct and || means one or the other is
        System.out.println(1 == 1 || 2 > 3);


        if (11 > 12) {
            System.out.println("eleven is less than twelve");

        }

        // ternary operator
        // (conditional expression) ? true : false;
        int age = 48;

        System.out.println("this person is " + ((age < 21) ? "not old" : " old ") + "enough to purchase alcohol");


        // homework


        int clubAge = 17;


        System.out.println("this person is " + ((clubAge < 18) ? " not old" : " old ") + " enough to enter the club");


        int withDrawRetirementAge = 79;

        System.out.println("this individual is " + ((withDrawRetirementAge < 65) ? " not old" : " old") + " enough to collect his/her money");

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
                // will give all the positive numbers
            } else {
                System.out.println(i + " is an odd number");
                // will give me all the odd numbers

            }

        }
            String name = "Derek Bacy";
            if (name.length() > 9) {
                System.out.println("This is a long name");
                // will tell me if the line is longer than 9
            } else {
                System.out.println("This is a short name");
                // will tell me if the line is shorter than 9

                // int x 10;
                //int remainder = x % 3;


                float price = 100;
                price *=2; // doubles the price
                price +=5; // adds 5 to the price
                price -=15; // subtracts 5 from price
                price *= .5; // divides by 2
                price /=2; // divides by 2



            }


        }

    }











