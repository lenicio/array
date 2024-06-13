import java.util.ArrayList;

public class Carteira {
  ArrayList<Receita> receitas = new ArrayList<Receita>();

  public void exibirDetalhes() {
    double totalReceita = 0;

    for (Receita receita : receitas) {
      totalReceita += receita.getValor();
      System.out.printf("""
          ----------------------------------------
          Descrição: %s
          Valor: %.2f
          ----------------------------------------%n%n
          """, receita.getDescricao(), receita.getValor());
    }

    System.out.printf("""
        TOTAL DE RECEITAS: %.2f
        MEDIA DAS RECEITAS: %.2f
        ----------------------------------------%n%n
        """, totalReceita, totalReceita / receitas.size());
  }

  public void setReceita(Receita receita) {
    this.receitas.add(receita);
  }
}
