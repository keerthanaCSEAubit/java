import java.util.Scanner;
class gradecalc{
    String Stname;
     int A,B,C,D,E,TOTAL;
     void unit(){
         System.out.println("Enter your name:");
         Scanner ch = new Scanner(System.in);
         Stname = ch.nextLine();
        System.out.println("enter your language1 mark:");
        A = ch.nextInt();
      System.out.println("enter your language2 mark:");
           B  = ch.nextInt();
     System.out.println("enter your mathematics mark:");
           C = ch.nextInt();
     System.out.println("enter your Science mark:");
           D  = ch.nextInt();
     System.out.println("enter your Social mark:");
           E  = ch.nextInt();
     TOTAL = A+B+C+D+E;
     System.out.println("total is : " +TOTAL);
    }
   void calculation()
{
     if (TOTAL>= 450)
         System.out.println("Your grade is : O");
      else 
         System.out.println("Your grade is : A");
}
}

class Grade{
public static void main (String[] args){
       gradecalc grace =new gradecalc();
       grace.unit();
      grace.calculation();
}
}
       