public class Add{

    public static int addTowNumbers(int numberOne , int numberTwo){
    
    int add = numberOne + numberTwo;
    
    return add;
    }
    
    public static int evenNumbers(int number){
            boolean even = false;
    
        if(number % 2 == 0){
        
            even = true;
            
        }
        
        return even;
    
    }
    
     public static int evenNumbers(int number){
     
       return number * number;
     
     }
     
      public static int celsiusToFahrenheit(int number){
      
        double total = (celsius * 9 / 5) + 32;
        
        return total;
      
      }
      
      public static int primeNumbers(int number){
      
        boolean even = false;
        for(int index = 2; count <=number/2; index++){
        
        
            if(index % index != 0){
            
            even = true;
            
            
            }
            
            }
            return even;
      }
      
    
    public static void main(String[] args){
    
    System.out.println(addTowNumbers(2,10));
    System.out.println(evenNumbers(2));
    System.out.println(square(4));
    System.out.println(celsiusToFahrenheit(100));
    System.out.println(primeNumbers(4));
    
    
    
    }
    
}

    
    
       
    
