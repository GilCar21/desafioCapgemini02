import java.util.Arrays;
public class Questao01main {
    public static void main(String[] args){
        Questao01test test = new Questao01test();
        double[] arr={9,2,1,4,6};
        Questao01 questao01 = new Questao01(arr);
        boolean resultado;
        resultado = test.testMediana();
        System.out.println("Entrada: "+Arrays.toString(arr));
        System.out.println("Resultado: "+questao01.mediana());
        System.out.println("Resltado do teste unitario questao: "+resultado);
    }
}