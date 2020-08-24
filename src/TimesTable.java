import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=s.nextInt();
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }

        // this gives my a input in the run field. numbers 1 - 10 can be entered and i will get that number multiplied by 1-10


        int sizeOFGrid = 10;
        for (int header=0; header<=sizeOFGrid; header++) {
            if (header == 0) {
                System.out.println("x\t|\t");
            }else {
                System.out.println(header + "\t");
            }
        }
        System.out.println("\n---------------------------------------------");
        for (int x=1; x<=sizeOFGrid; x++) {
            System.out.print(x + "\t|\t");
            for (int y = 1; y <= sizeOFGrid; y++) {
                System.out.print(x * y + "\t");
            }
            System.out.print("\n");
        }


    }
}

// this gives me an actual table