package core;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
 
import static org.junit.Assert.assertEquals;
 
@RunWith(Parameterized.class)


public class EvenNumberCheckerTest {
       private EvenNumberChecker pn;

@Before
       public void initialize() {
              pn = new EvenNumberChecker();  
                                }

       @Parameter(value = 0)
       public Integer inputNumber;

       @Parameter(value = 1)
       public Boolean expectedResult;

       @Parameters(name = "Iteration # {index}: Number: {0}; isEven? {1}")

       public static Collection<Object[]> evenNumbers() {
              Object[][] data = new Object[][] {
                  { 1, false },
                  { 2, true },
                  { 3, false },
                  { 4, true },
                  { 5, false },
                  { 6, true },
                  { 7, false },
                  { 8, true },
                  { 9, false },
                  { 10, true },
                  { 11, false },
                  { 12, true },
                  { 13, false },
                  { 14, true },
                  { 15, false },
                  { 16, true },
                  { 17, false },
                  { 18, true },
                  { 19, false },
                  { 20, true },
                  { 21, false },
                  { 22, true },
                  { 23, false },
                  { 24, true },
                  { 25, false },
                  { 26, true },
                  { 27, false },
                  { 28, true },
                  { 29, false },
                  { 30, true },
                  { 31, false },
                  { 32, true },
                  { 33, false },
                  { 34, true },
                  { 35, false },
                  { 36, true },
                  { 37, false },
                  { 38, true },
                  { 39, false },
                  { 40, true },
                  { 41, false },
                  { 42, true },
                  { 43, false },
                  { 44, true },
                  { 45, false },
                  { 46, true },
                  { 47, false },
                  { 48, true },
                  { 49, false },
                  { 50, true },
                  { 51, false },
                  { 52, true },
                  { 53, false },
                  { 54, true },
                  { 55, false },
                  { 56, true },
                  { 57, false },
                  { 58, true },
                  { 59, false },
                  { 60, true },
                  { 61, false },
                  { 62, true },
                  { 63, false },
                  { 64, true },
                  { 65, false },
                  { 66, true },
                  { 67, false },
                  { 68, true },
                  { 69, false },
                  { 70, true },
                  { 71, false },
                  { 72, true },
                  { 73, false },
                  { 74, true },
                  { 75, false },
                  { 76, true },
                  { 77, false },
                  { 78, true },
                  { 79, false },
                  { 80, true },
                  { 81, false },
                  { 82, true },
                  { 83, false },
                  { 84, true },
                  { 85, false },
                  { 86, true },
                  { 87, false },
                  { 88, true },
                  { 89, false },
                  { 90, true },
                  { 91, false },
                  { 92, true },
                  { 93, false },
                  { 94, true },
                  { 95, false },
                  { 96, true },
                  { 97, false },
                  { 98, true },
                  { 99, false },
                  { 100, true }};
             
                     return Arrays.asList(data);
       }
 
@Test
       public void testEvenNumberChecker() {
	   System.out.println("Is " + inputNumber + " a even number? - " + expectedResult);
       assertEquals(expectedResult, pn.val(inputNumber));
       }
}