//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.
// C can be placed before D (500) and M (1000) to make 400 and 900.

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {

        HashMap<String, Integer> values = new HashMap<String, Integer>();
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);
        values.put("IV", 4);
        values.put("IX", 9);
        values.put("XL", 40);
        values.put("XC", 90);
        values.put("CD", 400);
        values.put("CM", 900);

        var number = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                var x = s.substring(i, i + 2);
                if(values.containsKey(x)) {
                    number += values.get(x);
                    i++;
                } else {
                    number += values.get(s.substring(i, i + 1));
                }
            } else {
                number += values.get(s.substring(i, i + 1));
            }
        }
        return number;
    }
}
