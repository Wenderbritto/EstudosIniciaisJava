class OperadoresRelacionais {

  //Cria o método principal (função) main. 
  public static void main(String[] args) {

    //Criando variáveis e atribuindo valores a elas. 
    int x = 5;
    int y = 8;
    
    //Imprime na tela o valor que está armazenado na variável x.
    System.out.println("X: "+ x);
    
    //Imprime na tela o valor que está armazenado na variável y. 
    System.out.println("Y: "+ y);

    //Imprime na tela a mensagem, faz a comparação e retorna True ou False.
    System.out.println("X e igual a Y: "+ (x==y));

    //Imprime na tela a mendagem, verifica se x é diferente de y e retorna o resultado.
    System.out.println("X e diferente de Y: "+ (x != y));

    //Imprime na tela a mensagem, faz a comparação e mostra se é True ou False. 
    System.out.println("X e maior ou igual Y:"+ (x <= y));
  }
}