public class Comentario {
  public static void main(String[] args) {
    // Olá, eu sou um comentário em uma única linha
    /*
     * Olá,
     * Eu sou um comentario
     * que posso ser mais detalhadod
     * quando necessário
     */

  }

  public int somaMultiplica(int n, int x, String m) {
    int r = 0; // r é igual ao resultado
    if (m == "M") { // M= multiplicação
      r = n * x;
    } else {
      // se não soma mesmo
      r = n + x;
    }
    return r;
  }
}
