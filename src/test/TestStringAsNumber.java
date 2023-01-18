import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringAsNumber {
    private StringAsNumber stringAsNumber;

    @BeforeEach
    public void testInit() {
        this.stringAsNumber = new StringAsNumber();
    }

    @Test
    public void testOneLetter() {
        assertEquals(1, stringAsNumber.sumOfString("A"));
        assertEquals(2, stringAsNumber.sumOfString("B"));
        assertEquals(26, stringAsNumber.sumOfString("Z"));
        assertEquals(5, stringAsNumber.sumOfString("E"));
        assertEquals(0, stringAsNumber.sumOfString(""));
        assertEquals(0, stringAsNumber.sumOfString(" "));
    }

    @Test
    public void testShortNames() {
        //T = 20, I = 9, M = 13
        assertEquals(42, stringAsNumber.sumOfString("Tim"));
        assertEquals(42, stringAsNumber.sumOfString(" T i m "));
        //T = 20, O = 15, M = 13
        assertEquals(48, stringAsNumber.sumOfString("Tom"));
        assertEquals(48, stringAsNumber.sumOfString("To  m"));
        //J = 10, O = 15, E = 5
        assertEquals(30, stringAsNumber.sumOfString("Joe"));
        assertEquals(30, stringAsNumber.sumOfString("J o e"));
    }

    @Test
    public void testLongerNamesWithSpecialCharacters() {
        //F = 6, R = 18, I = 9,E = 5,D = 4, C = 3, H = 8 FRIEDRICH = 80
        assertEquals(80, stringAsNumber.sumOfString("Friedrich"));
        assertEquals(80, stringAsNumber.sumOfString("Friedr$i%c  h"));
        //A = 1, N = 14, B = 2, E = 5, L = 12 ANNABELLE = 66
        assertEquals(66, stringAsNumber.sumOfString("Annabelle"));
        assertEquals(66, stringAsNumber.sumOfString("Ann*abe._lle"));
    }
}
