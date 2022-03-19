package bidec;

import ncorps3.Initialisation;

import java.math.BigDecimal;

import static java.lang.Math.random;

public class InitialisationBD {


    public CorpsBD[][] NCorpsT0;
    int DimXYZ;
    BigDecimal Gm;
    BigDecimal pas;
    int Tmax;

    public InitialisationBD(Initialisation init, BigDecimal gm, int tmax, BigDecimal pas, int dimXYZ) {
        DimXYZ = dimXYZ;
        Gm = gm;
        this.pas = pas;
        this.Tmax = tmax;
        // NCorpsT0 = new CorpsBD[3][Tmax];
        NCorpsT0 = init.NCorpsT0BD;

//        for (int n = 0; n < 3; n++) {
//            CorpsBD corps = new CorpsBD();
//            BigDecimal[] param = new BigDecimal[6];
//            for (int c = 0; c < 6; c++) {
//                param[c] = new BigDecimal(random() * DimXYZ);// 0 a 1 ? //random non BigDecimal ?
//                //System.out.print(param[c]);
//                //preciser les domaines
//            }
//            corps.param = param;
//            NCorpsT0[n][0] = corps;
//        }


    }

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

//    public InitialisationBD(Corps[][] nCorpsT0,BigDecimal GM,int Tmax,BigDecimal PAS,int DimXYZ) {
//        this.DimXYZ = DimXYZ;
//
//        Gm = GM;
//        this.pas = PAS;
//        this.Tmax = Tmax;
//        NCorpsT0 = new CorpsBD[3][Tmax];
//        for (int i = 0; i < 3; i++) {
//            CorpsBD C = new CorpsBD();
//            for (int j = 0; j < 6; j++) {
//                C.param[j] = BigDecimal.valueOf(nCorpsT0[i][0].param[j]);
//            }
//           NCorpsT0[i][0] = C;
//        }
//    }

    public void calculate() {
        new CalculBD(this);
    }
}
