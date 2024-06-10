package set.OpersacoesBasicas;

import java.util.Objects;

public class Convidado {
  // atributos
  private String nome;
  private int codigoConvite;

  // construtor
  public Convidado(String nome, int codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  // getters
  public String getNome() {
    return this.nome;
  }

  public int getCodigoConvite() {
    return this.codigoConvite;
  }

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Convidado convidado))
      return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
  }

  public int hashCode() {
    return Objects.hash(getCodigoConvite());
  }

  public String toString() {
    return "Convidado{" + "nome=" + nome + '\'' + ", codigoConvite=" + codigoConvite + '}';
  }

}
