import java.util.Scanner;

public class Main {
    //�� �� ������ �����, ����� ��o������
    //���� ���� ������ � ������ �����. ��
    //�� �� ������ ���� ���������� ����� �
    //������ ��� �����.
    //�������� �� �������� ����
    //���������, � ���������� �� ��
    //�������� � ������.

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