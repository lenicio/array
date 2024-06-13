public class Main {
  public static void main(String[] args) {
    Carteira carteira = new Carteira();

    carteira.setReceita(new Receita("Salário", 2000));
    carteira.setReceita(new Receita("Rendimento", 250));
    carteira.setReceita(new Receita("Premiação", 500));
    carteira.setReceita(new Receita("Restituição IR", 2500));

    carteira.exibirDetalhes();

  }
}