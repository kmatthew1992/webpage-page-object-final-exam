package eu.michaelclement.util;

public class UserFactory {
    public static User getUser(UserType userType) {
        User user = new User();
        switch (userType) {
            case VALID_USER -> {
                user.setUsername("practiceUser");
                user.setPassword("practicePass");
            }
            case INVALID_PASSWORD_USER -> {
                user.setUsername("practiceUser");
                user.setPassword("practicePss");
            }
            case INVALID_USERNAME_USER -> {
                user.setUsername("practiceUer");
                user.setPassword("practicePass");
            }
            default -> throw new RuntimeException();
        }
        return user;
    }
}
