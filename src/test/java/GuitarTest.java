import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;


    @Before
    public void before(){
        guitar = new Guitar(4, "Bass", "twaang");
    }

    @Test
    public void hasGuitarType(){
        assertEquals("Bass", guitar.getType());
    }


    @Test
    public void canPlay(){
        assertEquals("twaang", guitar.play());
    }

   @Test
    public void hasStrings(){
       assertEquals(4, guitar.getStrings());
   }


}
