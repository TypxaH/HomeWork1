import java.util.Scanner;

public class Main {
    //�� �� ������ �����, ����� ������
    //���� ����� ����� 1 � 7 � �����
    //���������� ��� �� ��������� (��
    //��������� ����). ��� �������� �����,
    //����� �� � � ���� ��������, �� ��
    //����� �Maybe on another planet�.

    public static String getDayOfWeek(int day){
        String result;
        switch (day){
            case 1: result = "Monday"; break;
            case 2: result = "Tuesday"; break;
            case 3: result = "Wednesday"; break;
            case 4: result = "Thursday"; break;
            case 5: result = "Friday"; break;
            case 6: result = "Saturday"; break;
            case 7: result = "Sunday"; break;
            //case 7: result = "Sunday"; break;
            default: result = "Maybe on another planet";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in [1..7]: ");
        int number = scanner.nextInt();
        System.out.printf("The day of week is %s",getDayOfWeek(number));
    }
}