import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilTest {
    ArrayUtil arrayUtil;

    @BeforeEach
    void init(){
        arrayUtil = new ArrayUtil();
    }

    @Test
    void testEmptyArrayMax(){
        Integer[] testArray1 ={};
        assertNull(arrayUtil.max(testArray1));

        Integer[] testArray2 = new Integer[0];
        assertNull(arrayUtil.max(testArray2));

    }

    @Test
    void testEmptyArrayMin(){
        Integer[] testArray1 ={};
        assertNull(arrayUtil.min(testArray1));

        Integer[] testArray2 = new Integer[0];
        assertNull(arrayUtil.min(testArray2));

    }

    @Test
    void testOneElementArray(){
        // testing an array with one element,
        // but what can that element be?
        // the element will be chosen from a set
        // of possibilities, create an array with only
        // that element, then test that array.
        int[] elementPossibilities = {-43,-1,0,1,31, 100};
        for(int possibility : elementPossibilities){
            Integer[] testArray = {possibility};
            assertEquals(possibility, arrayUtil.max(testArray));
            assertEquals(possibility, arrayUtil.min(testArray));

        }
    }

    @Test
    void testArrayFullWithTheSameElement(){
        int[] elementPossibilities = {-43,-1,0,1,31, 100};
        Integer[] testArray = new Integer[5];
        for (int elementPossibility : elementPossibilities) {
            Arrays.fill(testArray, elementPossibility);
            assertEquals(elementPossibility, arrayUtil.max(testArray));
            assertEquals(elementPossibility, arrayUtil.min(testArray));
        }
    }

    @Test
    void testMaxIsLastNumber(){
        Integer[] testArray = {-33, -67, 43, 2414, 0, 12123};
        assertEquals(12123, arrayUtil.max(testArray));
    }
    @Test
    void testMaxIsRandomlyPlaced(){
        Integer[] testArray = {-33, -67, 43, 2414, 0, 412};
        assertEquals(2414, arrayUtil.max(testArray));
    }

    @Test
    void testMaxIsFirstElement(){
        Integer[] testArray = {1987, -67, 43, -312, 0, 412};
        assertEquals(1987, arrayUtil.max(testArray));
    }

    @Test
    void testMinIsLastElement(){
        Integer[] testArray = {1987, -67, 43, -312, 0, -1023};
        assertEquals(-1023, arrayUtil.min(testArray));
    }

    @Test
    void testMinIsRandomlyPlaced(){
        Integer[] testArray = {1987, -67, 43, -312, 0, 412};
        assertEquals(-312, arrayUtil.min(testArray));
    }

    @Test
    void testMinIsFirstElement(){
        Integer[] testArray = {-1987, -67, 43, -312, 0, 412};
        assertEquals(-1987, arrayUtil.min(testArray));
    }
    @Test
    void testAllNegativeNumbers(){
        Integer[] testArray = {-123,-2134, -154, -764, -652, -963};
        assertEquals(-123, arrayUtil.max(testArray));
        assertEquals(-2134, arrayUtil.min(testArray));
    }

    @Test
    void testAllPositiveNumbers(){
        Integer[] testArray = {123, 2134, 154, 764, 652, 963};
        assertEquals(123, arrayUtil.min(testArray));
        assertEquals(2134, arrayUtil.max(testArray));
    }

}