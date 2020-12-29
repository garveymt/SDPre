import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    int num = 0;

    if(num % 6 == 0){
      System.out.println("The number is even");
    }
    else if(num % 7 == 0){
      System.out.println("The number is odd");
    }

  scanner.close();
  }
}
