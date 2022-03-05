# desafioCapgemini02
- DESAFIO DE PROGRAMAÇÃO 02 - ACADEMIA CAPGEMINI
- Desafio feito utilizando a linguagem JAVA, o qual acabou se tornando realmente um bom desafio, pois era uma linguagem que eu ainda não tinha estudado, assim como a implementação de testes unitários. O que foi um ótimo aprendizado.
- A IDE utilizada para escrever e rodar os códigos foi o VisualStudioCode(VSVode), ferramenta que já estava habituado a utilizar no dia a dia.
Para facilitar a utilização da linguagem e compilar os códigos utilizava um conjunto de extensões que podem ser encontradas em "Extension Pack for Java".<br>
<img src="/images/extencao"><br>
 
Mas você pode compilar os códigos diretamente no terminal, usando o comando javac (nome do arquivo) direto na pasta onde está o arquivo, assim que você executar esse comando aparecerá um novo arquivo, que você executará utilizando o comando java (nome do arquivo), e assim o código serão executados.<br>
<img src="/images/execucao"><br>
 
O desafio é composto por três questões, as quais tentei implementar de uma maneira que pudesse aproveitar o máximo delas, tentando usar o mínimo de métodos prontos e criando os próprios códigos para mostrar as habilidades lógicas, de forma semelhante já havia feito na faculdade onde era pedido questões semelhantes.

## Questão 01
Resumindo a questão 01 ela dava uma lista de números (Array) e pedia para devolver a mediana. Uma questão simples, mas que me deu um pouco de trabalho por não conhecer bem a linguagem, na sua implementação inicialmente tinha definido todos os parâmetros como inteiros, no decorrer da codificação vi que teria que mudar a saída para double, pois a média dos valores para a obtenção da mediana poderia ser um números decimais, mas ao fazer isso, se entendi bem, o resultado continuava saída inteiros porque os outros valores que envolviam a operação estavam definidos inteiros, então tive que mudar alguns valores inicialmente definidos como inteiro para double.Na questão eu ordenei o array utilizando FOR e usando um IF para fazer a comparação dos números e uma variável para auxiliar na troca de posição, após fazer isso utilizei uma condicional IF e ELSE para ver se o array era de tamanho par ou ímpar, se fosse par seria feita a média dos dois valores centrais do array, se fosse ímpar, seria pego o valor central do array para mostrar o resultado
Aqui está o código da função:
Aqui está o código de teste:
Aqui está a camada das funções:

## Questão 02
A questão pedia para que fosse implementado um algoritmo que dado um vetor e um inteiros retornasse quantos pares dos números do array tinha a diferença do interior. Nessa questão em específico não tive trabalho, foi bem simples o conceitos usados foram parecidos com o da primeira, onde usei dois FOR para percorrer o array e um if para fazer a comparação, e uma variável que era implantada a cada comparação que desse positivo.
Aqui está o código da função:
Aqui está o código de teste:
Aqui está a camada das funções:

## Questão 03
A questão pedia a implementação de um algoritmo para a encriptação de um texto. Para isso era preciso tirar os espaço, pegar a quantidade de caracteres para obter a raiz quadrada desse número e com isso colocá-los  em uma matriz de acordo com o resultado, e então encriptar o texto invertendo a ordem da matriz lendo colunas como linhas e linhas como se fossem colunas..
Essa realmente foi a questão mais complexa do desafio, e a questão que me tomou mais tempo, mas também a questão que mais me fez aprender. Nela tive que transformar um STRING em um ARRAY de CHAR, retirar os espaços do ARRAY para isso usei um FOR que percorre o array e usei um IF para comparar cada caractere, e quando encontrasse um espaço utilizar um FOR que recoloca os índices do ARRAY, feito isso coloquei em um novo ARRAY os caracteres da STRING apenas, pois o antigo ARRAY continuava com o mesmo tamanho mais sem os espaços, por isso acabava ficava com um resto de caracteres.
Feito isso, pego o tamanho do ARRAY para saber quantas linhas e colunas vão ter a matriz que será utilizada, sendo sempre o número de menor ou igual o número de colunas, feito isso coloco o caracteres na matriz utilizando dois FOR para percorrer a matriz e coloquei um IF para não ultrapassar o tamanho do ARRAY.
Por fim, para receber o resultado em um ARRAY utilizei dois FOR fazendo a leitura da matriz de forma que percorreu colunas ao invés de linhas e coloquei  duas condicionais, uma para não pegar espaços vazios da matriz e outra para retornar o resultado se não ouve mais nada na matriz.
