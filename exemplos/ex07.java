package exemplos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex07 {
    public static void main(String[] args) {
        int[] numeros = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println(Arrays.toString(numeros));
    }
}