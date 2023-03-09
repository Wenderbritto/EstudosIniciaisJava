
//Importando Classes
//import java.util.Scanner;

public class Scanner {

  //Cria o método principal (função) main
  public static void main(final String[] args) {

    //Imprime na tela
  System.out.println(" Programa Soma ");

    //Cria um objeto leitor de dados do tipo Scanner
    Scanner leitor = new Scanner(System.in);
    
    //Imprime na tela
    System.out.println("Digite seu nome: ");

    //Ler do teclado o texto digitado, após precionar enter
    String nome = leitor.next();

    //Imprime na tela
    System.out.println("Digite um numero: ");

    //Ler do teclado o texto digitado e converte para INT.
    int num = leitor.nextInt();

    //Imprime na tela
    System.out.println("Digite outro numero: ");
    
    //Ler do teclado o texto digitado e converte para INt.
    int numero = leitor.nextInt();

    int soma = num + numero;

    System.out.println("Resultado da soma: " + soma);
	
}
}