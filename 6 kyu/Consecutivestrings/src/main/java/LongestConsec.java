class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {

        String done = "";
        for (String s : strarr) {
            if(s.length()>done.length()){
                done=s;
            }

        }
        if(strarr.length== 0 || k > strarr.length || k <= 0){
            return "";
        }

        return done+strarr[k];
    }
}