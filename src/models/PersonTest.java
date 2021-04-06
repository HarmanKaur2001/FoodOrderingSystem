package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;
    @BeforeEach
    void setUp(){
        person = new Person("Harman","Kaur","39 SandWay drive",
                "Female", LocalDate.of(2001,12,14));
    }

    @Test
    void getAge() {
        assertEquals(19,person.getAge());
    }

    @Test
    void setFirstName() {
        person.setFirstName("Harman");
        assertEquals("Harman",person.getFirstName());
    }

    @Test
    void setFirstNameInvalidEmpty() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setFirstName(""));
    }

    @Test
    void setFirstNameInvalidNumbersEnd() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setFirstName("Harman12345"));
    }

    @Test
    void setFirstNameInvalidNumbers() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setFirstName("67HH77"));
    }

    @Test
    void setLastName() {
        person.setLastName("Kaur");
        assertEquals("Kaur",person.getLastName());
    }

    @Test
    void setlastNameInvalidEmpty() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setFirstName(""));
    }

    @Test
    void setLastNameInvalidNumbersEnd() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setFirstName("Harman123"));
    }

    @Test
    void setLastNameInvalidNumbers() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setFirstName("22ff"));
    }

    @Test
    void setAddress() { person.setAddress("39 Sandway Drive, Brampton, ON");
    assertEquals("39 Sandway Drive, Brampton, ON", person.getAddress());
}

    @Test
    void setInvalidAddressEmpty() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setAddress("    "));
    }

    @Test
    void setBirthday() {
        person.setBirthday(LocalDate.of(2001,12,14));
        assertEquals(LocalDate.of(2001,12,14),person.getBirthday());
    }

    @Test
    void setInvalidBirthdayFuture() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setBirthday(LocalDate.of(2030,01,01)));
    }



    @Test
    void getGender() {
        person.setGender("Female");
        assertEquals("Female",person.getGender());
    }

    @Test
    void testToString() {
    }
}