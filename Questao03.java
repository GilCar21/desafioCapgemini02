public class Questao03 {
    private String s;
    public Questao03(String s){
        this.s =s;
    }
    public char[] encripita(){
        //alterando de String para um Array de char
        char[] arr = s.toCharArray();
        char[] arrNew;
        double raiz;
        // retirando os espaços do Array
        int cont = 0;
        for(int i = 0; i < arr.length + cont; i++){
            if(arr[i] == ' '){
                cont--;
                for(int j = i; j < arr.length + cont;j++){
                    arr[j] = arr[j+1];
                }
            }
        }
        arrNew = new char[arr.length+cont];
        for( int k =0; k < arrNew.length;k++){
           arrNew[k] = arr[k];
        }
        // pegammdo a tamanho do array
        int t = arrNew.length;
        //pegando a raiz quadrada do tamanho do array
        raiz = Math.sqrt(t);
        // pegando linhas e colunas arredondando a raiz obtida
        int linha = (int)Math.round(raiz);
        int coluna = (int)Math.ceil(raiz);
        //formando o grida com os caracteres
        char[][] grid = new char[linha][coluna];
        cont=0;
        for(int i =0; i<linha; i++){
            for(int j=0;j<coluna; j++){
                if( cont < t){
                    grid[i][j] = arrNew[cont];
                    cont++;
                }else{
                    break;
                }
            }
        }
        //Fazendo a encripitação
        char[] resultado = new char[(t + coluna-1)];
        cont = 0;
        for(int i =0; i< linha; i++){
            for(int j=0;j<coluna; j++){
                //System.out.printf("%s",grid[j][i]);
                if(cont == (t + linha-1) ){
                    return resultado; 
                }
                if(coluna-1 == j && (linha - (linha*coluna - t)-1) < i){
                    
                }else{
                    resultado[cont] = grid[j][i];
                    cont++;
                }
                
            }
                resultado[cont] = ' ';
                cont++;
        }
        return resultado;
    }
}
