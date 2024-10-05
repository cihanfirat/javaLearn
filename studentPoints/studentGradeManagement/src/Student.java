import java.util.ArrayList;

public class Student {
    //encapsulated student name and grades, for data security.
    private String name;
    private ArrayList<Double> grades;

    //constructor
    public Student(String name){
        this.name=name;
        this.grades = new ArrayList<>();
    }

    //method for adding grades.
    public void addGrade(double grade){
        grades.add(grade);
    }

    //method for calculate average
    public double getAverageGrade(){
        if(grades.isEmpty()){
            return 0;
        }
        double sum = 0;
        for(double grade : grades){
            sum+= grade;
        }
        return sum/grades.size();
    }

    //to display student info
    public String printGrade(){
        return name + " - Average grade: " + getAverageGrade();
    }
    
    public String printName(){
        return name;
    }
}
