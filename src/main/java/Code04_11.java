import java.util.Scanner;
public class Code04_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var1, var2;
        int diff;

        System.out.print("첫번째 : ");
        var1 = sc.nextLine();

        System.out.print("두번째 : ");
        var2 = sc.nextLine();

        diff = var1.length() - var2.length();
        System.out.println("두 문자열 길의 차이는 " + diff + "입니다.");

        sc.close();

    }
}
