
public class CourseGrade
{
    public static void main(String[] args)
    {
        int examWeight = 70;
        int labWeight = 20;
        int hwWeight = 10;
        double examScore;
        double labScore;
        double hwScore;
        double finalGrade;
        
        IO.output("Enter your exam grade: ");
        examScore = IO.inputDouble( );
        IO.output("Enter your lab grade: ");
        labScore = IO.inputDouble( );
        IO.output("Enter your homework grade: ");
        hwScore = IO.inputDouble( );
        
        examScore = examScore * (examWeight / 100.0);
        labScore = labScore * (labWeight / 100.0);
        hwScore = hwScore * (hwWeight / 100.0);
        finalGrade = examScore + labScore + hwScore;
        
        IO.outputln("Your final grade is " + finalGrade);
    }

}
