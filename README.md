# Repositório com os exercícios da Semana 4 do Projeto Tech Dive

## Introdução ao Java

Cada exercício foi nomeado com uma classe e salvo dentro de uma branch específica.

### Ex 01 -  Saudar o usuário
Utilizei a classe LocalTime do java.time para pegar a hora atual do sistema 
e com a estrutura if-else defini se a saudação seria bom dia (de 1 da manhã até 11 da manhã), boa tarde (de 12h até 18h) ou boa noite (de 18h até meia noite).

O código da solução está na branch [EX01](https://github.com/royergc/M1S04/blob/Ex01/src/com/m1s04/techdive/Ex01SaudacaoHoraAtual.java)

### Ex 02 - Pergunte o nome do usuário
Criei o programa na classe Ex02PerguntaNomeUsuario. Utilizei a classe Scanner de java.util para ler a entrada , os métodos replace e length da classe String para contar o número de letras (utilizei o replace para remover os espaços que possam existir caso tenha mais de um sobrenome). 

Também poderia ter feito percorrendo a string num laço for e só contando caracteres q não fossem espaço.

O código da solução está na branch [Ex02](https://github.com/royergc/M1S04/blob/Ex02/src/com/m1s04/techdive/Ex02PerguntaNomeUsuario.java)

### Ex 03 - Calculadora IMC
Utilizei a classe Scanner de java.util para ler a entrada, armazenando tanto a altura quanto o peso em variáveis double (poderia usar float por serem apenas 2 casas decimais, mas preferi deixar double já que é o padrão no Java). 

Depois calculei o IMC conforme a fórmula pedia. Para imprimir o resultado do IMC, utilizei o método printf pois permite formatar a saída para apenas duas casas decimais.

O código da solução está na branch [Ex03](https://github.com/royergc/M1S04/blob/Ex03/src/com/m1s04/techdive/Ex03CalculadoraIMC.java)

### Ex 04 - Par ou ímpar
Implementei o teste com a classe Scanner, utilizando o operador % para verificar se o resto da divisão por 2 seria zero (par) ou diferente de zero (ímpar).

O código da solução está na branch [Ex04](https://github.com/royergc/M1S04/blob/Ex04/src/com/m1s04/techdive/Ex04ParOuImpar.java)

### Ex 05 - Adivinhe o número
Implementei o exercício utilizando a classe Scanner para ler a entrada e, seguindo os exemplos das aulas, o método random() da classe Math para gerar o número inteiro.   
Porém, o Lint me avisou que era mais aconselhável utilizar a classe Random do Java.util com o método nextInt() para gerar um número pseudorandomico já inteiro, evitando a conversão de tipo.   
Fiz dessa forma então, aproveitando para alterar também uma verificação extra para evitar que o usuário insira um número que não esteja entre 1 e 5 (foi o segundo commit, dá pra ver ambas implementações se olhar o histórico dos commits -  
deixei também comentado apenas para ilustrar a diferença entre as duas formas de gerar o número pseudorandomico).

O código da solução está na branch [Ex05](https://github.com/royergc/M1S04/blob/Ex05/src/com/m1s04/techdive/Ex05AdivinhaNumero.java)

### Ex 06 - Calculadora de idade
Para implementar esse exercício, pesquisei um pouco como trabalhar com datas e como calcular o período entre datas usando as bibliotecas padrão do Java.  
Encontrei então as classes LocalDate, Period do java.time e DateTimeFormatter do java.time.format para me auxiliar nisso.   
Utilizei a classe LocalDate para criar um objeto dataNascimento, que continha a data de nascimento digitada pelo usuário em formato de LocalDate (que é o formato que o Java trabalha com datas na java.time).   
Para isso, precisei formatar a String digitada pelo usuário com o DateTimeFormatter.   
Por fim, utilizei a classe Period com o metódo between para calcular o periodo entre as datas (peguei a data atual com o metodo now() da LocalDate) e o método getYears() para converter esse período em anos. 

O código da solução está na branch [Ex06](https://github.com/royergc/M1S04/blob/Ex06/src/com/m1s04/techdive/Ex06CalculadoraDeIdade.java)

### Ex 07 - Calculadora de média final
Comecei a implementação guardando as notas num array de doubles, mas depois vi que era totalmente desnecessário, bastando guardar a soma das notas numa variável double. 

O código da solução está na branch [Ex07](https://github.com/royergc/M1S04/blob/Ex07/src/com/m1s04/techdive/Ex07CalculadoraDeMediaFinal.java)

### Ex 08 - Faça uma calculadora
Implementei a calculadora utilizando a estrutura switch para identificar qual operação realizar.

O código da solução está na branch [Ex08](https://github.com/royergc/M1S04/blob/Ex08/src/com/m1s04/techdive/Ex08Calculadora.java)

### Ex 09 - Calculadora fatorial
Para implementar o fatorial, utilizei um inteiro resultadoFatorial já inicializado com o valor 1 (para os casos de fatorial de 0 e fatorial de 1, nem preciso fazer mais nada - e para os demais já está inicializado com 1 e posso só seguir multiplicando pelos demais valores).  
Então apenas precisei ler o valor a ser calculado e fazer um laço for, que começa com o número a ser calculado e vai decrementando e multiplicando até chegar em 2 - já que o 1 é 1 mesmo).

O código da solução está na branch [Ex09](https://github.com/royergc/M1S04/blob/Ex09/src/com/m1s04/techdive/Ex09CalculadoraFatorial.java)

### Ex 10 - Calculadora de PA e PG
Fiz a implementação com laço for que já ia calculando os termos da PA ou PG e imprimindo na tela. Optei por não utilizar array para armazenar os dados pensando em economizar memória, já que foi pedido apenas para imprimir os dados, mas se fosse necessário armazenar os dados da PA ou da PG para uso futuro, bastava ir adicionando os termos num array.

O código da solução está na branch [Ex10](https://github.com/royergc/M1S04/blob/Ex10/src/com/m1s04/techdive/Ex10CalculadoraPAePG.java)
