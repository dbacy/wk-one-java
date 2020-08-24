public class Day8Wk2
{
    public static void main(String[] args)
    {
        // iterate through the array of numbers to find a particular number

            int[] num = {102,153,136, 255, 85, 221, 76, 8, 119 };
            int numToFind = 97;
          int notDivisible = 0;

            for (int i = 0; i <num.length; i++)
            {
                System.out.println("looking at number " + num[i]);
                if (num[i] % numToFind == 0)
                {
                    System.out.println("this is a multiple");
                }        continue;
                //notDivisible++;


            //System.out.println(notDivisible + " of these numbers are not divisible by " + numToFind);

        }

            // christmas tree
        int sizeOFTree = 5;
        for (int i=0; i<sizeOFTree;  i++) {
                                                // i rep. each line
            for (int j=0; j<sizeOFTree - i; j++) {
                ///                             // j rep. spaces
                System.out.println(" ");
                //this one is used to gives us a starting point
            }
            for (int k=0; k<i*2-1; k++) {
                                                // k rep. asterisks
                System.out.println("*");
                //this one filled everything into it
            }
            System.out.println();
        }

    }
}







    //int[] nums = {102,153,136, 255, 85, 221, 76, 8, 119 };
    //int numsToFind = 97;
    //boolean foundNumber = false;

       // for (int i = 0; i <nums.length; i++) {
       // System.out.println("looking at number " + nums[i]);
      //  if (numsToFind == nums[1]) {
      //  foundNumber = true;
      //  System.out.println("found");
      //  break;

       // }
      //  if (foundNumber) {
      //  System.out.println("the number " + numsToFind + " is in the array");
      //  }else {
      //  System.out.println("the number " + numsToFind + " is not in the array");