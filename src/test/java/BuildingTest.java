import org.testng.Assert;
import org.testng.annotations.Test;

public class BuildingTest {

    @Test
    public void addRoom(){
        Building building=new Building("fhfh");
        int before=building.getroomCount();
        building.addRoom("name",12,6);
        int after=building.getroomCount();
        Assert.assertEquals(after-before,1);
    }

}
