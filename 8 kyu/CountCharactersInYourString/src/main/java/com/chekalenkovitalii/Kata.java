package com.chekalenkovitalii;

import java.util.HashMap;
import java.util.Map;

//https://www.codewars.com/kata/52efefcbcdf57161d4000091/train/java
public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> res = new HashMap<>();
        String[] split = str.split("");
        if (str.isEmpty()) return res;
        for (String s : split) {
            char c = s.charAt(0);
            res.put(c, !res.containsKey(c) ? 1 : res.get(c) + 1);
        }
        return res;
    }
}