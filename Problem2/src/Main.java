import java.util.Scanner;

public class Main {
    //Да се напише метод, който проверява
    //дали остатъкът при деление на 3 на
    //две числа е един и същ.
    //Да се реши задачата по 2 начина:
    //като отпечатвате резултатът директно
    //в метода. И като направите, така че
    //методът да връща резултат.

    public static void sayIsRemaindersAreEqualDividedBy3(double num1, double num2){
        if (num1 % 3 == num2 % 3){
            System.out.println("The remainders is equal.");
        }
        else{
            System.out.println("The remainders is NOT equal.");
        }
    }

    public static boolean isRemaindersAreEqualDividedBy3(double num1, double num2){
        return num1 % 3 == num2 % 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer numbers:");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();

        sayIsRemaindersAreEqualDividedBy3(a,b);
        System.out.printf("The remainders is equal, this is %b",isRemaindersAreEqualDividedBy3(a,b));
    }
}