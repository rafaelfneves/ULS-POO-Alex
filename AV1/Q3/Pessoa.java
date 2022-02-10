// Aluno: Rafael Fernandes das Neves
// Matrícula: 50015993
package AV1;
import java.util.Scanner;

public class Pessoa 
{
	private String nome;
	private String cpf;
	private String telefone;

	//Get Nome
	public String getNome() 
    {
        return nome;
    }
	//Set Nome
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

	//Get CPF
	public String getCPF() 
    {
        return nome;
    }
	//Set CPF
    public void setCPF(String cpf) 
    {
        this.cpf = cpf;
    }

	//Get Telefone
	public String getTelefone() 
    {
        return telefone;
    }
	//Set CPF
    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }


	public Pessoa(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
}