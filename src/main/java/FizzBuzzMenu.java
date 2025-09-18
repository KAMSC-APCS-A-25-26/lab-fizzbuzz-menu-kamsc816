import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Display Fizz Numbers ");
        System.out.println("2. Display Buzz Numbers");
        System.out.println("3. Display FizzBuzz Numbers");
        System.out.println("4. Exit");

        int run = sc.nextInt();

        switch(run)
        {
            case 1:
                for(int num=0; num<100; num++)
                {
                    if(num%3==0)
                    {
                        System.out.print(num + ", ");
                    }
                }
                break;
            case 2:
                for(int num=0; num<100; num++)
                {
                    if(num%5==0)
                    {
                        System.out.print(num + ", ");
                    }
                }
                break;
            case 3:
                for(int num=0; num<100; num++)
                {
                    if(num%15==0)
                    {
                        System.out.print(num + ", ");
                    }
                }
                break;
            case 4:
                System.out.print("Goodbye");
                break;

        }
    }
}