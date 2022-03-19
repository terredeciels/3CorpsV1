package bidec;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.RoundingMode.HALF_DOWN;

class calculBigDecimal {
    private static final int scale = 20;
    private static final RoundingMode roundingMode = HALF_DOWN;

    public static void main(String[] args) {

        double a = 1;
        double b = 6;

        BigDecimal A = new BigDecimal(a);
        BigDecimal B = new BigDecimal(b);

        BigDecimal res = A.divide(B, scale, roundingMode);

        System.out.println(res);
    }
}

