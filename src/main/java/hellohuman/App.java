package hellohuman;

public class App {
    public String getGreeting() {
        return "Hello Human!!!.";
    }

    public static void main(String[] args) {  
        System.out.println(new App().getGreeting());
    }
    Demo d = new Demo();
    d.say();
}


