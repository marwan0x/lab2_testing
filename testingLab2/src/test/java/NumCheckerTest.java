import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumCheckerTest {
    NumChecker numChecker;

    @BeforeEach
    void init(){
        numChecker = new NumChecker();
    }

    @Test
    void testPositiveNumbers(){
       Integer[] testCases = {1, 2, 103, 200, 5412, 5};

        for(Integer testCase: testCases){
            if(testCase%2 == 0){
                assertTrue(numChecker.isEven(testCase));
            }else{
                assertFalse(numChecker.isEven(testCase));
            }
        }
    }

    @Test
    void testNegativeNumbers(){
        Integer[] testCases = {-1, -23, -0};
        for(Integer testCase: testCases){
            if(testCase%2 == 0){
                assertTrue(numChecker.isEven(testCase));
            }else{
                assertFalse(numChecker.isEven(testCase));
            }
        }
    }
    @Test
    void testZero(){
        assertTrue(numChecker.isEven(0));
    }
    @Test
    void testPrimeNumbers(){
        Integer[] testCases = {2, 3, 5, 7, 11, 13, 17, 19, 23, 39, 41};
        for(Integer testCase: testCases){
            if(testCase%2 == 0){
                assertTrue(numChecker.isEven(testCase));
            }else{
                assertFalse(numChecker.isEven(testCase));
            }
        }
    }


}