import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        //list for managing multiple students.
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.println("\n--- Student Grade Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade to Student");
            System.out.println("3. Display Students and Grades");
            System.out.println("4. Show Top Performer");
            System.out.println("5. Exit");

            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();// Consume the newline character

            switch(choice){
                case 1:
                    //add student
                    System.out.println("Enter Name: ");
                    String name = scanner.nextLine();
                    students.add(new Student(name));
                    System.out.println("Student Added!");
                    break;

                case 2:
                    //add grade to existing student.
                    System.out.println("Enter student number: ");
                    int studentIndex = scanner.nextInt();
                    if(studentIndex >= 0 && studentIndex < students.size()){
                        System.out.println("Enter grade: ");
                        double grade = scanner.nextDouble();
                        System.out.println("Grade added");
                    }else{
                        System.out.println("Invalid Student number");
                    }
                    break;
                
                case 3:
                    //Display infos
                    System.out.println("\n --- STUDENTS AND GRADES --- ");
                    for(int i = 0; i < students.size();i++){
                        System.out.println(i + " : " + students.get(i));
                    }
                    break;
                case 4:
                    //show top performer
                    if(!students.isEmpty()){
                        Student topStudent = students.get(0);
                        for(Student student : students){
                            if(student.getAverageGrade() > topStudent.getAverageGrade()){
                                topStudent = student;
                            }
                        }
                        System.out.println("Top performer : " + topStudent);
                    }else{
                        System.out.println("No students found.");
                    }
                    break;
                case 5 :
                    //exit
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
