import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter operation");
        String s=sc.next();
        ICalculator iCalculator=getCalculator.getObjCal(s);
        if(iCalculator instanceof Multiply){
            System.out.println("Enter num1");
            int a=sc.nextInt();
            System.out.println("Enter num2");
            int b=sc.nextInt();
            iCalculator.calculate(a,b);
        }
        if (iCalculator instanceof Sum){
            System.out.println("Enter num1");
            int a=sc.nextInt();
            System.out.println("Enter num2");
            int b=sc.nextInt();
            iCalculator.calculate(a,b);
        }

    }
}
