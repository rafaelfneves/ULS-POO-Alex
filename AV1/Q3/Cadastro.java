// Aluno: Rafael Fernandes das Neves
// Matrícula: 50015993
package AV1;
import java.util.Scanner;

public class Cadastro extends Pessoa {

    public Cadastrar(String nome, String cpf, String telefone){
        super.setNome(nome);
        super.setCPF(cpf);
        super.setTelefone(telefone);
    }
    
    public Imprimir(String nome, String cpf, String telefone){
        System.out.println("Nome: "+ nome);
        System.out.println("CPF: "+ cpf);
        System.out.println("Telefone: "+ telefone);
    }
}
