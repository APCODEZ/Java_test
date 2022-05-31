
import java.util.Scanner;  // Import the Scanner class
public class Main {
  public static void main(String[] args) {
    String name = "john";
    System.out.println(name);
    int myNum = 15;
    System.out.println(myNum);
    System.out.println(myNum + 5);
    //changing myNum to 20
    myNum = 20;
    System.out.println("After myNum changed to 20");
    System.out.println(myNum);
    System.out.println(myNum + 5);
    boolean bVal = true;
    System.out.println(bVal);
    int x = 5, y=1, z=3;
    System.out.println(x+y+z);
    java.lang.Math.tan(52);
    int time = 15;
    String result = (time < 18) ? "Good day." : "Goodevening.";
    System.out.println(result);
    int[] num = {5, 0, 6};
    System.out.println(num[2]);
    
    //using scanner class to get input statements
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    int userName = myObj.nextInt();  // Read user input
    System.out.println(userName + 5);  // Output user input
    
    
  }  
  
}