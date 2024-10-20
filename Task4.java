import java.util.Arrays;
import java.util.Scanner;


public class  Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char [] a1 = s1.toCharArray();
        char [] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1, a2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
