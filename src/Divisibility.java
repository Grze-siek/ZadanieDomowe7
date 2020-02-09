public class Divisibility {
    public static void main(String[] args) {
        numberDividedTo(20);
    }

    public static void numberDividedTo(int number)
    {
        int dividedNumber;
        int a = 0;
        for(dividedNumber = 1; a < 20; dividedNumber++) {
          a = 0;
            for (int divider = 1; divider <= number; divider++) {
                if (dividedNumber % divider == 0)
                    a++;
            }
        }
        System.out.println(dividedNumber);
    }
}
