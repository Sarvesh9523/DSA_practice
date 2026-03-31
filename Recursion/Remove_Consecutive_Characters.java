public class Remove_Consecutive_Characters {
    public static void main(String[] args) {
        // Input
        String s = "geeks for geeks is best";

        // Printing original string
        System.out.println("Input  : " + s);

        // Printing result
        System.out.println("Output : " + deleteConsecutiveStrings(s));
    }

    static String deleteConsecutiveStrings(String s) {
        // Result string to store the final output
        StringBuilder newElement = new StringBuilder();

        // Loop through the string to remove consecutive duplicate characters
        for (int i = 0; i < s.length(); i++) {
            // Append character only if it's different from the last added character
            if (newElement.length() == 0 || s.charAt(i) != newElement.charAt(newElement.length() - 1)) {
                newElement.append(s.charAt(i));
            }
        }

        // Return the final string with consecutive duplicates removed
        return newElement.toString();
    }
}
