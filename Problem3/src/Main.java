import java.util.Scanner;

public class Main {
    //Да се напише метод, който приема
    //три числа и определя дали първото
    //се дели без остатък едновременно на
    //второто и третото.

    public static void sayIsFirstDividedBySecondAndThird(int num1, int num2, int num3){
        if (num1 % num2 == 0 && num1 % num3 == 0){
            System.out.printf("%d is divided by %d and %d.",num1,num2,num3);
        }
        else{
            System.out.printf("%d is NOT divided by %d and %d.",num1,num2,num3);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integer numbers:");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();

        sayIsFirstDividedBySecondAndThird(a,b,c);
    }
}