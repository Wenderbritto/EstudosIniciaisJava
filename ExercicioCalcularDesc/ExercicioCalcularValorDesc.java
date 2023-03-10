import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    /*Usando a classe Scanner para entrada de dados, crie uma classe que receba o valor de um produto e a porcentagem de desconto, calcule e mostre o valor do desconto e o valor do produto com o desconto. Observação: o valor do desconto é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto/100.  */
    //Cria um objeto leitor de dados do tipo Scanner.
    Scanner leitor = new Scanner(System.in);
    
    //Imprime na tela o texto.
    System.out.println("Digite o valor do produto: ");

    //Ler do teclado o texto digitado e converte o texto digitado para INT.
    int valor_produto = leitor.nextInt();

    System.out.println("Digite a porcentagem de desconto: ");

    //Ler do teclado o texto digitado e converte o texto digitado para INT.
    int porc_desc = leitor.nextInt();

    //Imprime na tela o texto e o valor do produto.
    System.out.println("Valor do produto: " + valor_produto);

    //Criando uma variável e fazendo o cálculo do desconto nela.
    int valor_desconto = valor_produto * porc_desc/100;

    //Imprime na tela o texto e o valor do desconto.
    System.out.println("Valor do desconto: " + valor_desconto);

    //Criando uma variável e fazendo uma subtração nela.
    int produto_desc = valor_produto - valor_desconto;

    //Imprime na tela o texto e o valor do produto com desconto.
    System.out.println("Valor do produto com desconto: " + produto_desc);
    
    
  }
}