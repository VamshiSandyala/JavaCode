public class Test {
    public static void add(){
        int a=10,b=20;
        int sum=a+b;
        System.out.println("Sum of two: "+sum);
    }
    public static void sub(){
        int a=10,b=20;
        int diff=a-b;
        System.out.println("Diff of two: "+diff);
    }
     public static void div(){
        int a=10,b=20;
        int div=a/b;
        System.out.println("div of two: "+div);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Test t=new Test();
        t.sub();
        t.add();
        t.div();
    }
}
