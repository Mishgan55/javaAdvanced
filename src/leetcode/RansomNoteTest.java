package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
    RansomNote ransomNote;
    @BeforeEach
    void getData(){
        ransomNote=new RansomNote();
    }

    @Test
    void canConstructTest1() {
        assertTrue(ransomNote.canConstruct("aa","aab"));
    }
    @Test
    void canConstructTest2() {
        assertFalse(ransomNote.canConstruct("a","b"));
    }
    @Test
    void canConstructTest3() {
        assertFalse(ransomNote.canConstruct("aa","ab"));
    }

}