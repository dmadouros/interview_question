package util;

public class ArrayUtils {

   public static char[] subArray(char[] source, int startAtIndex) {
      char[] destination = new char[source.length - startAtIndex];
      System.arraycopy(source, startAtIndex, destination, 0, source.length - 1);
      return destination;
   }
}
