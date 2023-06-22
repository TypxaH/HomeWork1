import java.util.Scanner;

public class Main {
    //Да се напише метод, който приема
    //цяло число между 1 и 7 и връща
    //съответния ден от седмицата (на
    //английски език). При въведено число,
    //което не е в този интервал, да се
    //връща “Maybe on another planet”.

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