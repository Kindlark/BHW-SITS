import java.util.Scanner;

public class  Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, q = sc.nextInt(), m = ((sc.nextInt()+10)%13)+2, y = sc.nextInt(), k = y%100, j = y/100; // переменные как на вики
        h = (q + ((13*(m + 1))/5) + k + (k/4) + (j/4) - (2*j)) % 7; // формула как в вики
        switch(h) { // вывод дней по вики
            case(0):
                System.out.print("Saturday");
                break;
            case(1):
                System.out.print("Sunday");
                break;
            case(2):
                System.out.print("Monday");
                break;
            case(3):
                System.out.print("Tuesday");
                break;
            case(4):
                System.out.print("Wednesday");
                break;
            case(5):
                System.out.print("Thursday");
                break;
            case(6):
                System.out.print("Friday");
                break;
        } // но это всё неправильно, не могу найти ошибку
    }
}
