package deadliner;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import deadliner.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2017.03.30 13:54:19 // Generated by ComTest
 *
 */
public class PrioriteettiTest {



  // Generated by ComTest BEGIN
  /** testLuoId26 */
  @Test
  public void testLuoId26() {    // Prioriteetti: 26
    Prioriteetti yksi = new Prioriteetti(); 
    assertEquals("From: Prioriteetti line: 28", 0, yksi.getId()); 
    yksi.luoId(); 
    Prioriteetti kaksi = new Prioriteetti(); 
    kaksi.luoId(); 
    int n1 = yksi.getId(); 
    int n2 = kaksi.getId(); 
    assertEquals("From: Prioriteetti line: 34", n2-1, n1); 
  } // Generated by ComTest END
}