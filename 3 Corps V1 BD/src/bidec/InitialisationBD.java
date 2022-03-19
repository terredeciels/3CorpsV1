package bidec;

import java.math.BigDecimal;

import static java.lang.Math.random;

class InitialisationBD {


    public CorpsBD[][] NCorpsT0;
    int DimXYZ;
    BigDecimal Gm;
    BigDecimal pas;
    int Tmax;

    public InitialisationBD(BigDecimal gm, int tmax, BigDecimal pas, int dimXYZ) {
        DimXYZ = dimXYZ;
        Gm = gm;
        this.pas = pas;
        this.Tmax = tmax;
        NCorpsT0 = new CorpsBD[3][Tmax];


        for (int n = 0; n < 3; n++) {
            CorpsBD corps = new CorpsBD();
            BigDecimal[] param = new BigDecimal[6];
            for (int c = 0; c < 6; c++) {
                param[c] = new BigDecimal(random() * DimXYZ);// 0 a 1 ? //random non BigDecimal ?
                //System.out.print(param[c]);
                //preciser les domaines
            }
            corps.param = param;
            NCorpsT0[n][0] = corps;
        }

    }

    public void calculate() {
        new CalculBD(this);
    }
}
