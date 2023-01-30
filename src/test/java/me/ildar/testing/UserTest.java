package me.ildar.testing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void editUserWithTwoParamTest() {
        User user = new User("user", "user@mail.ru");

        assertNotNull(user.getLogin(), user.getEmail());
    }

    @Test
    public void editUserWithoutParamTest() {
        User user = new User();

        assertNull(user.getLogin(), user.getEmail());
    }

    @Test
    public void checkCorrectnessUsersEmailTest() {
        User user = new User();
        user.setLogin("ildar");
        user.setEmail("ildar@mail.ru");
        boolean check;
        check = user.getEmail().contains("@") && user.getEmail().contains(".");

        assertTrue(check);
    }

    @Test
    public void checkEqualsEmailAndLoginTest() {
        User user = new User();
        user.setLogin("ildar");
        user.setEmail("ildar@mail.ru");

        assertNotEquals(user.getLogin(), user.getEmail());

    }
}
