public class Main {
  public static void main(String[] args) {

    Time p = new Time();
    p.setNome("Palmas F.C.");
    p.setproxjogo("20/09/2022");
    System.out.println("::::Time::::");
    System.out.println("Nome: " + p.getNome());
    System.out.println("Data do próximo jogo: " + p.getproxjogo());

    Escalacao esc = new Escalacao();

    /* Jogadores */
    Jogador a = new Jogador();
    a.setNome("Júlio");
    a.setCamisa("12");
    a.setIdade(28);
    
    
    Jogador b = new Jogador();
    b.setNome("Josimar");
    b.setCamisa("10");
    b.setIdade(22);
   

    Jogador c = new Jogador();
    c.setNome("Valderrama");
    c.setCamisa("14");
    c.setIdade(32);
    

    Jogador d = new Jogador();
    d.setNome("Josimarcos");
    d.setCamisa("7");
    d.setIdade(18);
    

    Jogador e = new Jogador();
    e.setNome("Bocalete");
    e.setCamisa("1");
    e.setIdade(38);
    

    esc.setEscalacao(a, b, c, d, e);

    
    System.out.println();

  }
}
