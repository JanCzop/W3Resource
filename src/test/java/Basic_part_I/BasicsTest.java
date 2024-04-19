package Basic_part_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicsTest {

    @Test
    void task_19_int_to_bin() {
        assertEquals("10",Basics.task_19_int_to_bin(2));
    }
    @Test
    void task_20_int_to_hex() {
        assertEquals("F",Basics.task_20_int_to_hex(15));
        assertEquals("9",Basics.task_20_int_to_hex(9));
    }

    @Test
    void task_21_int_to_oct() {
        assertEquals("17",Basics.task_21_int_to_oct(15));
    }

    @Test
    void task_22_bin_to_int() {
        assertEquals(4,Basics.task_22_bin_to_int("100"));
    }

    @Test
    void task_23_bin_to_hex() {
        assertEquals("D",Basics.task_23_bin_to_hex("1101"));
    }

    @Test
    void task_24_bin_to_oct() {
        assertEquals("7",Basics.task_24_bin_to_oct("111"));
    }
}