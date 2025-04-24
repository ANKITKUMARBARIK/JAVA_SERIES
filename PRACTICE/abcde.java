class Example {
    public String demo = "defence";
    public int l, b, h;

    public void play(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
        System.out.println(this.l);
        System.out.println(this.b);
        System.out.println(this.h);
    }

    public void func(int age) {
        if (age > 18)
            System.out.println("Greater");
    }
}

public class abcde {
    public static void main(String[] args) {
        Example e = new Example();
        e.demo = "attack";
        System.out.println(e.demo);
        e.func(45);
        e.play(12, 12, 14);
    }
}
