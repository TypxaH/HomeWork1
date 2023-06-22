import java.util.Scanner;

public class Main {
    //Да се напише метод, който приема
    //цяло число, което ще приемаме за
    //година, и прoверява дали тя е била
    //високосна или не.
    public static boolean isLeapYear(int year){
        if (year % 400 == 0){
            return true;
        }else if (year % 100 == 0){
            return false;
        }else if (year % 4 == 0){
            return  true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year)?"It is a leap year.":"It is NOT a leap year.");
    }
}