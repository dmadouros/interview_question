package interview;

import util.ArrayUtils;

public class Answer extends Question {

   public int strToInt(String s) {
      boolean minus = false;

      char[] chars = s.toCharArray();

      if (chars[0] == '-') {
         chars = ArrayUtils.subArray(chars, 1);
         minus = true;
      }
      else if (chars[0] == '+') {
         chars = ArrayUtils.subArray(chars, 1);
      }

      long result = 0;

      for(char c : chars) {
         if (c > '0' && c < '9') {
            result = 10 * result + c - '0';
         }
         else {
            throw new RuntimeException();
         }
      }

      if (result > Integer.MAX_VALUE) {
         throw new RuntimeException();
      }

      if (minus) {
         result *= -1;
      }

      return (int) result;
   }
}
