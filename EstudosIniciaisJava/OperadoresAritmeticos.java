class OperadoresAritmeticos{

  //Cria o método principal (função) main.
  public static void main(String[] args) {

    //Criou uma variável do tipo INTEIRO e atribuiu um valor. 
    int x = 20;
    //Criou uma variável do tipo INTEIRO e atribuiu um valor.
    int y = 2;
    
    //Imprime na tela o valor armazenado na variável x.
    System.out.println("Valor de x: " + x);
    //Imprime na tela o valor armazenado na variável y.
    System.out.println("Valor de y: " + y);

    //Imprime na tela o resultado da soma de x+y.
    System.out.println("Soma de x + y: " + (x+y));

    //Imprime na tela o resultado da subtração de x-y.
    System.out.println("Subtração de x - y: " + (x-y));
    
    //Imprime na tela o resultado da multiplicação de x*y.
    System.out.println("Multiplicação de x * y: " + (x*y));

    //Imprime na tela o resultado da divisão de inteiros de x/y.
    System.out.println("Divisão de inteiros de x / y: " + (x/y));

    //Imprime na tela o resultado do resto da dvisão de interios (MOD) entre x e y.
    System.out.println("Resto da divisão de interios de x por y: " + (x%y));
  
  }
}