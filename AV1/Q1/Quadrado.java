// Aluno: Rafael Fernandes das Neves
// Matrícula: 50015993

package AV1;

public class Quadrado 
{
    private Ponto2D pt1;
    private Ponto2D pt2;

    public Ponto2D getPt1() 
    {
        return pt1;
    }

    public void setPt1(Ponto2D pt1) 
    {
        this.pt1 = pt1;
    }

    public Ponto2D getPonto2() 
    {
        return pt2;
    }
    public void setPonto2(Ponto2D pt2) 
    {
        this.pt2 = pt2;
    }

    public void desenhar() {
        pt1.print_cord();
        pt2.print_cord();
    }

}