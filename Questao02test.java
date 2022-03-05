public class Questao02test {

    Questao02 questao02;    
    public boolean testPares(){
        int[] arr= {1,5,3,4,2};
        questao02 = new Questao02(arr, 2);
        int resultadoEsperado = 3;

        int resultado = questao02.pares();

        if(resultadoEsperado == resultado){
            return true;
        }else{
            return false;
        }
    }
}
