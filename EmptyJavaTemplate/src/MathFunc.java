public class MathFunc {
    static boolean isDivisor(int num1, int num2) {

        return (num2 % num1 == 0);

    }

    static boolean isMultiple(int num1, int num2) {
        return ((num2 / num1) * num1 == num2);
    }

    static boolean isEven(int num1) {
        return (num1 % 2 == 0);
    }

    static boolean isOdd(int num1) {
        return (num1 % 2 != 0);
    }

    static boolean isPositive(int num1) {
        return (num1 > 0);
    }

    static boolean isNegative(int num1) {
        return (num1 < 0);
    }

    static Integer isGreater(int num1, int num2) {
        if (num1 > num2) {
            return (num1);

        } else
            return (num2);
    }

    static Integer isSmaller(int num1, int num2) {
        if (num1 < num2) {
            return (num1);

        } else
            return (num2);
    }

    static long isFactorial(long num1) {
        var factorial = 1l;
        for (int i = 1; i <= num1; i++)
            factorial = factorial *= i;
        return factorial;

    }

    static long doubleFactorial(long num1) {
        if (num1 == 0 || num1 == 1) {
            return 1;

        } else
            return num1 * doubleFactorial(num1 - 2);

    }

    static Integer countPosDivisors(int num1) {
        var countPos = 0;
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                countPos++;
            }

        }
        countPos++;
        return countPos;

    }

    static Integer countNegDivisors(int num1) {
        var countNeg = 0;
        for (int i = 1; i >= num1 / 2; i++) {
            if (num1 % i == 0) {
                countNeg++;
            }

        }

        return countNeg;
    }

    static Integer countDivisors(int num1) {
        var count = 0;
        for (int i = 1; i <= Math.abs(num1); i++) {
            if (num1 % i == 0) {
                count += 2;
            }
        }

        return count;

    }

    static Integer SumPosDivisors(int num1) {
        var SumPos = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                SumPos += i ;
            }

        }

        return SumPos;

    }

  

    }

