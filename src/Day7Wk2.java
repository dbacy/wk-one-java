public class Day7Wk2 {


    public  static  String getMonthName(int monthNumber) {
        String  monthName = "";

        switch (monthNumber) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
            default: monthName = "invalid month number"; break;
            //this is called a switch statement
        }
        return  monthName;

    }

    public static int monthDays(int monthNumber) {

        int days = 5;

        switch (monthNumber)
        {
            case 1: days=31; break;
            case 2: days=28; break;
            case 3: days=31; break;
            case 4: days=30; break;
            case 5: days=31; break;
            case 6: days=30; break;
            case 7: days=31; break;
            case 8: days=30; break;
            case 9: days=31; break;
            case 10: days=30; break;
            case 11: days=31; break;
            case 12: days=30; break;
        }
        return days;
    }
    public static int dayOfWeek(String monthNumber) {

        int day = 5;

        switch (monthNumber)
        {
            case "Sunday": day= 0; break;
            case"sun" : day= 0; break;
            case "Sun": day=0; break;
            case "Monday": day=1; break;
            case "Mon": day=1; break;
            case "mon": day=1; break;
            case "Tuesday": day=2; break;
            case "tues": day=2; break;
            case "Tues": day=2; break;
            case "Wednesday": day=3; break;
            case "wed": day=3; break;
            case "Wed": day=3; break;
            case "Thursday": day=4; break;
            case "thurs": day=4; break;
            case "Thurs": day=4; break;
            case "Friday": day=5; break;
            case "fri": day=5; break;
            case "Fri": day=5; break;
            case "Sat": day=6; break;
            case "sat": day=6; break;
            case "Saturday": day=6; break;


        }
        return  day; }




    public static void main(String[] args)
    {
        // 3 - March
        // 9 - September
        int x = 8;
        //monthNumber and monthName are both reading from the same int typed in

        System.out.println("number of days in " + getMonthName(x) + ": " + monthDays(x));
        System.out.println(dayOfWeek("sun"));

    }
}

//if (monthNumber ==1) {
      //  monthName = "January";
      //  }else if (monthNumber ==2) {
      //  monthName = "February";
      //  }else  if (monthNumber == 3) {
      //  monthName = "March";
      //  }else  if (monthNumber == 4) {
      //  monthName = "April";
      //  }else  if (monthNumber == 5) {
      //  monthName = "May";
      //  }else  if (monthNumber == 6) {
        //monthName = "June";
        //}else  if (monthNumber == 7) {
        //monthName = "July";
        //}else  if (monthNumber == 8) {
        //monthName = "August";
        //}else  if (monthNumber == 9) {
        //monthName = "September";
        //}else  if (monthNumber == 10) {
        //monthName = "October";
        //}else  if (monthNumber == 11) {
        //monthName = "November";
        //}else  if (monthNumber == 12) {
        //monthName = "December";
        //}