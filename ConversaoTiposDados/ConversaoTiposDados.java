public class ConversaoTiposDados {

  //Cria o método principal (funcao) main.
  public static void main(String[] args) {
    

    //Criando e atribuindo um valor para variável.
    int numero = 10;

    //Convertendo o valor armazenado de int para float.
    float f = (float)numero;

    //Convertendo o valor armazenado de float para double.
    double d = (double)f;

    //Criando e atribuindo um valor para variável.
    String s = "10";

    //Convertendo o valor armazenado de string para int.
    int numero2 = Integer.parseInt(s);

    //Criando e atribuindo um valor para variável.
    String s2 = "10.54";

    //Convertendo o valor armazenado de string para float.
    float f2 = Float.parseFloat(s2);

    //Convertendo o valor armazenado de string para double.
    double d2 = Double.parseDouble(s2);

    //Criando e atribuindo um valor para variável.
    int i3 = 11;

    //Convertendo o valor armazenado de int para string.
    String s3 = String.value0f(i3);

    //Criando e atribuindo um valor para variável.
    float f3 = 120.4f;

    //Convertendo o valor armazenado de float para string.
    String s4 = String.value0f(f3);

    //Criando e atribuindo um valor para variável.
    double d3 = 1234.54;

    //Convertendo o valor armazenado de double para string.
    String s5= String.value0f(d3);
  }
}