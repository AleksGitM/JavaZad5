package pl.akademia108;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        BigInteger a = new BigInteger("10");
        int b = 80;

        BigInteger atomy = a.pow(b);
        System.out.println("Wartość liczby 10 podniesionej do potęgi 80 wynosi:" + atomy);
    }
}
