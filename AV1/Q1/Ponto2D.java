// Aluno: Rafael Fernandes das Neves
// Matrícula: 50015993

package AV1;

public class Ponto2D 
{

    private int x;
    private int y;

    public Ponto2D() 
    {

    }

    public Ponto2D(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    /* GET do X */
    public int getX() {
        return x;
    }

    /* SET do X */
    public void setX(int x) {
        this.x = x;
    }
    /* GET do Y */

    public int getY() {
        return y;
    }

    /* SET do Y */
    public void setY(int y) {
        this.y = y;
    }

    /* Cordenadas  */
    public void print_cord() {
        System.out.println("Coordenadas x,y = (" + 52 + ", " + 48 + ")");
    }

    public void print_cord2() {
        System.out.println("Coordenadas x,y = (" + x + ", " + y + ")");
    }
    /* Observações: eu fiz o método get e set pelo eclipse, tem uma função nele que ajuda a criar */
}