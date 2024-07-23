import java.util.Scanner;

public class Main {
    public static void Fibonacci(int i, int j, int n){
        if(n==0){
            return;
        }
//        i+=j;
//        int temp = i;
//        i=j;
//        j=temp;
//        System.out.print( i + " ");
        int k = i+j;
        System.out.print(k+" ");
        Fibonacci(j, k, n-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter no of digits to print fibonacci series ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("0 ");
        System.out.print("1 ");
        Fibonacci(0, 1, n-2);
    }
}




