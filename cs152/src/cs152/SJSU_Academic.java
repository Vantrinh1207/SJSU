package cs152;
import java.util.*;


//Base class
class SJSU_Academic {
 protected String course;

 SJSU_Academic(String course) {
     this.course = course;
 }

 String cheer() {
     return "";
 }
}

//Students can change course
class SJSU_Student extends SJSU_Academic {

 SJSU_Student(String course) {
     super(course);
 }

 // Students can change course
 void swapCourse() {
     // Implement this method.
     // A student will switch between course cs152 and cs153
     // In java, to compare two strings you need the equals method.
     //  i.e  course.equals("cs152") will be true if the course is cs152
	 if (this.course.equals("cs152")) {
         return true
     } else if (this.course.equals("cs153")) {
         this.course = "cs152";
     }
 }

 // Students cheer with their course number.
 String cheer() {
     return "Spartan! " + this.course;
 }
}

class SJSU_Professor extends SJSU_Academic {

 SJSU_Professor(String course) {
     super(course);
 }

 // Add a method for the professors to cheer properly!
 String cheer() {
     return "Spartans! " + this.course;
 }

}

//Don't change anything in Main.
class Main {
 public static void main(String[] args) {

     // 4 students
     SJSU_Student student1 = new SJSU_Student("cs152");
     SJSU_Student student2 = new SJSU_Student("cs152");
     SJSU_Student student3 = new SJSU_Student("cs152");
     SJSU_Student student4 = new SJSU_Student("cs153");

     SJSU_Student[] students = {student1, student2, student3, student4};


     // 2 professors
     SJSU_Professor prof1 = new SJSU_Professor("cs152");
     SJSU_Professor prof2 = new SJSU_Professor("cs153");

     SJSU_Professor[] professors = {prof1, prof2};


     Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     scanner.nextLine(); // Consume newline from input

     for (int i = 0; i < n; ++i) {
         String input = scanner.nextLine();
         
         if (input.equals("miss")) {
             // It's a miss, students change their favorite course!
             for (SJSU_Student student : students) {
                 student.swapCourse();
             }
         } else { // it's a score!
             // Professors cheer.
             for (SJSU_Professor prof : professors) {
                 System.out.println(prof.cheer());
             }
             // Students cheer.
             for (SJSU_Student student : students) {
                 System.out.println(student.cheer());
             }
             System.out.println();
         }
     }

 }
}
