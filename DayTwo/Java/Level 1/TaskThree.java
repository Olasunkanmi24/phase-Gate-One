import java.util.Scanner;

public class TaskThree{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first Number: ");
    
    int firstNumber = input.nextInt();
    
    System.out.print("Enter Second Number: ");
    
    int secondNumber = input.nextInt();
    
    int sum = firstNumber + secondNumber;
    
    System.out.print("sum is: " + (firstNumber + secondNumber));
    
    }
    }
    
