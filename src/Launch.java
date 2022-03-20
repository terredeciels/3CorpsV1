import bidec.CorpsBD;
import bidec.InitialisationBD;
import ncorps3.Corps;
import ncorps3.Initialisation;

import java.math.BigDecimal;

class Launch {
    private static final int Tmax = 25;
    static int DimXYZ = 100;

    public static void main(String[] argv) {
        double gm = -1.0;// gm < 0
        double pas = 0.1;
//        Initialisation init = new Initialisation(gm, Tmax, pas, DimXYZ);
//        init.calculate();
//        print(init);
//
//        System.out.println();
//        System.out.println();
//        System.out.println();

        BigDecimal GM = new BigDecimal(gm);
        BigDecimal PAS = new BigDecimal(pas);

//        InitialisationBD initbd = new InitialisationBD(init, GM, Tmax, PAS, DimXYZ);
//
//        initbd.calculate();
//        printBD(initbd);
//
//        System.out.println();
//        System.out.println();
//        System.out.println();

        InitialisationBD initbd2 = new InitialisationBD(GM, Tmax, PAS, DimXYZ);
        initbd2.calculate();
        printBD(initbd2);
    }
//
//    private static void print(Initialisation init) {
//        Corps[][] I = init.NCorpsT0;
//        for (int n = 0; n < 3; n++) {
//            double[] param = I[n][0].param;
//            System.out.print(param[0]);
//            System.out.print(" ; ");
//            System.out.print(param[1]);
//            System.out.print(" ; ");
//            System.out.print(param[2]);
//            System.out.println(" ; ");
//        }
//    }
private static void printD(InitialisationBD init) {
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
    private static void printBD(InitialisationBD init) {
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

