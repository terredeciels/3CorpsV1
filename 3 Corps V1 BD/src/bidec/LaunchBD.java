package bidec;

import java.math.BigDecimal;

public class LaunchBD {
    private static final int Tmax = 25;
    static int DimXYZ = 100;

    public static void main(String[] argv) {
        double gm = -1.0;// gm < 0
        double pas = 0.1;

        BigDecimal GM = new BigDecimal(gm);
        BigDecimal PAS = new BigDecimal(pas);

        InitialisationBD init = new InitialisationBD(GM, Tmax, PAS, DimXYZ);
        init.calculate();
        print(init);
    }

    private static void print(InitialisationBD init) {
        CorpsBD[][] I = init.NCorpsT0;
        for (int n = 0; n < 3; n++) {
            BigDecimal[] param = I[n][0].param;
            System.out.print(param[0]);
            System.out.print(" ; ");
            System.out.print(param[1]);
            System.out.print(" ; ");
            System.out.print(param[2]);
            System.out.println(" ; ");
        }
    }

}

