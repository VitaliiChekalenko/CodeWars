public class HowDoICompare {
    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0] == x)
                return "everything";
        }
        return "nothing";
    }
    
    static final Object[][] specialNumbers = {
        {42, "everything"},
        {42 * 42, "everything squared"},
    };
}