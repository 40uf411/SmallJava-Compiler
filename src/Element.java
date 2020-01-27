public class Element {
    public String ident;
    public String type;
    public Object val;

    public Element(String id, String tp){
        ident = id; type =tp;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }
}