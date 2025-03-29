import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number");
        int a = Integer.parseInt(s.nextLine());
        System.out.println(a*2);

        //System.out.println(Integer.parseInt(s.nextLine())*2);
    }
}
