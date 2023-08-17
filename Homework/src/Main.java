import java.util.Arrays;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter {
    public int[] extract(String text) {
        int count = 0;
        for (char letter:
             text.toCharArray()) {
            if(Character.isDigit(letter)) count++;
        }
        int[] digits = new int[count];
        count = 0;
        for (char letter :
                text.toCharArray()) {
            if(Character.isDigit(letter)) {
                digits[count] = Character.getNumericValue(letter);
                count++;
            }
        }
        return digits;
    }
}