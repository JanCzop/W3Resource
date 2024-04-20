package Basic_part_I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalBasicsTest {

    @Test
    void task_33_sum_of_digits() {
        assertEquals(5,TotalBasics.task_33_sum_of_digits(12345));
    }

    @Test
    void task_34_hexagon_area() {
        assertEquals(93.53074360871938,TotalBasics.task_34_hexagon_area(6));
    }

    @Test
    void task_35_polygon_area() {
        assertEquals(130.82084798405722,TotalBasics.task_35_polygon_area(6,7));
    }

    @Test
    void task_36_distance_between_points_on_Earth() {
        assertEquals(1480.0848451069087,TotalBasics.task_36_distance_between_points_on_Earth(25,35,35.5,25.5));
    }

    @Test
    void task_37_reverse_string() {
        assertEquals("xof nworb kciuq ehT",TotalBasics.task_37_reverse_string("The quick brown fox"));
    }

    @Test
    void task_38_string_properties() {
        assertArrayEquals(new int[]{23,9,10,6},TotalBasics.task_38_string_properties("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33"));
    }

    @Test
    void task_39_count_unique_numbers() {
        assertEquals(24,TotalBasics.task_39_count_unique_numbers());
    }

    @Test
    void task_40_available_charsets() {
        TotalBasics.task_40_available_charsets();
    }

    @Test
    void task_41_display_chars_ASCII() {
        assertEquals(90,TotalBasics.task_41_display_chars_ASCII('Z'));
    }

    @Test
    void task_44() {
        assertEquals(615,TotalBasics.task_44(5));
        assertEquals(246,TotalBasics.task_44(2));
    }

    @Test
    void task_45_file_size() {
        assertEquals(35681,TotalBasics.task_45_file_size("C:Users/jascz/Desktop/WorkData/Github/W3exercises/src/main/Basic_part_I"));
    }

    @Test
    void task_49_is_even(){
        assertTrue(TotalBasics.task_49_is_even(38));
        assertFalse(TotalBasics.task_49_is_even(23352131));
    }
}