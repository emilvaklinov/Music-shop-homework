import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagpipeTest {

        Bagpipe bagpipe;

        @Before
           public void before(){
            bagpipe = new Bagpipe("Scotish","Bzjzjzj",2);
    }

    @Test
    public void hasType(){
            assertEquals("Scotish", bagpipe.getType());
    }

    @Test
    public void hasChanter(){
            assertEquals(2, bagpipe.getChanter());
    }

    @Test
    public void play(){
            assertEquals("Bzjzjzj", bagpipe.play());
    }
}
