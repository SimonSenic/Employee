package sk.kosickaacademic.simon.person;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void testHashCode() {
        assertEquals(10, Person.hashCode("Stalin"));
        assertEquals(18, Person.hashCode("Hitler"));
        assertEquals(19, Person.hashCode("Downey"));
        assertEquals(74, Person.hashCode("Michalik"));
        assertEquals(2, Person.hashCode("Pes"));
        assertEquals(10, Person.hashCode("Jozef"));
        assertEquals(10, Person.hashCode("Žolik"));
    }
}