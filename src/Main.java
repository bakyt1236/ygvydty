import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int df = pilus(a,b) + koboityy(a,b);
        System.out.println(a+b);
        System.out.println("Кобойтуу-"+a*b);
        System.out.println(df);
    }

    public static int pilus(int a, int b) {
        int sum = a + b;
        return sum;
    }


    public static int koboityy(int a, int b) {
        int sum2 = a * b ;
        return sum2;
    }
}