/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Paattern {
    public static boolean useRegex(final String input) {
        // Compile regular expression
        final Pattern pattern = Pattern.compile("a+|e+|i+|o+|u+|A+|E+|I+|O+|U+", Pattern.CASE_INSENSITIVE);
        // Match regex against input
        final Matcher matcher = pattern.matcher(input);
        // Use results...
        return matcher.find();
    }
}
