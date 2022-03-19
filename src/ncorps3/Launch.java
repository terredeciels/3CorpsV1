package ncorps3;

public class Launch {
    private static final int Tmax = 25;
    static int DimXYZ = 100;

    public static void main(String[] argv) {
        double gm = -1.0;// gm < 0
        double pas = 0.1;

        Initialisation init = new Initialisation(gm, Tmax, pas, DimXYZ);
        init.calculate();
        print(init);
    }

    private static void print(Initialisation init) {
        Corps[][] I = init.NCorpsT0;
        for (int n = 0; n < 3; n++) {
            double[] param = I[n][0].param;
            System.out.print(param[0]);
            System.out.print(" ; ");
            System.out.print(param[1]);
            System.out.print(" ; ");
            System.out.print(param[2]);
            System.out.println(" ; ");
        }
    }

}

