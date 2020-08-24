import java.time.LocalDateTime;

public class Calendar {
    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        //this is to insure time is being placed through out all fields simultaneously
        String timeMSG = getHMS(now);
        // the line 13 is what we are saying is getHMS
        System.out.println(timeMSG);
        timeMSG=getGreeting("Hello", "Derek", now);
        // make my function first then make the line above
        System.out.println(timeMSG);
        timeMSG=getRetirementAge("hello", "Derek" , 1995, "Tx");
        System.out.println(timeMSG);
        timeMSG=mergeTest(4, "Texas Rangers");
        System.out.println(timeMSG);
        timeMSG=mergeTest(14 , 4);
        System.out.println(timeMSG);
        timeMSG=mergeTest("Texas rangers" , "Padres", 10);
        System.out.println(timeMSG);



        //this is how i print it


    }
    public static String getHMS(LocalDateTime now) {
        //we assigned this to a new name to be able to than print out with that new name
        //reason being so we can keep our work and our print line in good looking order rather than all together
        String result =" Hello Derek Bacy " + "The current time is " + getHour(now) + ":" + getMinute(now);
        //this is what i want to print
        return  result;
        // this is compiling it to then be able to print it

    }
    public static String getGreeting(String greeting, String name, LocalDateTime now) {

        String result = greeting +" " + name + " The current time is " + getHour(now) + ":" + getMinute(now);

        return  result;


    }
    public static String getRetirementAge(String greeting, String name, int year , String state) {

        String result = greeting + " " + name + " I see you will be 66 in  " + (year+66) + " and live in " + state;

        return result;
    }
    public static String mergeTest(int score , String baseballTeam) {

        String result = score + " was the points  " + baseballTeam + " put up in last nights game  ";

        return result;
    }
    public static String mergeTest (int pointOne , int pointTwo) {

        String result = pointOne + " " + pointTwo;

        return result;
    }
    public static String mergeTest (String baseballTeam , String BaseballTeam2, int difference) {

        String result = baseballTeam + " lost to the " + BaseballTeam2 + " by a difference of " + difference;

        return result;
    }

    public static int getHour(LocalDateTime now) {
        int hourOfTheDay;


        hourOfTheDay = now.getHour();

        return hourOfTheDay;
    }
    public static int getDay(LocalDateTime now) {
        int dayOfTheMonth;


         dayOfTheMonth= now.getDayOfMonth();

        return dayOfTheMonth;
    }
    public static int getMonth(LocalDateTime now) {
        int monthOfTheYear;


        monthOfTheYear = now.getMonthValue();

        return monthOfTheYear;
    }
    public static int getMinute(LocalDateTime now) {
        int minuteOfTheHour;


        minuteOfTheHour = now.getMinute();

        return minuteOfTheHour;
    }
    public static int getSecond(LocalDateTime now) {
        int secondOfTheMinute;


        secondOfTheMinute = now.getSecond();

        return secondOfTheMinute;
    }
    public static int getYear(LocalDateTime now) {
        int yearOfTheDecade;


        yearOfTheDecade = now.getYear();

        return yearOfTheDecade;
    }

}


    //get day
    //get month
    //get minute
    //get second
    //get year

        //int hour = getHour();
        //System.out.println("The current hour is " + hour);
        //int month = getMonth();
        // System.out.println("The current month is " + month);
        // int day = getDay();
        // System.out.println("The current day is " + day);
        // int year = getYear();
        //  System.out.println("The current year is " + year);
        // int minute = getMinute();
        // System.out.println("The current minute is " + minute);
        // int second = getSecond();
        // System.out.println("The current second is " + second);
        //  System.out.println(getHMS());
        /// shift + F6 gives me the ability to change the name all at one time
