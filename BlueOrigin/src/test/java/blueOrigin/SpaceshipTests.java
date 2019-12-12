package blueOrigin;

import org.junit.Assert;
import org.junit.Test;

public class SpaceshipTests {
   @Test
    public void testGetCounts(){
       Spaceship spaceship=new Spaceship("shdga",12);
       Assert.assertEquals(0, spaceship.getCount());
   }
    @Test
    public void testGetName(){
        Spaceship spaceship=new Spaceship("aaa",12);
        Assert.assertEquals("aaa", spaceship.getName());
    }
    @Test
    public void testGetCapacity(){
        Spaceship spaceship=new Spaceship("shdga",12);
        Assert.assertEquals(12, spaceship.getCapacity());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddMore(){
        Spaceship spaceship=new Spaceship("aaa",0);
        spaceship.add(new Astronaut("nam",12));
    } @Test(expected = IllegalArgumentException.class)
    public void testsetCapacity(){
        Spaceship spaceship=new Spaceship("aaa",-11);

    }@Test(expected = NullPointerException.class)
    public void testsetName(){
        Spaceship spaceship=new Spaceship("",11);
        spaceship.add(new Astronaut("nam",12));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddSame(){
        Spaceship spaceship=new Spaceship("aaa",3);
        spaceship.add(new Astronaut("nam",12));
        spaceship.add(new Astronaut("nam",13));
    }
    @Test
    public void testAddCorrect(){
        Spaceship spaceship=new Spaceship("aaa",32);
        spaceship.add(new Astronaut("nam",12));
        Assert.assertEquals(1,spaceship.getCount());
    }
    @Test
    public void testRemoveCor(){
        Spaceship spaceship=new Spaceship("aaa",32);
        spaceship.add(new Astronaut("nam",12));
        Assert.assertTrue(spaceship.remove("nam"));
    } @Test
    public void testRemoveNot(){
        Spaceship spaceship=new Spaceship("aaa",32);
        spaceship.add(new Astronaut("nam",12));
        Assert.assertFalse(spaceship.remove("nam32e"));
    }
    @Test
    public void testRemoveCor2(){
        Spaceship spaceship=new Spaceship("aaa",32);
        spaceship.add(new Astronaut("nam",12));
        spaceship.remove("nam");
        Assert.assertEquals(0,spaceship.getCount());
    }


}
