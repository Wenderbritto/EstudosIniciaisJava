class OperadoresLogicos{
  //Cria o método principal (função) main. 
  public static void main(String[] args) {

    //Declara e inicializa uma variável do tipo boolean.
    boolean x = true;

    //Declara e inicializa uma variável do tipo boolean.
    boolean y = false;

    //Imprime na tela o valor armazenado em X e Y.
    System.out.println("X: "+x);
    System.out.println("Y: "+y);

    //Imprime na tela o resultado da operação lógica &&(AND).
    System.out.println("X e Y: "+(x && y));

    //Imprime na tela o resultado da operação lógica ||(OR).
    System.out.println("X ou Y: "+(x || y));
    
    //Imprime na tela o resultado da negação lógica do valor de X
    System.out.println("Não X: "+(!x));
  }
}