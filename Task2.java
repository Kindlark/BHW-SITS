import java.util.Scanner;

public class  Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next() + " ", s2 = "";
        int n = 1;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                n++;
            }else{
                s2 = s2 + s.charAt(i) + n;
                n = 1;
            }
        }
        System.out.print(s2);
    }
}
