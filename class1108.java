interface Data{
    public void showData();
}


interface Test{
    public void showScore();
    public double calcu();
}


class Stu{
    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;

    public Stu(String a,String b,int c,int d,int e){
        id = a;
        name = b;
        mid = c;
        finl = d;
        common = e;
    }

    public void show(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("mid:"+mid);
        System.out.println("finl:"+finl);
        System.out.println("common:"+common);
    }

}




public class class1108{
    public static void main(String args[]){
        Stu stu = new Stu("940001","Fiona",90,92,85);
        stu.show();
    }
}