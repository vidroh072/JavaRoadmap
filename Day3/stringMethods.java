package Day3;
public class stringMethods {
    public static void main(String[] args) {
        String name = "Passward A";
        
        int length = name.length();
        char firstLetter = name.charAt(0);   // Index error if out of range  
        int index = name.indexOf(" ");        // -1 if not found
        int lastIndex = name.lastIndexOf("a");  // -1 if not found

        name = name.toUpperCase();      // Capitalize all letter
        name = name.toLowerCase();      // Lowerize all letter
        name = name.trim();             // Remove Left & Right Spaces

        // Replace Target Sequence Or Char With Given Replacement 
        name = name.replace("pass","LAST");
        name = "Abc";
        boolean isTrue;
        isTrue = name.isBlank();        // True if blank OR white space
        isTrue = name.isEmpty();        // True only if blank check length = 0
        isTrue = name.contains("A"); // Check if it contains the sequence
        isTrue = name.equals("a");  // check Equality caseSensative
        // true if not null, ignoring caseSensative
        isTrue = name.equalsIgnoreCase("a");

    }
    
}