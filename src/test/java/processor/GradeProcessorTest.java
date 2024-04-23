package processor;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeProcessorTest {

    private GradeProcessor gradeProcessor;
    @BeforeEach
    void setUp() {
        gradeProcessor = new GradeProcessor();
    }
    @Test
    void shouldReturnPassWhenStudentScoredAboveSixtyPercent(){
        String result = gradeProcessor.checkToSeeIfStudentPassOrFail(64);
        Assertions.assertEquals("Pass", result);
    }

    @Test
    void shouldReturnFailWhenStudentScoredBelowSixtyPercent(){
        String result = gradeProcessor.checkToSeeIfStudentPassOrFail(58);
        Assertions.assertEquals("Fail", result);
    }
}