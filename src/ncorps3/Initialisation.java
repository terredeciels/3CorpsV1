package ncorps3;

import static java.lang.Math.random;

public class Initialisation {

    final double Gm; // < 0
    final Corps[][] NCorpsT0;
    final int Tmax;
    final double pas;
    final int DimXYZ;

    public Initialisation(double gm, int tmax, double p, int dimXYZ) {
        DimXYZ = dimXYZ;
        Gm = gm;
        pas = p;
        Tmax = tmax;
        NCorpsT0 = new Corps[3][Tmax];

        for (int n = 0; n < 3; n++) {
            Corps corps = new Corps();
            double[] param = new double[6];
            for (int c = 0; c < 6; c++) {
                param[c] = random() * DimXYZ;// 0 a 1 ?
                //System.out.print(param[c]);
                //preciser les domaines
            }
            corps.param = param;
            NCorpsT0[n][0] = corps;
        }

    }

    public void calculate() {
        new Calcul(this);
    }

}
