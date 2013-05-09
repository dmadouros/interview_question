package interview;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AnswerTests {

   Question sut;

   @Before
   public void setUp() {
      sut = new Question();
   }

   @Test
   public void whenInputIsNormalNumericString_shouldConvertToInt() {
      assert 12345 == sut.strToInt("12345");
   }

   @Test(expected = RuntimeException.class)
   public void _whenInputIsNull_shouldThrowException() {
      sut.strToInt(null);
   }

   @Test(expected = RuntimeException.class)
   public void whenInputIsEmptyString_shouldThrowException() {
      sut.strToInt("");
   }

   @Test(expected = RuntimeException.class)
   public void whenInputContainsNonDigitalCharacters_shouldThrowException() {
      sut.strToInt("1234V");
   }

   @Test
   public void whenInputHasLeadingPositiveSign_shouldConvertToInt() {
      assert 12345 == sut.strToInt("+12345");
   }

   @Test
   public void whenInputHasLeadingNegativeSign_shouldConvertToInt() {
      assert -12345 == sut.strToInt("-12345");
   }

   @Test(expected = RuntimeException.class)
   public void whenInputExceedsMaxInt_shouldThrowException() {
      sut.strToInt("2147483648");
   }
}
