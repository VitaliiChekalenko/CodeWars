package org.example;
//https://www.codewars.com/kata/586f6741c66d18c22800010a/train/java
//2,2,2 --> 2
//2,6,2 --> 12 (2 + 4 + 6)
//1,5,1 --> 15 (1 + 2 + 3 + 4 + 5)
//1,5,3  --> 5 (1 + 4)
public class Kata {
  public static int sequenceSum(int start, int end, int step) {
    int count = 0;
    for (int i = start; i <= end; i+= step) {
    count+=i;
    }
  return count;
  }
}