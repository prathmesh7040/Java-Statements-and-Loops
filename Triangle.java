import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a == b && b == c) System.out.println("Equilateral Triangle");
        else if (a == b || b == c || a == c) System.out.println("Isosceles Triangle");
        else System.out.println("Scalene Triangle");
    }
}