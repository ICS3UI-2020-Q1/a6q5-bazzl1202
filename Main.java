import java.util.Scanner;
/**
 * Switch numbers in an array so they are in ascending order
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // tell the user to enter in 2 values
    System.out.println("Please enter the 2 values for the array");

    // create constant for 2 values
    final int TWO_VALUES = 2;

    // create temporary variable for swap
    int temp = 1;

    // create a array
    int[] values = new int[TWO_VALUES];

    // put values into the array using a loop
    for(int i = 0; i < TWO_VALUES; i++){
      values[i]= input.nextInt();
    }
     
    // swaps the numbers in the array
    for(int i = 0; i < TWO_VALUES; i++){
      if(values[0] > values[1]){
        temp = values[1];
        values[1] = values[0];
        values[0] = temp;
      }
    }
    // tell the user the numbers in ascending order
    System.out.println("Your numbers in ascending order are " + values[0] + " and " + values[1]);
  
  }
}
