public class Loop {
    public static void main(String[] args) {

        // for loop takes three parts
        //start , end , pace
        for (int i = 0; i < 21; i += 2) {
            System.out.println(i);
        }

        // while loop - pre test loop
        int x = 1;
        while (x < 11) {
            System.out.println(x);
            x++;

        }
        x = 20;
        // do while - post test loop

        do {
            System.out.println(x);
            x++;
        } while (x < 11);

        //for each loops through each item in a ( array , list , hashtable, etc)
        int[] numbers = {2, 4, 6, 8, 10, 12};
        for (int item : numbers) {
            System.out.println(item);

        }

        for (int i = 0; i < 30; i += 3) {
            System.out.println(i);
        }

        int[] nums = {-3, -2, -1, 0, 1, 2, 3,};
        for (int items : nums) {
            System.out.println(items);
        }
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }

        String[] appleColors = {"green", "red", "yellowish"};
        for (String fruit : appleColors) {
            System.out.println(fruit);
        }
        int y = 7;
        while (y < 28) {
            System.out.println(y);
            y++;
        }

        for (int i = 0; i < 16; i += 1)
        {
            System.out.println(i);
        }
        int[] jumps = {3, 6, 9, 12, 15, 18};
        float sum = 0;
        for (int spots : jumps)

        {
            sum+=spots;
            System.out.println(spots);
            System.out.println("average" + sum/nums.length);

        }

        do {
            System.out.println(x);
            x++;
        }while (x < 23) ;

        int z = 2;
        while (x<8) {
            System.out.println(z);
            z++;
        }

        int[] speedBumbs = {1, 2, 3, 4, 5, 6, 7};
        for (int roads: speedBumbs) {
            System.out.println(roads);
        }






    }
}

