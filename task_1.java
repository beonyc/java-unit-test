//palindrom
package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class PalindromeServiceTest {
    private final String checkedText ;
    private final boolean expected ;

    public PalindromeServiceTest(String checkedText, boolean expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getTestData() {
        return new Object[][]{
                {"anna", true},
                {"anka", false},
                {"q", true}
        };
    }
    @Test
    public void shouldCheckPalindrome(){
        PalindromeService pal=new PalindromeService();
        boolean actual=pal.isPalindrome(checkedText);
        assertEquals(expected,actual);

    }
}