import java.util.Arrays;
public class Questao02main {
    public static void main(String[] args){
        Questao02test test = new Questao02test();
        int[] arr = {1,5,3,4,2};
        int x = 2;
        Questao02 questao02= new Questao02(arr, 2);
        boolean resultado;
        resultado = test.testPares();
        System.out.println("Entradas: "+Arrays.toString(arr)+", "+x);
        System.out.println("Resultado: "+questao02.pares());
        System.out.println("Resultado do teste unitario questao 2: "+resultado);
    }
}
