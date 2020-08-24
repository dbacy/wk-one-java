public class Weather {
    public static void main(String[] args) {
        //create an array of temperture for each day in the month of August
        int[] iTempertures = new int[31];
        iTempertures[0] = 94;

        //94.6
        float[] iTemps = new float[31];
        iTemps[0] = 94.6f;

        String[] sNames = new String[6];
        sNames[0] = "Shawntez";
        sNames[1] = "Eric";
        sNames[2] = "Daniel";
        sNames[3] = "Derek";
        sNames[4] = "Gulnar";
        sNames[5] = "Joshua";


        // iterate through each name in the iNames array and print them to the screen
        for (int i = 0;i<sNames.length;i++) {
            System.out.println(sNames[i]);

            System.out.println(sNames[sNames.length -1]);
        }


    }
}