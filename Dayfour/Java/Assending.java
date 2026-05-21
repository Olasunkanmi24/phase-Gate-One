public class Assending{

    public static int smallestNumber(int[] array){
    
        int smallest = array[0];
        
        for(int count = 1; count < array.length; count++){
        
            if(array[count] < smallest){
            
            smallest = array[count];
            }
        }
        
       
        
        
    }
    
            int largest = array[0];
        
            for(int count = 1; count < array.length; count++){
        
            if(array[count] > largest){
            
            largest = array[count];
            }
        }
        
        
          
   }
    
    public static void main(String[] args){
    
    int[] numbers = {14,9,6,5,8,10};
    
    int result = SmallestNumber(numbers);
    
    System.out.print("largest element is: " + result);
    
    }

