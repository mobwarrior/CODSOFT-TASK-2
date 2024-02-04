import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); 

        
        String[] subjects = new String[numSubjects];
        int[] marks = new int[numSubjects];

       
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter the name of Subject " + (i + 1) + ":");
            subjects[i] = scanner.nextLine();

            System.out.println("Enter the marks obtained in " + subjects[i] + " (out of 100):");
            marks[i] = scanner.nextInt();
            scanner.nextLine(); 
        }
        
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

       
        double averagePercentage = totalMarks / (double) numSubjects;  

       
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

      
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

