/**
 * OOP
 */
class Encap{
    private int id;
    private String name;
    public void setname(String name)
    {
        this.name=name;
        System.out.println(name);
    }
    public void setid(int id)
    {
        this.id=id;
        System.out.println(id);
    }
    public String getname()
    {
        return name;
    }
    public int getid()
    {
        return id;
    }

}
public class OOP {

    public static void main(String[] args) {
        Encap s1=new Encap();
        s1.setname("Shuvon");
        s1.setid(88);
        System.out.println(s1.getname());
    }
}