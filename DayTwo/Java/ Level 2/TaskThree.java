import java.util.Scanner;

public class TaskThree{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter score: ");
    
    int score = input.nextInt();
    
        if(score >= 50){
        
        System.out.println("pass");
        }
        
        else if(score <= 50){
        
        System.out.println("fail");
        }
       
       }
    }

