import java.util.Scanner;
class palin{
  public static void main(String [] args)
{
      String original, reverse = "";
      Scanner ch = new Scanner (System.in);
      System.out.println("enter the string:");
      original = ch.nextLine();
      int length = original.length();
      for ( int i = length-1; i>=0 ;i--)
      reverse= reverse+original.charAt(i);
      if (original.equals(reverse))
            System.out.println( " is palindrome");
      else
          System.out.println("not palindrome");
}
}