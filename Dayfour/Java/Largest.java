public class Largest{

    public static int largestNumber(int[] array){
    
        int largest = array[0];
        
        for(int count = 1; count < array.length; count++){
        
            if(array[count] > largest){
            
            largest = array[count];
            }
        }
        
        return largest;
        
        
    }
    
    public static void main(String[] args){
    
    int[] numbers = {14,9,6,5,8,10};
    
    int result = largestNumber(numbers);
    
    System.out.print("largest element is: " + result);
    
    }
}
