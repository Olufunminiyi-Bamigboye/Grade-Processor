package processor;

public class GradeProcessor {
    /*
    Determine whether a student pass or fail
    A student pass when he scores 60%
    A student fail when he scores below 60%

    totalQuestion = 100
    studentMark = ?
    Percentage score = studentMark/totalQuestion * 100
     */

    public String checkToSeeIfStudentPassOrFail(double score){
        String result = "";
        double gradeResult = (score / 100) * 100;
        if(gradeResult > 60){
            result = "Pass";
        }else{
            result = "Fail";
        }
        return result;
    }
}