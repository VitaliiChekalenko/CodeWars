public class SmashWords {

    public static String smash(String... words) {
        String out="";
                for (int i=0; i<words.length; i++) {
            out+= words[i]+" ";
        }
        return out.trim();
    }
}