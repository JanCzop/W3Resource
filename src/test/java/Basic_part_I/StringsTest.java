package Basic_part_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

    @Test
    void task_58_capitalize_letters() {
    }

    @Test
    void task_59_to_lower_case() {
        assertEquals("fox, dog", Strings.task_59_to_lower_case("FoX, dOG"));
    }

    @Test
    void task_60_penultimate_word() {
        assertEquals("dog",Strings.task_60_penultimate_word("fox dog cat"));
    }
}