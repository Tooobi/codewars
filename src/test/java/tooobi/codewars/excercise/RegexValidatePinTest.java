package tooobi.codewars.excercise;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexValidatePinTest {

    @Test
    public void validPins() {
        Assert.assertEquals(true, RegexValidatePin.validatePin("1234"));
        assertEquals(true, RegexValidatePin.validatePin("0000"));
        assertEquals(true, RegexValidatePin.validatePin("1111"));
        assertEquals(true, RegexValidatePin.validatePin("123456"));
        assertEquals(true, RegexValidatePin.validatePin("098765"));
        assertEquals(true, RegexValidatePin.validatePin("000000"));
        assertEquals(true, RegexValidatePin.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertEquals(false, RegexValidatePin.validatePin("a234"));
        assertEquals(false, RegexValidatePin.validatePin(".234"));
    }

    @Test
    public void invalidLengths() {
        assertEquals(false, RegexValidatePin.validatePin("1"));
        assertEquals(false, RegexValidatePin.validatePin("12"));
        assertEquals(false, RegexValidatePin.validatePin("123"));
        assertEquals(false, RegexValidatePin.validatePin("12345"));
        assertEquals(false, RegexValidatePin.validatePin("1234567"));
        assertEquals(false, RegexValidatePin.validatePin("-1234"));
        assertEquals(false, RegexValidatePin.validatePin("1.234"));
        assertEquals(false, RegexValidatePin.validatePin("00000000"));
    }

    @Test
    public void edgeCase() {
        assertEquals(false, RegexValidatePin.validatePin("\"1234"));


    }
}
