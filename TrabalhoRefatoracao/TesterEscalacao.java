import java.util.ArrayList;

public class Escalacao 
{
	private String imprimir;

	public Escalacao() 
    {
		this.imprimir="Imprimir Escala";
	}

	public Escalacao(String imprimir) 
    {
		super();
		this.imprimir = imprimir;
	}

	public String getImprimir(ArrayList<Jogador> jogadores) 
    {
		return imprimir;
	}

	public void setImprimir(String jogadores) 
    {
		this.imprimir = jogadores;
	}
}


package entities;

 public class Jogador {
 private String nome;
 private String sobrenome;
 private Integer idade;
 private Time time;

 public Jogador() 
 {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer integer) {
        this.idade = integer;
    }
    public Time getTime() {
        return time;
    }

}

package entities;

public class Time 
{

	private String nome;
	private String escudo;

	public Time()  
    {	
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getEscudo() {
            return escudo;
        }
        public void setEscudo(String escudo) {
            this.escudo = escudo;
        }
    }
}

package main;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.Escalacao;
import entities.Jogador;
import entities.Time;

public class EscalacaoTest {

	public static void main(String[] args) 
    {

		Time time= new Time();
		Escalacao escalacao= new Escalacao();

		ArrayList<Jogador> jogadores= new ArrayList<Jogador>();
		Scanner scanner= new Scanner(System.in);

		Jogador jogador1= new Jogador();
		Jogador jogador2= new Jogador();
		Jogador jogador3= new Jogador();
		Jogador jogador4= new Jogador();
		Jogador jogador5= new Jogador();


        time.setNome(JOptionPane.showInputDialog
        ( "Entre com nome do time:"));


        System.out.println("Informe o nome do jogador 1: ");
        jog1.setNome(scanner.nextLine());
        jogadores.add(jogador1);

        System.out.println("Informe o nome do jogador 2: ");
        jog2.setNome(scanner.nextLine());
        jogadores.add(jogador2);

        System.out.println("Informe o nome do jogador 3: ");
        jog3.setNome(scanner.nextLine());
        jogadores.add(jogador1);

        System.out.println("Informe o nome do jogador 4: ");
        jog4.setNome(scanner.nextLine());
        jogadores.add(jogador4);

        System.out.println("Informe o nome do jogador 5: ");
        jog5.setNome(scanner.nextLine());
        jogadores.add(jogador5);

        System.out.println(escalacao.getImprimir(jogadores));

        System.out.println("Time: "+time.getNome());
        System.out.println("=================");

        System.out.println("Jogador 1: "+jogador1.getNome());
        System.out.println("Jogador 2: "+jogador2.getNome());
        System.out.println("Jogador 3: "+jogador3.getNome());
        System.out.println("Jogador 4: "+jogador4.getNome());
        System.out.println("Jogador 5: "+jogador5.getNome());
	}

}