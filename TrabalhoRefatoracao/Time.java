import java.util.ArrayList;
import java.util.List;

public class Escalacao {
int i=1;
Jogador[] escalacao = new Jogador[5];

public void setEscalacao(Jogador a, Jogador b, Jogador c, Jogador d, Jogador e) {

  System.out.println("::::Escalação::::");
  System.out.println(i + " - " + a.getNome());
  i++;
  System.out.println(i + " - " + b.getNome());
  i++;
  System.out.println(i+ " - " +c.getNome());
  i++;
  System.out.println(i+ " - " +d.getNome());
  i++;
  System.out.println(i+ " - " +e.getNome());

 
}




}
