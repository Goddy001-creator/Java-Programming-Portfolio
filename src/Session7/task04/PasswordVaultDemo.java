package Session7.task04;

class PasswordVault {

    private String password;

    public PasswordVault(String initial) {
        this.password = initial;
    }

    private boolean isStrong(String p) {
        return p.length() >= 8
                && !p.equalsIgnoreCase("password");
    }

    public boolean changePassword(String current, String next) {

        if (!password.equals(current)) {
            System.out.println("Current password wrong.");
            return false;
        }

        if (!isStrong(next)) {
            System.out.println("New password too weak.");
            return false;
        }

        password = next;
        System.out.println("Password changed.");
        return true;
    }

    public boolean verify(String attempt) {
        return password.equals(attempt);
    }
}

public class PasswordVaultDemo {

    public static void main(String[] args) {

        PasswordVault v =
                new PasswordVault("start123");

        v.changePassword("wrong", "muchbetter1");
        v.changePassword("start123", "short");
        v.changePassword("start123", "muchbetter1");

        System.out.println(
                "verify('muchbetter1') -> "
                        + v.verify("muchbetter1")
        );

        System.out.println(
                "verify('start123')    -> "
                        + v.verify("start123")
        );
    }
}
