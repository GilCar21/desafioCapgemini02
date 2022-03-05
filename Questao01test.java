public class Questao01test {
    
    Questao01 questao01;
    public boolean testMediana(){
        double[] arr= {9,2,1,4,6};
        questao01 = new Questao01(arr);
        double resultadoEsperado = 4.0;
        double resultado = questao01.mediana();

        if(resultadoEsperado == resultado){
            return true;
        }else{
            return false;
        }
    }
}
