// 12S24053-Dea Anggreany Hutapea
// 12S24046-Indah Elsadai Nainggolan

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, jUDUL, pENULIS, pENERBIT, fORMAT, tAHUNTERBIT, kETERANGAN, tUB, dISKON;
        int sTOK;
        double hARGA, mINIMUMMARGIN, rATING, kATDISKON;

        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                jUDUL = input.nextLine();
                pENULIS = input.nextLine();
                tAHUNTERBIT = input.nextLine();
                pENERBIT = input.nextLine();
                fORMAT = input.nextLine();
                hARGA = Double.parseDouble(input.nextLine());
                mINIMUMMARGIN = Double.parseDouble(input.nextLine());
                sTOK = Integer.parseInt(input.nextLine());
                rATING = Double.parseDouble(input.nextLine());
                if (rATING >= 4.7) {
                    kETERANGAN = "Best Pick";
                } else {
                    if (rATING >= 4.5) {
                        kETERANGAN = "Must Read";
                    } else {
                        if (rATING >= 4.0) {
                            kETERANGAN = "Recommended";
                        } else {
                            if (rATING >= 3.0) {
                                kETERANGAN = "Average";
                            } else {
                                kETERANGAN = "Low";
                            }
                        }
                    }
                }
                kATDISKON = mINIMUMMARGIN / hARGA * -1;
                if (kATDISKON == -kATDISKON) {
                    kATDISKON = kATDISKON * -1;
                }
                if (kATDISKON >= (double) 40 / 100) {
                    dISKON = "Once in a lifetime";
                } else {
                    if (kATDISKON >= (double) 20 / 100) {
                        dISKON = "Never come twice";
                    } else {
                        if (kATDISKON >= 0) {
                            dISKON = "No regret";
                        }
                    }
                }
                if (kETERANGAN.equals("Best Pick") && dISKON.equals("Once in a lifetime")) {
                    tUB = "The ultimate best";
                } else {
                    tUB = "---";
                }
                System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUNTERBIT + "|" + pENERBIT + "|" + fORMAT + "|" + toFixed(hARGA,2) + "|" + toFixed(mINIMUMMARGIN,2) + "|" + sTOK + "|" + toFixed(rATING,1) + "|" + kETERANGAN + "|" + dISKON + "|" + tUB);
            }
        } while (!iSBN.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
