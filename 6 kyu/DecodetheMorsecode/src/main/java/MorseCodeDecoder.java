//In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superceded by voice and digital data communication channels, it still has its use in some applications around the world.
//        The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−. The Morse code is case-insensitive, traditionally capital letters are used. When the message is written in Morse code, a single space is used to separate the character codes and 3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.
//
//        NOTE: Extra spaces before or after the code have no meaning and should be ignored.
//
//        In addition to letters, digits and some punctuation, there are some special service codes, the most notorious of those is the international distress signal SOS (that was first issued by Titanic), that is coded as ···−−−···. These special codes are treated as single special characters, and usually are transmitted as separate words.
//
//        Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.
//
//        For example:
//
//        MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
////should return "HEY JUDE"
//        NOTE: For coding purposes you have to use ASCII characters . and -, not Unicode characters.
//
//        The Morse code table is preloaded for you as a dictionary, feel free to use it:
//
//        Coffeescript/C++/Go/JavaScript/PHP/Python/Ruby/TypeScript: MORSE_CODE['.--']
//        C#: MorseCode.Get(".--") (returns string)
//        Elixir: morse_codes variable
//        Elm: MorseCodes.get : Dict String String
//        Haskell: morseCodes ! ".--" (Codes are in a Map String String)
//        Java: MorseCode.get(".--")
//        Kotlin: MorseCode[".--"] ?: "" or MorseCode.getOrDefault(".--", "")
//        Rust: self.morse_code
//        Scala: morseCodes(".--")
//        All the test strings would contain valid Morse code, so you may skip checking for errors and exceptions. In C#, tests will fail if the solution code throws an exception, please keep that in mind. This is mostly because otherwise the engine would simply ignore the tests, resulting in a "valid" solution.
//
//        Good luck!
//
//        After you complete this kata, you may try yourself at Decode the Morse code, advanced.


public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String[] arr = morseCode.split("   ");
        String s = "";

        for (int i = 0, j=0; i<arr.length; i++ ) {
            String[] temp = arr[i].split(" ");
            for (String a: temp ) {
                if(i>j){ s+= " ";j++;}

                // Special
                if(a.equals("...---...")){ s+= "SOS"; continue;}

                // Letter
                if(a.equals(".-")){ s+= "A"; continue;}
                if(a.equals("-...")){ s+= "B"; continue;}
                if(a.equals("-.-.")) {s+= "C"; continue;}
                if(a.equals("-..")) {s+= "D"; continue;}
                if(a.equals(".")) {s+= "E"; continue;}
                if(a.equals("..-.")) {s+= "F"; continue;}
                if(a.equals("--.")) {s+= "G"; continue;}
                if(a.equals("....")) {s+= "H"; continue;}
                if(a.equals("..")) {s+= "I"; continue;}
                if(a.equals(".---")) {s+= "J"; continue;}
                if(a.equals("-.-")) {s+= "K"; continue;}
                if(a.equals(".-..")) {s+= "L"; continue;}
                if(a.equals("--")) {s+= "M"; continue;}
                if(a.equals("-.")) {s+= "N"; continue;}
                if(a.equals("---")) {s+= "O"; continue;}
                if(a.equals(".--.")) {s+= "P"; continue;}
                if(a.equals("--.-")) {s+= "Q"; continue;}
                if(a.equals(".-.")) {s+= "R"; continue;}
                if(a.equals("...")) {s+= "S"; continue;}
                if(a.equals("-")) {s+= "T"; continue;}
                if(a.equals("..-")) {s+= "U"; continue;}
                if(a.equals("...-")) {s+= "V"; continue;}
                if(a.equals(".--")) {s+= "W"; continue;}
                if(a.equals("-..-")) {s+= "X"; continue;}
                if(a.equals("-.--")) {s+= "Y"; continue;}
                if(a.equals("--..")) {s+= "Z"; continue;}

                //Digit
                if(a.equals("-----")) {s+= "0"; continue;}
                if(a.equals(".----")) {s+= "1"; continue;}
                if(a.equals("..---")) {s+= "2"; continue;}
                if(a.equals("...--")) {s+= "3"; continue;}
                if(a.equals("....-")) {s+= "4"; continue;}
                if(a.equals(".....")) {s+= "5"; continue;}
                if(a.equals("-....")) {s+= "6"; continue;}
                if(a.equals("--...")) {s+= "7"; continue;}
                if(a.equals("---..")) {s+= "8"; continue;}
                if(a.equals("----.")) {s+= "9"; continue;}

                //Punctuation Mark
                if(a.equals("-.-.--")) {s+= "!"; continue;}
                if(a.equals(".-...")) {s+= "&"; continue;}
                if(a.equals(".--.-.")) {s+= "@"; continue;}
                if(a.equals("-.--.-")) {s+= ")"; continue;}
                if(a.equals("-.--.")) {s+= "("; continue;}
                if(a.equals("---...")) {s+= ":"; continue;}
                if(a.equals("--..--")) {s+= ","; continue;}
                if(a.equals("-...-")) {s+= "="; continue;}
                if(a.equals(".-.-.-")) {s+= "."; continue;}
                if(a.equals("-....-")) {s+= "-"; continue;}
                if(a.equals(".-.-.")) {s+= "+"; continue;}
                if(a.equals("..--..")) {s+= "?"; continue;}
            }
        } return s.trim();
    }
}