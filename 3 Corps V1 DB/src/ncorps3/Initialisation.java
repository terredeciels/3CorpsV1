package ncorps3;


import bidec.CorpsBD;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.valueOf;

public class Initialisation {

    public final Corps[][] NCorpsT0;
    public final CorpsBD[][] NCorpsT0BD;
    final double Gm; // < 0
    final int Tmax;
    final double pas;
    final int DimXYZ;


    public Initialisation(double gm, int tmax, double p, int dimXYZ) {
        DimXYZ = dimXYZ;
        Gm = gm;
        pas = p;
        Tmax = tmax;
        NCorpsT0 = new Corps[3][Tmax];
        NCorpsT0BD = new CorpsBD[3][Tmax];

        for (int n = 0; n < 3; n++) {
            Corps corps = new Corps();
            CorpsBD corpsbd = new CorpsBD();
            double[] param = new double[6];
            BigDecimal[] parambd = new BigDecimal[6];
            for (int c = 0; c < 6; c++) {
                // param[c] = random() * DimXYZ;// 0 a 1 ?
                parambd[c] = random(DimXYZ);
                param[c] = parambd[c].doubleValue();

                //parambd[c] = valueOf(param[c]);
                //System.out.print(param[c]);
                //preciser les domaines
            }
            corps.param = param;
            corpsbd.param = parambd;
            NCorpsT0[n][0] = corps;
            NCorpsT0BD[n][0] = corpsbd;
        }


    }

    public static BigDecimal random(int range) {
        BigDecimal max = new BigDecimal(range);
        BigDecimal randFromDouble = valueOf(Math.random());
        BigDecimal actualRandomDec = randFromDouble.multiply(max);
        actualRandomDec = actualRandomDec.setScale(24, RoundingMode.HALF_DOWN);
        return actualRandomDec;
    }

    public void calculate() {
        new Calcul(this);
    }
}
