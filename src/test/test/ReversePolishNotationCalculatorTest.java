import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        int sum = reversePolishNotationCalculator.calculatePolishNotation("4 3 +");
        Assertions.assertEquals(7, sum);
    }

    @Test
    public void shouldCalculateSubtraction() {
        int difference = reversePolishNotationCalculator.calculatePolishNotation("4 3 -");
        Assertions.assertEquals(1, difference);
    }

    @Test
    public void shouldCalculateMultiplication() {
        int product = reversePolishNotationCalculator.calculatePolishNotation("4 3 *");
        Assertions.assertEquals(12, product);
    }

    @Test
    public void shouldCalculateAdditionWithMinus() {
        int product = reversePolishNotationCalculator.calculatePolishNotation("4 -3 +");
        Assertions.assertEquals(1, product);
    }

    @Test
    public void shouldCalculateMultiplicationWithBlank() {
        int product = reversePolishNotationCalculator.calculatePolishNotation("4  3  *");
        Assertions.assertEquals(12, product);
    }

}
