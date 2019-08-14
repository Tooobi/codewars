package tooobi.codewars.excercise;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCountTest {
        @Test
        public void testCase1() {
            Assert.assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
        }

    }
