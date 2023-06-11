package uaspbo;

public class Main {
    static public final String USERNAME = "Pramudya";
    static public final String PASSWORD = "077";
    public static void main(String args[]) {
        // TODO code application logic here
        Login lg = new Login();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }
}
