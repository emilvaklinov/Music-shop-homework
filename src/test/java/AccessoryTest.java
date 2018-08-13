import accessories.Bagpipe1;
import accessories.Drum1;
import accessories.Guitar1;
import accessories.Piano1;
import org.junit.Before;

public class AccessoryTest {
private Bagpipe1 bagpipe1;
private Drum1 drum1;
private Guitar1 guitar1;
private Piano1 piano1;

@Before
    public void before(){
    bagpipe1 = new Bagpipe1(InstrumentType.LEATHER,5);
    drum1 = new Drum();
    guitar1 = new Guitar();
    piano1 = new Piano();

}
}
