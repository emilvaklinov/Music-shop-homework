import accessories.Bagpipe1;
import org.junit.Before;

public class AccessoryTest {
private Bagpipe1 bagpipe1;
private Drum drum1;
private Guitar guitar1;
private Piano piano1;

@Before
    public void before(){
    bagpipe1 = new Bagpipe1("", 120);
    drum1 = new Drum("", 55);
    guitar1 = new Guitar("", 70);
    piano1 = new Piano("", 300);

}
}
