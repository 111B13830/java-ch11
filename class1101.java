abstract class Caaa{
    protected int num;
    
    public Caaa(int n){
        num = n;
    }
    public abstract void show();
}
class Cbbb extends Caaa{
   protected int Cbbb;
   public Cbbb(int n){
    super(n);
   }

   public void show(){
    System.out.println("num:"+num);
   }

}
public class class1101{
    public static void main (String args[]){
        Cbbb bb = new Cbbb(2);
        bb.show();
    }
}