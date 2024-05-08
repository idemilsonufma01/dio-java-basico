public class ResultadoEscolar {
  public static void main(String[] args) {
    int nota = 4;

    /*
     * if (nota >= 7)
     * System.out.println("Aprovado");
     * else if (nota > 5 && nota < 7) {
     * System.out.println("Prova de Recuperaçao");
     * } else
     * System.out.println("Reprovado");
     */
    // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperaçao" : "Reprovado";
    System.out.println(resultado);
  }
}
