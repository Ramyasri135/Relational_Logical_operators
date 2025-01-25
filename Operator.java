import java.util.Scanner;
    public class Operator {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("entef a value: ");
            int a=sc.nextInt();
            System.out.println("enter another number: ");
            int b=sc.nextInt();
            System.out.println();
            System.out.println("THE BELOW OPERATIONS ARE ARITHEMATIC OPERATIONS");
          System.out.println("1:sum of two given numbers:" + (a+b));
          System.out.println("2:subtraction of two given numbers:" + (a-b));
          System.out.println("3:multiplication of two given numberrs:" +(a*b));
          System.out.println("4:division of given two nnumbers:" + (a/b));
          System.out.println();
          System.out.println(" THE BELOW OPERATIONS ARE RELATIONAL OPERATORS ");
          System.out.println("1:a<b:" + (a<b));
          System.out.println("2:a>b:" + (a>b));
          System.out.println("3:a==b:" + (a==b));
          System.out.println("4:a!=b:" + (a!=b));
          System.out.println("5:a<=b:" + (a<=b));
          System.out.println("6:a>=b:" + (a>=b));
          System.out.println();
          System.out.println("THE BELOW OPERATIONS ARE LOGICAL OPERATIONS ");
          System.out.println("1:a<5 && b>10:" + (a<5 && b>10));
          System.out.println("2:a<5 || b>50:" + (a<5 || b>50));
          System.out.println("3:!(a<5 || b>50):" + (a>= 5 && b <= 50));
       }
        
    }
    

