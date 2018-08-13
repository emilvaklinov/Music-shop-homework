import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {
Drum drum;

    @Before
    public void before(){
    drum = new Drum("Timpani", "Dum", 2);
        }

    @Test
    public void hasType(){
    assertEquals("Timpani", drum.getType());
    }

    @Test
    public void hasBatons(){
        assertEquals(2, drum.getBatons());
    }

    @Test
    public void play(){
        assertEquals("Dum", drum.play());
    }
}
