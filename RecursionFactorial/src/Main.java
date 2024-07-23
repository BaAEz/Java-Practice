import java.util.Scanner;

public class Main {
    public static void Factorial(int n, int mul){
        if (n==0) {
            System.out.print(mul);
            return;
        }
        mul = mul * n;
        Factorial(n-1, mul);

    }
    public static void main(String[] args) {
        System.out.print("Enter no of digits for calculating Factorial ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial(n, 1);
    }
}