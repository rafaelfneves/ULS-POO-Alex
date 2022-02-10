// Aluno: Rafael Fernandes das Neves
// Matrícula: 50015993
package AV1;
import java.util.Scanner;

public class ClasseTester {
    
    public static void main(String[] args) {
        String nome;
        Cadastro novo = new Cadastrar();

        nome = "Rafael Neves";
        novo.Cadastrar(nome);
        novo.Imprimir();
    }
}
