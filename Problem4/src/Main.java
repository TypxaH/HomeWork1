import java.util.Scanner;

public class Main {
    //Да се напише метод, който прoверява
    //дали един символ е гласна буква. Да
    //не се отчита дали въведената буква е
    //главна или малка.
    //Символът се получава като
    //параметър, а резултатът да се
    //отпечата в метода.

    public static void isVowel(char ch){

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
            System.out.printf("The letter '%c' is a vowel.",ch);
        }else {
            System.out.printf("The letter '%c' is not a vowel.", ch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        isVowel(letter);
    }
}