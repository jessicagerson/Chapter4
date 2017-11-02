package lab;

// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Parker");
        Student student2 = new Student("Jess");
        
        student1.inputGrades();
        student1.getAverage();
        student1.summary();
        //print average for Mary
        System.out.println();
        
        student2.inputGrades();
        student2.getAverage();
        student2.summary();
        //print average for Mike
    }
}