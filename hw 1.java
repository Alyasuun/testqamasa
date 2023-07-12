import java.util.Scanner;

public class hww {
    public static void main(String[] args) { 

        double odin;
        double dva;
        double tri;
        Scanner MyScanner = new Scanner(System.in);

        System.out.println ("write your first number:");
        odin=MyScanner.nextInt();
        System.out.println ("write your second number:");
        dva=MyScanner.nextInt();
        System.out.println ("write your third number:");
        tri=MyScanner.nextInt();

        MyScanner.close();

        int bonus;
        double NewSalary;

        if (odin < dva && odin < tri) {
            System.out.println ("Your smaller number is : " + odin);
        }
        else if (dva < odin && dva < tri) {
            System.out.println ("Your smaller number is : " + dva);
        }
        else {
            System.out.println ("Your smaller number is : " + tri);
        }
        double r= (odin+ dva+ tri)/3;
        System.out.println ("Your arithmetic mean : " + r);
    }   
}
