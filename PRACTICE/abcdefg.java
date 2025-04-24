class Example{
    int l,b,h;
    public Example(){
        l=10;
        b=10;
        h=10;
    }
    public Example(int l,int b,int h){
        System.out.println(l+b+h);
    }

    public void func(){
        System.out.println(l*b*h);
    }
}
public class abcdefg{
    public static void main(String[] args){
        Example e = new Example();
        e.func();
        Example e1 = new Example(2,3,4);
    }
}