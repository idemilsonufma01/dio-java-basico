public class Operadores {
  public static void main(String[] args) throws Exception {
    // classe Operadores.java
    // String nomeCompleto = "LINGUAGEM" + "JAVA";
    // System.out.println(nomeCompleto);
    // qual o resultado das expressoes abaixo?
    // String concatenacao = "?";
    // concatenacao = 1 + 1 + 1 + "1";
    // System.out.println(concatenacao);
    // concatenacao = 1 + "1" + 1 + 1;
    // System.out.println(concatenacao);
    // concatenacao = 1 + "1" + 1 + "1";
    // System.out.println(concatenacao);
    // concatenacao = "1" + 1 + 1 + 1;
    // System.out.println(concatenacao);
    // concatenacao = "1" + (1 + 1 + 1);
    // System.out.println(concatenacao);
    // classe Operadores.java
    // Operador Ternario
    /*
     * int a, b;
     * 
     * a = 5;
     * b = 6;
     * String resultado = a == b ? "true" : "false"; // tipo string
     * System.out.println(resultado);
     * 
     * String resultado = "";
     * if (a == b)
     * resultado = "verdadeiro";
     * else
     * resultado = "falso";
     * System.out.println(resultado);
     * 
     * // operadores Relacionais
     * String nome1 = "Idemilson";
     * String nome2 = new String("Idemilson");
     * System.out.println(nome1.equals(nome2));// comparando conteudos = true
     * 
     * int numero1 = 1;
     * int numero2 = 2;
     * 
     * if (numero1 > numero2)
     * System.out.println("Numero 1 maior que numero 2");
     * 
     * if (numero1 < numero2)
     * System.out.println("Numero 1 menor que numero 2");
     * 
     * if (numero1 >= numero2)
     * System.out.println("Numero 1 maior ou igual que numero 2");
     * 
     * if (numero1 <= numero2)
     * System.out.println("Numero 1 menor ou igual que numero 2");
     * 
     * if (numero1 != numero2)
     * System.out.println("Numero 1 é diferente de numero 2");
     */
    // Operador Logico
    boolean condicao1 = true;
    boolean condicao2 = false;
    if (condicao1 && condicao2)
      System.out.print("Os dois valores precisam ser verdadeiros");
    ;

    // Se condicao1 OU condicao2 for verdadeira, executar código.
    if (condicao1 || condicao2)
      System.out.print("Um dos valores precisa ser verdadeiro");

  }
}