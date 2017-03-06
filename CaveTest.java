import static org.junit.Assert.assertEquals;
import org.junit.*;

  public class CaveTest {
    Cave cave;
    Cyclops cyclops;

    @Before
    public void before(){
      cave = new Cave("South Sicily Coastal Caves");
      cyclops = new Cyclops();
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

  }
