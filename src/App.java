public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Window w = new Window();
        Automat a = new Automat();

        w.setAutomat(a);
        a.setWindow(w);

        w.start();
    }
}
