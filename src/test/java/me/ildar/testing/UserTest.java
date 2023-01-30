package me.ildar.testing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void editUserWithTwoParamTest() {
        String login = "user";
        String email = "user@mail.ru";
        User user = new User(login, email);

        assertNotNull(user.getLogin(), user.getEmail());
    }

    @Test
    public void editUserWithoutParamTest() {
        User user = new User();

        assertNull(user.getLogin(), user.getEmail());
    }

    @Test
    public void checkCorrectnessUsersEmailTest() {
        String login = "user";
        String email = "user@mail.ru";
        User user = new User(login, email);
        boolean check;
        check = user.getEmail().contains("@") && user.getEmail().contains(".");

        assertTrue(check);
    }

    @Test
    public void checkEqualsEmailAndLoginTest() {
        String login = "user";
        String email = "user@mail.ru";
        User user = new User(login, email);

        assertNotEquals(user.getLogin(), user.getEmail());

    }
}
