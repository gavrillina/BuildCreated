import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
    public static void main(String[] args) throws SpaceUsageTooMuchException, IlluminanceTooMuchException {

        Building building = new Building("Здание 1");

        System.setProperty("log4j.configurationFile", "src\\main\\resources\\log4j.xml");
        Logger logger = LogManager.getRootLogger();
        logger.info("add Room");

        building.addRoom("Комната 1", 100, 3);
        building.addRoom("Комната 2", 50, 2);


        building.getRoom(0).addIlluminance("Лампочка", 15);

        int allowIlluminance = building.getRoom(0).getAllowIlluminance();
        System.out.println(allowIlluminance);

        building.getRoom(0).addFurneture("Кресло", 0);

        building.getRoom(0).addFurneture("Кресло", 10);
        building.getRoom(0).addFurneture("Кресло", 6);
        building.getRoom(0).addFurneture("стол", 5);

        building.getRoom(0).addIlluminance("Лампочка", 65);
        building.getRoom(0).addIlluminance("Лампочка", 13);
        building.getRoom(0).addIlluminance("Лампа", 15);

        logger.debug("Produce describe");


        try {
            building.describe();
        } catch (SpaceUsageTooMuchException e) {
            logger.error("Too much furneture");
        } catch (IlluminanceTooMuchException e) {
            logger.error("Too much illuminance");
        }

    }

}
