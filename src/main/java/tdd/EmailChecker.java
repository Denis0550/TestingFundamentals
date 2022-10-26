package tdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker {
    // Using the TDD approach, write a method that validates the email address pass
    // in the parameter.
    public boolean checkingTheEmail(String email) {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9_.&-]+@+[a-zA-Z0-9]+\\.+[a-z]{2,3}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
