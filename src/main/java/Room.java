import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private int area;
    private int countWindow;
    private int allowArea;
    private int allowIlluminance;
    private final int ILLUMINANCEWINDOW = 700;


   private List<Illuminance> illuminances = new ArrayList<Illuminance>();

   private List<Furneture> furnetures = new ArrayList<Furneture>();

    public Room() {
    }


    public void describeIlluminanceRoom() {
        int illuminance = 0;

        for (int i = 0; i < illuminances.size(); i++) {
            illuminance = illuminances.get(i).getIlluminance() + illuminance;
            allowIlluminance = illuminance + countWindow * ILLUMINANCEWINDOW;
        }
        if (illuminance == 0) {
            allowIlluminance = countWindow * ILLUMINANCEWINDOW;
            System.out.println("Освещение=" + allowIlluminance + " кл( " + countWindow + " окна по" + ILLUMINANCEWINDOW + " кл)");
        } else
            System.out.print("Освещение=" + allowIlluminance + " кл( " + countWindow + " окна по  " + ILLUMINANCEWINDOW + " кл ");
        for (Illuminance ill : illuminances) {
            System.out.print(ill.getName() + " по " + ill.getIlluminance() + " кл,");
        }
        System.out.println(")");
    }


    public void describeFurnetureRoom() {
        int areaFurn = 0;
        String furnetureName = null;
        System.out.println("Мебель:");
        for (int i = 0; i < furnetures.size(); i++) {
            furnetureName = furnetures.get(i).getName();
            areaFurn = furnetures.get(i).getArea();
            System.out.println(furnetureName + " ( площадь " + areaFurn + " м^2 )");
        }
        if (areaFurn == 0) {
            System.out.print("нет");
        }

    }

    public int getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setCountWindow(int countWindow) {
        this.countWindow = countWindow;
    }

    public int getCountWindow() {
        return countWindow;
    }

    public int getAllowIlluminance() {

        for (int i = 0; i < illuminances.size(); i++) {
            allowIlluminance = illuminances.get(i).getIlluminance();
        }
            allowIlluminance = countWindow * ILLUMINANCEWINDOW + allowIlluminance;
        return allowIlluminance;
    }


    public int getAllowArea() {
        return allowArea;
    }


    public void addFurneture(String name, int areaFurn) {

        Furneture furneture = new Furneture();
        furneture.setName(name);
        furneture.setArea(areaFurn);
        furnetures.add(furneture);
           for (int i = 0; i < furnetures.size(); i++) {
            allowArea = furnetures.get(i).getArea()+allowArea;
        }
        }



    public void addIlluminance(String name, int illuminance) {

        Illuminance illuminance1 = new Illuminance();
        illuminance1.setName(name);
        illuminance1.setIlluminance(illuminance);
        illuminances.add(illuminance1);
        allowIlluminance = 0;

        for (int i = 0; i < illuminances.size(); i++) {
            allowIlluminance = illuminances.get(i).getIlluminance() + allowIlluminance;
        }
        allowIlluminance = allowIlluminance + countWindow * ILLUMINANCEWINDOW;
    }


    public int getIllminanceCount() {
        int illCount = illuminances.size();
        return illCount;
    }

    public int getFurnetureCount() {
        int furnCount = furnetures.size();
        return furnCount;
    }


    @Override
    public String toString() {
        Room room = new Room();
        System.out.println(room.getName() + "  Количество окон " + room.getCountWindow() + "  Площадь" + room.getArea());
        return toString();
    }
}


