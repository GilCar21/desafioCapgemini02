import java.util.Arrays;
public class Questao03main {
    public static void main(String[] args){
        Questao03test test = new Questao03test();
        String s = "ola mundo";
        Questao03 questao03= new Questao03(s);
        boolean resultado;
        resultado = test.testEncripta();
        System.out.println("Entrada: "+s);
        System.out.println("Resultado: "+Arrays.toString(questao03.encripita()));
        System.out.println("Resultado do teste unitario questao 2: "+resultado);
    }
}
