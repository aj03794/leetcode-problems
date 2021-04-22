import java.util.Arrays;
// I initially did this via horizontally scanning
// You could also do this via vertical scanning
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] args) {

        String prefix = "";
        // handles the case where there is only 1 value in the array
        if(args.length == 1 ) {
            return args[0];
        }

        if(args.length == 0) {
            return "";
        }


//         Need to find which initial string is longer
//         so we don't have an array out of bounds exception
        var x = Math.min(args[0].length(), args[1].length());
        System.out.println(x);
//         Find the max prefix between 0th and 1st index
        for (int i = 0; i <= x; i++) {
            var firstSubstring = args[0].substring(0, i);
            var secondSubstring = args[1].substring(0, i);
            System.out.println(firstSubstring);
            System.out.println(secondSubstring);
            if (firstSubstring.equals(secondSubstring)) {
                System.out.println("Substrings match: " + firstSubstring + " " + secondSubstring);
                prefix = firstSubstring;
            } else {
                // End the loop
                i = x;
            }
        }

        // If the prefix between the first two elements was only 1 character
        // Then we there's no way the prefix can get any longer
        if (args.length == 2) {
            return prefix;
        } else {
            // Look at next words using the length of the prefix or string depending on which is smaller
            prefix = getNext(prefix, Arrays.copyOfRange(args, 2, args.length));
        }

        System.out.println("Longest prefix: " + prefix);

        // I think this next solution has n^2 time complexity

//        var currentLetter = "";
//        var currentTemp = null;
//        var lastTemp = null;
//        // loop through each and look at the letter at each index
//        for (int i = 0; i <= args.length; i++) {
//             if (currentTemp == null && lastTemp == null) {
//                 currentTemp =
//             }
//        }

        return prefix;
    }

    private String getNext(String prefix, String[] words) {
        System.out.println("-------");
        System.out.println(Arrays.toString(words));
        var min = Math.min(prefix.length(), words[0].length());

        String newPrefix = null;
        for (int i = 0; i <= min; i++) {
            var first = prefix.substring(0, i);
            var second = words[0].substring(0, i);
            if (first.equals(second)) {
                System.out.println("Matches: " + prefix);
                newPrefix = first;
            } else if (i == 1 || i == 0) {
                newPrefix = "";
            } else {
                i = min;
            }
        }

        if(words.length > 1) {
            return getNext(newPrefix, Arrays.copyOfRange(words, 1, words.length));
        }

        return newPrefix == null ? prefix : newPrefix;
    }
}
