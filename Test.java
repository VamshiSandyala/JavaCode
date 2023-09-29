public class Test {
    public static void add(){
        int a=10,b=20;
        int sum=a+b;
        System.out.println("Sum of two: "+sum);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //creating instance
        Test t=new Test();
        t.add();
    }
}
