//isadult
package org.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {
    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age=age;
        this.result=result;
    }

    @Parameterized.Parameters(name = "{index}: {0} + {1} ")
    public static Object[][] getTextData() {
        return new Object[][] {
                {18,true},
                {17,false},
                {28,true},
                {21,true}
        };
    }
    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();

        boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("age should be ...",result,isAdult);
    }

}