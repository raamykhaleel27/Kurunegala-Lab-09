import java.util.Scanner;

public class IT26101261Lab9Q4 {

    
    public static double calcFinalMark(double assignMark, double examMark) {
        return (assignMark * 0.30) + (examMark * 0.70);
    }

 
    public static char findGrades(double mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    
    public static void printDetails(String name, double mark, char grade) {
        System.out.println(name + "\t\t" + mark + "\t\t" + grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        
        
        for (int i = 0; i < 5; i++) {
         
            System.out.println("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assign = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = input.nextDouble();
            System.out.println(); 

          
            finalMarks[i] = calcFinalMark(assign, exam);
            grades[i] = findGrades(finalMarks[i]);
        }

        
        System.out.println("Name\t\tFinal Mark\tGrade");
        
      
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }
}
