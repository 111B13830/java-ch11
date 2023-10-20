interface iAaa{
    public void show();
}
class Bbb{
   public int num=10;
   public void set(int n){
    num = n;
   }
}
class Ccc extends Bbb implements iAaa{
    public Ccc(int n){
        super();
        set(n);
    }
    public void show(){
        System.out.println("num="+num);
    }
}
public class class1105{
    public static void main (String[] args){
        Ccc obj =new Ccc(5);
        obj.show();
    }
}