package P4.Q2;

public class Student {

    private String studentID, name;
    private int quizzesTaken, totalScore;

    public Student() {
        studentID = "";
        name = "";
        quizzesTaken = 0;
        totalScore = 0;
    }

    public Student(String id, String n) {
        studentID = id;
        name = n;
        quizzesTaken = 0;
        totalScore = 0;
    }

    public void setStudentID(String id) {
        studentID = id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getQuizzesTaken() {
        return quizzesTaken;
    }

    public void addQuiz(int score) {
        ++quizzesTaken;
        totalScore += score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public double getAverageScore() {
        return (double) totalScore / quizzesTaken;
    }

    public static void main(String args[]) {
        Student stud = new Student();
        System.out.println("No-arg constructor student is created as stud.");
        System.out.println("stud name and ID: " + stud.getName() + " " + stud.getStudentID());

        Student stud2 = new Student("22WMD12345", "Test");
        System.out.println("With-arg constructor student is created as stud2.");
        System.out.println("stud2 name and ID: " + stud2.getName() + " " + stud2.getStudentID());

        System.out.println("Now let's try add quiz's score.");
        System.out.println("Current quiz total score and average score for stud2: " + stud2.getTotalScore() + " " + stud2.getAverageScore());
        System.out.println("It had shown NaN because cannot divide by 0.");
        
        stud2.addQuiz(20);
        stud2.addQuiz(40);
        stud2.addQuiz(60);
        stud2.addQuiz(80);
        stud2.addQuiz(100);
        System.out.println("After adding 5 quizzes with 20, 40, 60, 80, 100 scores respectively: ");
        System.out.println("Current quiz total score and average score for stud2: " + stud2.getTotalScore() + " " + stud2.getAverageScore());
    }
}