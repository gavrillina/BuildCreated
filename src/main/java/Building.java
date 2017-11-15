import java.util.ArrayList;
import java.util.List;

public class Building {

    private String name;

    private List<Room> rooms = new ArrayList<Room>();


    public String getBuildingtName() {
        return name;
    }

    public Building(String name) {
        this.name = name;
    }


    public void addRoom(String name, int area, int countWindow) {

        Room room = new Room();
        room.setName(name);
        room.setArea(area);
        room.setCountWindow(countWindow);
        rooms.add(room);

    }

    public Room getRoom(int index) {

        return rooms.get(index);
    }


    public int getroomCount() {
        int count = 0;
        count = rooms.size();
        return count;
    }


    public void describe() throws IlluminanceTooMuchException, SpaceUsageTooMuchException {

        System.out.println(getBuildingtName());
        String roomDecscibe;
        for (int i = 0; i < rooms.size(); i++) {
            roomDecscibe = rooms.get(i).getName();
            System.out.println(roomDecscibe);
            rooms.get(i).describeIlluminanceRoom();
            if (rooms.get(i).getAllowIlluminance() > 4000 || rooms.get(i).getAllowIlluminance() < 300)
                throw new IlluminanceTooMuchException("Too much Illuminance!");
            rooms.get(i).describeFurnetureRoom();
            if (rooms.get(i).getArea() - (rooms.get(i).getArea() * 0.3) < rooms.get(i).getAllowArea())
                throw new SpaceUsageTooMuchException("Too much furneture!");
        }
    }
}
