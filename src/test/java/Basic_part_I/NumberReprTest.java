package Basic_part_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberReprTest {

    @Test
    void task_19_int_to_bin() {
        assertEquals("10", Number_repr.task_19_int_to_bin(2));
    }
    @Test
    void task_20_int_to_hex() {
        assertEquals("F", Number_repr.task_20_int_to_hex(15));
        assertEquals("9", Number_repr.task_20_int_to_hex(9));
    }

    @Test
    void task_21_int_to_oct() {
        assertEquals("17", Number_repr.task_21_int_to_oct(15));
    }

    @Test
    void task_22_bin_to_int() {
        assertEquals(4, Number_repr.task_22_bin_to_int("100"));
    }

    @Test
    void task_23_bin_to_hex() {
        assertEquals("D", Number_repr.task_23_bin_to_hex("1101"));
    }

    @Test
    void task_24_bin_to_oct() {
        assertEquals("7", Number_repr.task_24_bin_to_oct("111"));
    }

    @Test
    void task_25_oct_to_int() {
        assertEquals(82, Number_repr.task_25_oct_to_int("122"));
    }

    @Test
    void task_27_oct_to_hex() {
        assertEquals("40", Number_repr.task_27_oct_to_hex("100"));
    }

    @Test
    void task_28_hex_to_int() {
        assertEquals(37, Number_repr.task_28_hex_to_int("25"));
    }

    @Test
    void task_29_hex_to_bin() {
        assertEquals("110111", Number_repr.task_29_hex_to_bin("37"));
        assertEquals("1111", Number_repr.task_29_hex_to_bin("F"));
    }

    @Test
    void task_30_hex_to_oct() {
        assertEquals("100", Number_repr.task_30_hex_to_oct("40"));
    }

}