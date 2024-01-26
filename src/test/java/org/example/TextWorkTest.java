package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextWorkTest {
    @Test
    public void mustHaveText(){
        //given
        String str = "Madam, I'm Adam!";

        //when
        boolean result = TextWork.isText(str);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void mustHaveNoText(){
        //given
        String str = "";

        //when
        boolean result = TextWork.isText(str);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void IsPalindromeOneTrue() {
        //given
        String str = "Madam, I'm Adam!";

        //when
        boolean result = TextWork.isPalindrome(str);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void IsPalindromeFalse() {
        //given
        String str = "Hello world!";

        //when
        boolean result = TextWork.isPalindrome(str);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void IsPalindromeTwoTrue() {
        //given
        String str = "Was it a cat I saw?";

        //when
        boolean result = TextWork.isPalindrome(str);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void mustCalculateLengthString(){
        //given
        String str = "Was it a cat I saw?";

        //when
        int result = TextWork.calculateLengthString(str);

        //then
        Assertions.assertEquals(19, result);
    }

    @Test
    public void mustCalculateNoLengthString(){
        //given
        String str = "";

        //when
        int result = TextWork.calculateLengthString(str);

        //then
        Assertions.assertEquals(-1, result);
    }
}
