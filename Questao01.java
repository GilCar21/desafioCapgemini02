public class Questao01{
	double[] arr;
	public Questao01(double[] arr){
		this.arr = arr;
	}
    public double mediana(){
		double mediana;
		int meio;
		//Ordenando o array de forma eficiente, me veio essa ideia a ao fazer a questão dois.
        for (int i = 0; i < arr.length ; i++) {
			for(int j = i; j < arr.length; j++){
				if (arr[i] > arr[j]) {
					double temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//Fazendo comparaçoes para saber se o array é para ou impar
		//se for para o array tera a media de dois numeros centrais para sua mediana
		// se o array for impar a mediana será somente o numero central mesmo;
		if(arr.length%2 == 0){
			meio = arr.length/2;
			mediana = (arr[meio - 1] + arr[meio])/2;
			return mediana;
		}else{
			meio = arr.length/2;
			mediana = arr[meio];
			return mediana;
		}
    }
}