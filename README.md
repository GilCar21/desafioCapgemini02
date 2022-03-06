<h1>DesafioCapgemini02</h1>
<h2>DESAFIO DE PROGRAMAÇÃO 02 - ACADEMIA CAPGEMINI</h2>
<p>Desafio feito utilizando a linguagem JAVA, o qual acabou se tornando realmente um bom desafio, pois era uma linguagem que eu ainda não tinha estudado, assim como a implementação de testes unitários. O que foi um ótimo aprendizado.</p>
<p>A IDE utilizada para escrever e rodar os códigos foi o VisualStudioCode(VSVode), ferramenta que já estava habituado a utilizar no dia a dia.</p>
<p>Para facilitar a utilização da linguagem e compilar os códigos utilizava um conjunto de extensões que podem ser encontradas em "Extension Pack for Java".</p>
<img src="https://user-images.githubusercontent.com/86432651/156904061-3a734007-4f1e-4f2b-8b7b-9f92ba41897a.png"/>
 
<p>Mas você pode compilar os códigos diretamente no terminal, usando o comando javac (nome do arquivo) direto na pasta onde está o arquivo, assim que você executar esse comando aparecerá um novo arquivo, que você executará utilizando o comando java (nome do arquivo), e assim o código serão executados.</p>
 
<p>O desafio é composto por três questões, as quais tentei implementar de uma maneira que pudesse aproveitar o máximo delas, tentando usar o mínimo de métodos prontos e criando os próprios códigos para mostrar as habilidades lógicas, de forma semelhante já havia feito na faculdade onde era pedido questões semelhantes.</p>

## Questão 01
<p>Resumindo a questão 01 ela dava uma lista de números (Array) e pedia para devolver a mediana. Uma questão simples, mas que me deu um pouco de trabalho por não conhecer bem a linguagem, na sua implementação inicialmente tinha definido todos os parâmetros como inteiros, no decorrer da codificação vi que teria que mudar a saída para double, pois a média dos valores para a obtenção da mediana poderia ser um números decimais, mas ao fazer isso, se entendi bem, o resultado continuava saída inteiros porque os outros valores que envolviam a operação estavam definidos inteiros, então tive que mudar alguns valores inicialmente definidos como inteiro para double.Na questão eu ordenei o array utilizando FOR e usando um IF para fazer a comparação dos números e uma variável para auxiliar na troca de posição, após fazer isso utilizei uma condicional IF e ELSE para ver se o array era de tamanho par ou ímpar, se fosse par seria feita a média dos dois valores centrais do array, se fosse ímpar, seria pego o valor central do array para mostrar o resultado.</p>
<p>Aqui está o código da função:</p>
<div>
<img src="https://user-images.githubusercontent.com/86432651/156904338-1b000838-b353-445a-a979-d242a9d6a141.png" width="600px" />
</div>

<p>Aqui está o código de teste:</p>
<img src="https://user-images.githubusercontent.com/86432651/156904498-3fdafbef-d33b-44cb-acae-4b4ee1b7b7a1.png" width="600px" />

<p>Aqui está a funções main:</p>
<img src="https://user-images.githubusercontent.com/86432651/156904658-85eea25c-693f-429f-abaa-b904df7050d9.png" width="600px" />

<p>Aqui está o resultado compilado:</p>
<img src="https://user-images.githubusercontent.com/86432651/156904725-87b07ac2-e9c2-4819-a500-71ebe78b2fe9.png" width="850px" />


## Questão 02
<p>A questão pedia para que fosse implementado um algoritmo que dado um vetor e um inteiros retornasse quantos pares dos números do array tinha a diferença do interior. Nessa questão em específico não tive trabalho, foi bem simples o conceitos usados foram parecidos com o da primeira, onde usei dois FOR para percorrer o array e um if para fazer a comparação, e uma variável que era implantada a cada comparação que desse positivo.</p>
Aqui está o código da função:<br>
<img src="https://user-images.githubusercontent.com/86432651/156904763-7cd37a63-bd7c-44bc-a036-00755c6b6dd1.png" width="600px" />

<p>Aqui está o código de teste:</p>
<img src="https://user-images.githubusercontent.com/86432651/156904782-21c64f61-7994-4b37-afc8-78e1b9113982.png" width="600px" />

<p>Aqui está a funções main:</p>
<img src="https://user-images.githubusercontent.com/86432651/156904803-26bdf514-fc6d-40a5-8a25-dabe98916eca.png" width="600px" />

<p>Aqui está o resultado compilado:</p>
<img src="https://user-images.githubusercontent.com/86432651/156904841-de5af6db-7d7b-443a-856d-160e3f088cc6.png" width="850px" />


## Questão 03
<p>A questão pedia a implementação de um algoritmo para a encriptação de um texto. Para isso era preciso tirar os espaço, pegar a quantidade de caracteres para obter a raiz quadrada desse número e com isso colocá-los  em uma matriz de acordo com o resultado, e então encriptar o texto invertendo a ordem da matriz lendo colunas como linhas e linhas como se fossem colunas.</p>
<p>Essa realmente foi a questão mais complexa do desafio, e a questão que me tomou mais tempo, mas também a questão que mais me fez aprender. Nela tive que transformar um STRING em um ARRAY de CHAR, retirar os espaços do ARRAY para isso usei um FOR que percorre o array e usei um IF para comparar cada caractere, e quando encontrasse um espaço utilizar um FOR que recoloca os índices do ARRAY, feito isso coloquei em um novo ARRAY os caracteres da STRING apenas, pois o antigo ARRAY continuava com o mesmo tamanho mais sem os espaços, por isso acabava ficava com um resto de caracteres.</p>
<p>Feito isso, pego o tamanho do ARRAY para saber quantas linhas e colunas vão ter a matriz que será utilizada, sendo sempre o número de menor ou igual o número de colunas, feito isso coloco o caracteres na matriz utilizando dois FOR para percorrer a matriz e coloquei um IF para não ultrapassar o tamanho do ARRAY.</p>
<p>Por fim, para receber o resultado em um ARRAY utilizei dois FOR fazendo a leitura da matriz de forma que percorreu colunas ao invés de linhas e coloquei  duas condicionais, uma para não pegar espaços vazios da matriz e outra para retornar o resultado se não ouve mais nada na matriz.<p/>
<p>Aqui está o código da função:</p>
<img src="https://user-images.githubusercontent.com/86432651/156904883-385088f2-8270-413d-86fe-c324be5414a6.png" width="600px" />

<p>Aqui está o código de teste:</p>
<img src="https://user-images.githubusercontent.com/86432651/156904924-f9318ff1-0cc4-4fa2-8a16-cc99ef206699.png" width="600px" />

<p>Aqui está a funções main:</P>
<img src="https://user-images.githubusercontent.com/86432651/156904954-7b441380-4a57-41a8-b073-9833e6495c12.png" width="600px" />

<p>Aqui está o resultado compilado:</p>
<img src="https://user-images.githubusercontent.com/86432651/156904994-032e9570-a0ae-4a8a-9fa4-7f620b7305a1.png" width="850px" />


