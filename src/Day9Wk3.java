public class Day9Wk3 {
    public static void main(String[] args) {
        int[] numbers = {33, 2, 4, 432, 6, 63, 4, 56, 8, 8, 8, 8, 6, 76, 576, 8576, 4, 5678, 58, 5,
                45, 456, 4, 1, 28, 28, 839, 326, 215, 278, 3};


        String str = "Bob,Carroll,Bill,Ted,Alice,Hal,Dave,Billy,Jake,Sam,Joseph,Phil,Garth,Mark," +
                "Craig,Cathy,Barb,Adele,Julie";


        String strStates = "Alabama,Alaska,Arizona,Arkansas,California,Colorado,Connecticut,Delaware,Florida," +
                "Georgia,Hawaii,Idaho,Illinois,Indiana,Iowa,Kansas,Kentucky,Louisiana,Maine,Maryland," +
                "Massachusetts,Michigan,Minnesota,Mississippi,Missouri,Montana,Nebraska,Nevada,New Hampshire," +
                "New Jersey,New Mexico,New York,North Carolina,North Dakota,Ohio,Oklahoma,Oregon,Pennsylvania," +
                "Rhode Island,South Carolina,South Dakota,Tennessee,Texas,Utah,Vermont,Virginia,Washington," +
                "West Virginia,Wisconsin,Wyoming";

        String[] names = str.split(",");
        String[] states = strStates.split(",");

        //  how many 4s
        int count4s = 0;
        //  how many numbers evenly divisible by 7
        int divisibleBy7 = 0;
        //  add up all numbers that are greater than 300
        int sumOfBigNumbers = 0;
        //  count numbers less than 100
        int countOfNumbersLessThan100 = 0;
        // total number between 30 and 99
        int totalBetween30And99 = 0;
        int charAt1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                count4s++;
            }
            if (numbers[1] % 7 == 0) {
                divisibleBy7++;
            }
            if (numbers[i] > 300 ) {
                sumOfBigNumbers += numbers[i];
            }
            if (numbers[i] < 100) {
                countOfNumbersLessThan100++;
            }
        }
        System.out.printf("There are %d 4s%n", count4s);

        //  how many names are longer than 4
        //  how many names have 'a' as their second letter (Carroll, Hal,, Dave.......)
        //  have many names end with 'e'
        //  how many names contain an 'h'
        for (var name : names) {
            if (name.startsWith("B")) {
                System.out.println("name with a 'B' = " + name);
            }
            if (name.length() > 4) {
                System.out.println("this name has more than four characters in it " + name);
            }
            if (name.charAt(1) == 'a' ) {
                charAt1++;
            }
            if (name.endsWith("e")) {
                System.out.println(" name ends with e " + name);
            }
            if (name.contains("h")) {
                System.out.println("this name contains an h " + name);
            }



            }
        for (var state: states) {
            if (state.startsWith("New")) {
                System.out.println("there are the states that begin with the word new : ");

            }



        }

        //  how many states start with 'New'
        //  how many states are longer than 8 characters
        //  what is the shortest name for a state
        //  what states contain 'ss'

    }
}
