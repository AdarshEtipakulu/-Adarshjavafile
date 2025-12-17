class Login {

    private String username = "ananya";
    private String password = "2805";

    public boolean validate(String a, String b) {
        if (username.equals(a) && password.equals(b))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Login l = new Login();

        if (l.validate("ananya", "2805"))
            System.out.println("Login Successful");
        else
            System.out.println("Login Failed");
    }
}
