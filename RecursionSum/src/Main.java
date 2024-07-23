import java.util.Scanner;

public class Main {
    public static void Sum(int n, int sum){
        if (n==0) {
            System.out.print(sum);
            return;
        }
        sum+=n;
        Sum(n-1, sum);

    }
    public static void main(String[] args) {
        System.out.print("Enter no of digits for adding");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sum(n, 0);
    }
}