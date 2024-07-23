import java.util.Scanner;

public class CalcClass {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select no 1-4 \n" +
                " 1. Addition\n" +
                " 2. Subtraction\n" +
                " 3. Multiplication\n" +
                " 4. Division\n");
        int x = sc.nextInt();
        if(x<5){
            System.out.print("Enter a = ");
            int a = sc.nextInt();
            System.out.print("Enter b = ");
            int b = sc.nextInt();
             switch(x){
                case 1 :
                addition ad = new addition();
                System.out.printf("Your ans is %d",ad.add(a, b));
                break;
                 case 2 :
                subtraction sb = new subtraction();
                System.out.printf("Your ans is %d",sb.sub(a, b));
                break;
                case 3 :
                multiplication mu = new multiplication();
                System.out.printf("Your ans is %d",mu.mul(a, b));
                break;
                case 4 :
                division dv = new division();
                System.out.printf("Your ans is %d",dv.div(a, b));
                break;
                default:
                System.out.printf("Invalid Selection");
              }

        }   else{
                 System.out.print("Invalid Input");
        }



    }
}
