import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int value = (int)((Math.random()*6)+1);
        return value;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] sums = new int[11];
        for (int i = 0; i < n; i++){
            sums[(rollDie() + rollDie()) - 2] += 1;
        }
        return sums;
    }


    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("How many pairs of dice would you like to roll?");
       int n = scan.nextInt();
       int sums[] = sumOfTwoDice(n);
       int add = 2;
       for (int i = 0; i < 11; i++){
           System.out.println("% of rolls where sum == " + (add) + ":  " + (sums[i]/(double)n)*100);
           add++;
       }

        scan.close();
    }
}
