public class StartHere {
    public static void main(String[] args) {
//        if (args.length > 0) {
//            System.out.println(args[0] + " is starting with Java");
//        } else {
//            System.out.println("I am starting with Java");
//        }
        GreetMe greetMe = new GreetMe();
        System.out.println(greetMe.greet("Simthera"));
    }
   public static class GreetMe {
        public String greet(String name) {

            return "Hello, " + name;
        }
    }
}