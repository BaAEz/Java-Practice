import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int Power(int i, int j){
        if(i==0){
            return(0);
        }
        if(j==0){
            return(1);
        }
        int n = Power(i, j-1);
        int m = n*i;
        return(m);
    }
    public static void main(String[] args) {
        System.out.print("Type number ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print("Type power ");
        int j = sc.nextInt();
        System.out.print(Power(i,j));
    }
}