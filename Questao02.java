public class Questao02 {
    private int[] n;
    private int x;
    public Questao02(int[] n,int x){
        this.n = n;
        this.x = x;
    }

    public int pares(){
        int cont = 0;
        //contando quantos pares se enquadram nos requesitos estabelecidos
        for(int i = 0; i < n.length -1; i++){
            for(int j=(i+1); j < n.length; j++ ){
                if(n[i] == n[j]+x || n[i]==n[j]-x){
                    cont++;
                }
            }
        }
        //mostrando o resltado
        return cont;
    }
}
