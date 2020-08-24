public class Day3Behind {

    public static void main(String[] args) {

        // ass. opper.
        // what an equal lsign normal means
        // mutable vs immutable
        String name;
        name = "Derek Luttrell Bacy";
        // equal sign is the connector
        String houseColor = "Blue";


        String zipcode = "  75149";
        String zipPlusFour = "76259-1023";

        System.out.println("'" + zipcode + "'");

        String newZip = zipcode.trim();

        System.out.println("'" + newZip + "'");

        String newNewZip = newZip.trim();

        System.out.println("'" + newNewZip + "'");


        System.out.println(name.charAt(0));
        // shows me the letter in that location for name


        System.out.println(name.contains("x"));
        // gives true or false if the string holds this character in it

        int spaceOne = name.indexOf(" ") + 1;
        int spaceTwo = name.indexOf(" ", spaceOne + 1) + 1;
        String initials = "" +name.charAt(0) + name.charAt(spaceOne) + name.substring(spaceTwo ,spaceTwo +1);
        // give my initials as well as line 88

        System.out.println(name.indexOf(" "));
        // -1 means character is not found in string. will give positive number if it is


        System.out.println(name.replace("e", "x"));
        // replace the letter
        // the black parts pull up by self while typing



        String[] names = name.split(" ");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        /// space out my name in string


        String speech = "Now is the time for all good men to come to the aid of there country.";

        System.out.println(speech.length());
        // gives my number of letters


        System.out.println(speech.split(" ").length);
        //gives me the number of words


        System.out.println(speech.split(" ")[0]);
        // gives me the word in that location


        System.out.println(name.toLowerCase());
        // makes all letter lower case

        System.out.println(name.toUpperCase());
        //makes all letters cap

        System.out.println(speech.substring(20,32));
        //cuts everything but what you want
        // placing just one number will give you the rest after it


        // Ice Cube says, "Today was a good day."
        System.out.println("Ice Cube says, \"Today was a good day.\"");
        System.out.println("Derek is a student \nDerek is trying");
        // \ keeps the quotes
        // \n takes it to the next line

        String student = "Derek Luttrell Bacy";
        String[] students = student.split(" ");
        String initialss = "";
        for (int i=0;i<students.length;i++) {
            initials = initials + students[i].substring(0,1) + ". ";


            //this gives me initials
        }
        System.out.println(initials.toLowerCase());

        String sheSaid = "She said, \"oh, no you didn\'t\nand I said, \"oh yes I did\"";
        System.out.println(sheSaid);
        String newSheSaid = sheSaid.replace("She", "Barbara");
        newSheSaid = newSheSaid.replace( "oh ", "oh, " );
        newSheSaid = newSheSaid.replace(" I did", " I Did");
        System.out.println(newSheSaid);
        // this gives me string to keep together rather then have them spaced out in the final run





    }
}
