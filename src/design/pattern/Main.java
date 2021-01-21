package design.pattern;

import design.pattern.pillows.*;

public class Main {

    public static void main(String[] args) {
        Factory factory = new PillowFactory();

        Pillow dailyPillow = factory.createPillow(PillowType.DAILYPILLOW);
        Pillow valentinesPillow = factory.createPillow(PillowType.VALENTINESDAYPILLOW);

        System.out.println(dailyPillow);

    }
}
