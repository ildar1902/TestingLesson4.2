package me.ildar.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User user;

    @Test
    public void editUserWithTwoParamTest() {
        User user = new User("user", "user@mail.ru");

        assertNotNull(user.getLogin(), user.getEmail());
    }

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void editUserWithoutParamTest() {
        assertNull(user.getLogin(), user.getEmail());
    }

    @Test
    public void checkCorrectnessUsersEmailTest() {
        user.setLogin("ildar");
        user.setEmail("ildar@mail.ru");
        boolean check;
        check = user.getEmail().contains("@") && user.getEmail().contains(".");

        assertTrue(check);
    }

    @Test
    public void checkEqualsEmailAndLoginTest() {
        user.setLogin("ildar");
        user.setEmail("ildar@mail.ru");

        assertNotEquals(user.getLogin(), user.getEmail());

    }
}
