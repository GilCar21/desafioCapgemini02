import java.util.Arrays;
public class Questao03test {
    
    Questao03 questao03;
    public boolean testEncripta(){
        String s = "ola mundo";
        questao03 = new Questao03(s);
        char[] resultadoEsperado = {'o','m','d',' ','l','u','o',' ','a','n'};
        char[] resultado = questao03.encripita();

        if(Arrays.equals(resultadoEsperado, resultado)){
            return true;
        }else{
            return false;
        }
    }
}
