interface Data{
    public void best();
    public void failed();
}
interface Teat extends Data{
    public void showData();
    public double average();
}
class Stu implements Teat{
    protected String name;
    protected int math;
    protected int english;
    public Stu(String a, int b, int c){
        name = a;
        math = b;
        english = c;
    }

    public double average(){
        return(math +english)/2.0;
    }

    public void showData(){
        System.out.println("姓名:"+name);
        System.out.println("數學成績:"+math);
        System.out.println("英文成績:"+english);
        System.out.println("平均成績:"+average());
    }
    public void best(){
        int maxScore = Math.max(math,english);
        if (maxScore == math){
            System.out.println(name + "的數學成績較高");
        }
        else if (maxScore == english){
            System.out.println(name +"的英文成績較高");
        }
        else {
            System.out.println(name+"成績一樣高");
        }
    }

    public void failed(){
        if (math<60){
            System.out.println(name+"的數學不及格");
        }
        if (english<60){
            System.out.println(name+"的英文不及格");
        }
    }

     
}

public class class1110{
    public static void main(String agrs[]){
        Stu s = new Stu("Judy",58,91);
        s.showData();
        s.best();
        s.failed();
    }
}