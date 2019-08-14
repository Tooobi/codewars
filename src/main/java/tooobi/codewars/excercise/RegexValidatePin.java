package tooobi.codewars.excercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidatePin {
    public static boolean validatePin(String pin) {
        // Your code here...

        if (pin.length() == 4 || pin.length() == 6) {
            Pattern pattern = Pattern.compile("^(\\d{4}$|\\d{6}$)");
            Matcher matcher = pattern.matcher(pin);

            return matcher.find();
        }
        return false;
    }

}
