package ncorps3;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calcul {


    public Calcul(Initialisation init) {
        double Gm = init.Gm;
        Corps[][] ncorps = init.NCorpsT0;
        double pas = init.pas;

        for (int k = 0; k < init.Tmax - 1; k++) {

            for (int n = 0; n < 3; n++) { //corps n
                double fx = 0.0;
                double fy = 0.0;
                double fz = 0.0;
                for (int m = 0; m < 3; m++) {
                    if (n != m) {
                        double dx = ncorps[n][k].param[0] - ncorps[m][k].param[0];
                        double dy = ncorps[n][k].param[1] - ncorps[m][k].param[1];
                        double dz = ncorps[n][k].param[2] - ncorps[m][k].param[2];

                        double Denom = pow(sqrt(pow(dx, 2) + pow(dy, 2) + pow(dz, 2)), 3);
                        fx += Gm * (dx / Denom);
                        fy += Gm * (dy / Denom);
                        fz += Gm * (dz / Denom);

                        double[] param = new double[6];
                        param[0] = 0.5 * fx * pow(pas, 2) + ncorps[n][k].param[3] * pas
                                + ncorps[n][k].param[0];
                        param[1] = 0.5 * fy * pow(pas, 2) + ncorps[n][k].param[4] * pas
                                + ncorps[n][k].param[1];
                        param[2] = 0.5 * fz * pow(pas, 2) + ncorps[n][k].param[5] * pas
                                + ncorps[n][k].param[2];
                        param[3] = fx * pas + ncorps[n][k].param[3];
                        param[4] = fy * pas + ncorps[n][k].param[4];
                        param[5] = fz * pas + ncorps[n][k].param[5];

                        Corps corps = new Corps();
                        corps.param = param;
                        ncorps[n][k + 1] = corps;

                    }
                }
            }


        }
    }
}

