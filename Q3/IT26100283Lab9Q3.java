

public class IT26100283Lab9Q3 
    public static int add(int num1, int num2) {
		
        int sum = num1 + num2;
        return sum;
    }

    
    public static int multiply(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

   
    public static int square(int num) {
        int result = num * num;
        return result;
    }

    public static void main(String[] args) {
        
        
       
        int mult1 = multiply(3, 4);
        
        int mult2 = multiply(5, 7);
        
        int sum1 = add(mult1, mult2);
       
        int answer1 = square(sum1);


       
      
        int basicAdd1 = add(4, 7);
      
        int square1 = square(basicAdd1);
        
   
        int basicAdd2 = add(8, 3);
       
        int square2 = square(basicAdd2);
        
        
        int answer2 = add(square1, square2);


     
        System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + answer1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + answer2);
    }
}
