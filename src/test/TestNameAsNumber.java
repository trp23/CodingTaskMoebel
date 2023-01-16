import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNameAsNumber {
    private NameAsNumber nameAsNumber;

    @BeforeEach
    public void testInit() {
        this.nameAsNumber = new NameAsNumber();
    }

    @Test
    public void testOneLetter() {
        assertEquals(1,nameAsNumber.calculateSumOfName("A"));
        assertEquals(2,nameAsNumber.calculateSumOfName("B"));
        assertEquals(26,nameAsNumber.calculateSumOfName("Z"));
        assertEquals(5,nameAsNumber.calculateSumOfName("E"));
        assertEquals(0,nameAsNumber.calculateSumOfName(""));
        assertEquals(0,nameAsNumber.calculateSumOfName(" "));
    }

    @Test
    public void testShortNames() {
        //T = 20, I = 9, M = 13
        assertEquals(42,nameAsNumber.calculateSumOfName("Tim"));
        assertEquals(42,nameAsNumber.calculateSumOfName(" T i m "));
        //T = 20, O = 15, M = 13
        assertEquals(48,nameAsNumber.calculateSumOfName("Tom"));
        assertEquals(48,nameAsNumber.calculateSumOfName("To  m"));
        //J = 10, O = 15, E = 5
        assertEquals(30,nameAsNumber.calculateSumOfName("Joe"));
        assertEquals(30,nameAsNumber.calculateSumOfName("J o e"));
    }

    @Test
    public void testLongerNamesWithSpecialCharacters() {
        //F = 6, R = 18, I = 9,E = 5,D = 4, C = 3, H = 8 FRIEDRICH = 80
        assertEquals(80,nameAsNumber.calculateSumOfName("Friedr$i%c  h"));
        //A = 1, N = 14, B = 2, E = 5, L = 12 ANNABELLE = 66
        assertEquals(66,nameAsNumber.calculateSumOfName("Ann*abe._lle"));
    }
}
