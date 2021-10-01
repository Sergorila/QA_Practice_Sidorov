import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hi!");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(luckyTicket(num));
    }

    public static boolean luckyTicket(int num)
    {
        if (num >= 100000 && num <= 999999)
        {
            int sum1 = num / 100000 + num / 10000 % 10 + num / 1000 % 10;
            int sum2 = num % 10 + num % 100 / 10 + num % 1000 / 100;
            if (sum1 == sum2)
            {
                return true;
            }
            else return false;
        }
        else return false;
    }
}
