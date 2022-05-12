import java.math.*;

public class Nombre_Euler {

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i; // trouver la factorielle du nombre avec des boucles
        }
        return result;
    }

    public static int sommeEntier(int n){
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        return res;
    }
    public static int sommeEntierRec(int n){
        if (n == 1)
            return 1;
        return sommeEntierRec(n-1) + n;
    }


    public static void main(String[] args) {
        int n = 12000;
        System.out.println("Somme des " + n +" premier entier = " + sommeEntier(n));
        System.out.println("Somme des " + n +" premier entier = " + sommeEntierRec(n));

    }
}
