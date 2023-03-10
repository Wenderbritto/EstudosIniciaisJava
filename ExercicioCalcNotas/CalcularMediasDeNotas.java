//Importando a biblioteca para utilizar a caixa de dialogo.
import javax.swing.JOptionPane;

class CalcularMediasDeNotas {
  public static void main(String[] args) {
  /* Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba a nota de duas provas e de um trablho. Calcule e mostre a média e oo resultado final (Se aprovado ou reprovado [não usar IF]). Para calcular a média utilize a fórmula seguinte: media = (nota da prova 1 + nota da prova 2 + nota do trabalho) / 3. Considere que a média mínima para aprovação é 6. Obs.: Não usar comando IF.*/

    //Criou uma variável.
    String leitura;

    //Criando a caixa de dialogo para inserir informações através do teclado.
    leitura= JOptionPane.showInputDialog("Digite a nota da prova 1: ");

    //Convertendo as informações de STRING para FLOAT.
    float prova_1= Float.parseFloat(leitura);

    //Criando a caixa de dialogo para inserir informações através do teclado.
    leitura= JOptionPane.showInputDialog("Digite a nota da prova 2: ");

    //Convertendo as informações de STRING para FLOAT.
    float prova_2= Float.parseFloat(leitura);

    //Criando a caixa de dialogo para inserir informações através do teclado.
    leitura= JOptionPane.showInputDialog("Digite a nota do trabalho: ");
    
    //Convertendo as informações de STRING para FLOAT.
    float nota_trabalho= Float.parseFloat(leitura);

    //Criando uma variável e fazendo a operação para ter a média.
    float media= (prova_1 + prova_2 + nota_trabalho)/3;

    boolean aprovacao = (media>=6);

    //Criando uma variável e atribuindo informações para ela.
    String mensagem = "Prova 1: "+ prova_1 + "\nProva 2: "+ prova_2 + "\nTrabalho: "+ nota_trabalho + "\nMedia: "+ media + "\nAprovado? "+ aprovacao;

    //Utilizando a caixa de dialogo para mostrar as informações na tela.
    JOptionPane.showMessageDialog(null, mensagem);

    
    

    
  }
}