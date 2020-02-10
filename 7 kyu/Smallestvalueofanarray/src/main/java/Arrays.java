/*Write a function that can return the smallest value of an array or the index of that value. The function's 2nd parameter will tell whether it should return the value or the index.

Assume the first parameter will always be an array filled with at least 1 number and no duplicates. Assume the second parameter will be a string holding one of two values: 'value' and 'index'.

Arrays.findSmallest(new int[]{1,2,3,4,5}, 'value') // => 1
Arrays.findSmallest(new int[]{1,2,3,4,5}, 'index') // => 0

https://www.codewars.com/kata/544a54fd18b8e06d240005c0/train/java*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Arrays {

  public static int findSmallest( final int[] numbers, final String toReturn ) {

      System.out.println(IntStream.of(numbers).min().getAsInt());
      System.out.println(java.util.Arrays.asList(numbers).indexOf(1));
      List<Integer> s = new ArrayList<>();

      for (int i = 0; i < numbers.length; i++) {
          s.add(numbers[i]);
      }

    return toReturn.equals("value")? IntStream.of(numbers).min().getAsInt(): s.indexOf(IntStream.of(numbers).min().getAsInt()) ;
	}
}