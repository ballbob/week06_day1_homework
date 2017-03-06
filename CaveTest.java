import static org.junit.Assert.assertEquals;
import org.junit.*;

  public class CaveTest {
    Cave cave;
    Cyclops cyclops;
    PsychicWeirdo charles;

    @Before
    public void before(){
      cave = new Cave("South Sicily Coastal Caves");
      cyclops = new Cyclops();
      charles = new PsychicWeirdo("Charles");
    }

    @Test 
    public void caveName(){
      assertEquals("South Sicily Coastal Caves", cave.caveName());
    }

    @Test
    public void caveIsEmptyAtFirst(){
      assertEquals(0, cave.headCount());
    }

    @Test
    public void caveWelcomedOne(){
      cave.welcome(cyclops);
      assertEquals(1,cave.headCount());
    }

    @Test 
    public void cyclopesCantEnterIfAtCapacity(){
      for (int i=0; i<11; i++) {
        cave.welcome(cyclops);
      }
      assertEquals(10,cave.headCount());
    }

    @Test
    public void canCyclopesEvacuateCave(){
      cave.welcome(cyclops);
      cave.evacuate();
      assertEquals(0,cave.headCount());
    }

    @Test
    public void getWeirdoName(){
      assertEquals("Charles",charles.getName());
    }

    @Test
    public void weirdoSchoolStartsEmpty(){
      assertEquals(0,charles.schoolHeadCount());
    }

  }
