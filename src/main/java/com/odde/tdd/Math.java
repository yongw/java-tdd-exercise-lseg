package com.odde.tdd;

import java.util.ArrayList;

public class Math {
  public int[] getPrimeNumbers(int number) {
    if (number <= 1) {
      return new int[]{};
    }
    int acc = 2;
    int quotient = number;
    ArrayList<Integer> result = new ArrayList<>();
    while (acc <= quotient / 2) {
      if (quotient % acc == 0) {
        result.add(acc);
        quotient = quotient / acc;
        acc = 2;
      } else {
        acc++;
      }
    }
    result.add(quotient);
    return result.stream().mapToInt(i -> i).toArray();
  }
}
