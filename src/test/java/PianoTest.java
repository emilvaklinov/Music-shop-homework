import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("piano", "ding", 42);
    }

    @Test
    public void hasKey(){
        assertEquals(42, piano.getKey());
    }

    @Test
    public void hasType(){
        assertEquals("piano", piano.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("ding", piano.canPlay());
    }
}
