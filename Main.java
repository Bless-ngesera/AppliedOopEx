public class Main {
    String i = "I am an instance variable";
   static String s = "I am a static member";

   public void Method1(){
       String l = "I am a local variable";
       System.out.println( l + " And I can directly be accessed from where I was declared");
       System.out.println(Main.s);
   }

   public static void Method2(){
       System.out.println(Main.s);
   }
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.i + " And I need an instance(object) of a class in order to be accessed");

        System.out.println(Main.s + " And I can be used in a static and a non static environment ");

        obj.Method1();
        Method2();
    }
}