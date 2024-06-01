package eu.michaelclement.util;

public class AdminFactory {
    public static Admin getAdmin(AdminType adminType) {
        Admin admin = new Admin();
        switch (adminType) {
            case VALID_ADMIN -> {
                admin.setUsername("admin");
                admin.setPassword("adminPass");
            }
            default -> throw new RuntimeException();
        }
        return admin;
    }
}
