import jdk.nashorn.internal.ir.annotations.Ignore;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RoomTest {

    Room room;
    @BeforeMethod
    public void init(){
     room = new Room();
    }

    @Test
    public void addIlluminance() throws IlluminanceTooMuchException, SpaceUsageTooMuchException {
       room.setCountWindow(3);
        int before = room.getIllminanceCount();
            room.addIlluminance("fffdd", 0);
        int after = room.getIllminanceCount();
        Assert.assertEquals(after - before, 1);
    }

    @Test
    public void addFurnetureTest() throws SpaceUsageTooMuchException {

        room.setArea(150);
        int before = room.getFurnetureCount();
            room.addFurneture("dhdhd", 11);
        int after = room.getFurnetureCount();
        Assert.assertEquals(after - before, 1);
    }


    @Ignore
    public void addTetsException() throws SpaceUsageTooMuchException {
         room.setArea(150);
        room.addFurneture("nmnmn", 150);
    }
}

