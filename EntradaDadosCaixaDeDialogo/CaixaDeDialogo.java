import javax.swing.JOptionPane;

class CaixaDeDialogo {

  //Cria o método principal (função) main.
  public static void main(String[] args) {
    
    //Cria uma variável do tipo STRING.
    String leitura;

    //Lendo um texto através de uma caixa de diálogo.
    leitura = JOptionPane.showInputDialog("Entre com o comprimento do retângulo: ");
    
    //Convertendo o texto anterior para float e armazenando em uma variável.
    float comprimento = Float.parseFloat(leitura);
    
    //Lendo um texto através de uma caixa de diálogo.
    leitura = JOptionPane.showInputDialog("Entre com a largura do retângulo: ");

    //Convertendo o texto anterior para float e armazenando em uma variável.
    float largura = Float.parseFloat(leitura);

    //Calculando a área do retângulo e armazenando o resultado na variável AREA.
    float area = comprimento * largura;

    //Calculando o perimetro de um retângulo e armazenando o resultado na variável.
    float perimetro = (comprimento * 2) + (largura * 2);

    //Criando uma variável e atribuindo um texto para ela.
    String mensagem = "Resultado\nÁrea: "+ area + "\nPerimetro: " + perimetro;

    //Apresentando, em uma caixa de dialogo, um texto.
    JOptionPane.showMessageDialog(null, mensagem);
  }
}