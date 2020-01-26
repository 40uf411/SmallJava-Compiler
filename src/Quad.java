import java.util.ArrayList;

public class Quad
{
    public String op;
    public String op1;
    public String op2;
    public String res;
    public static int counter = 0;
    public static ArrayList<Quad> listQuad = new ArrayList<>();

    public Quad(String op,String op1,String op2,String res)
    {
        this.op = op;
        this.op1 = op1;
        this.op2 = op2;
        this.res = res == null ? counter++ + "T": res;
    }

}
