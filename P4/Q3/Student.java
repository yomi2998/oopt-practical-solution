package P4.Q3;

public class Student {

    private String studentID, name;
    private int quizzesTaken, totalScore;
    private static double quizContribution;

    public Student() {
        this("","");
    }

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.quizzesTaken = 0;
        this.totalScore = 0;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public int getQuizzesTaken() {
        return this.quizzesTaken;
    }

    public void addQuiz(int score) {
        ++this.quizzesTaken;
        this.totalScore += score;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public double getAverageScore() {
        return (double) this.totalScore / this.quizzesTaken;
    }

    public static void setQuizContribution(double quizContribution) {
        Student.quizContribution = quizContribution;
    }

    public static double getQuizContribution() {
        return Student.quizContribution;
    }

    public double getQuizFinalScore() {
        return getAverageScore() * getQuizContribution();
    }
}