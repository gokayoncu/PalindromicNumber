import java.util.Scanner;

public class Project {
    static boolean isPalindom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            System.out.println(number +""+"is Palindromic Number.");
            return true;
        } else {
            System.out.println(number +""+"isn't Palindromic Number.");
            return false;
        }

    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number :");
        num= input.nextInt();
        System.out.println(isPalindom(num));
    }
}
