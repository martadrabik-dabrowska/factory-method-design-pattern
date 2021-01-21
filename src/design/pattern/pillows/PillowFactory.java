package design.pattern.pillows;

public class PillowFactory extends Factory {

    @Override
    public Pillow createPillow(PillowType type) {

        switch (type){
            case DAILYPILLOW:
                return new DailyPillow("Daily pillow", PillowShape.CIRCLE );

            case VALENTINESDAYPILLOW:
                return new ValentinesDayPillow("I love you", PillowShape.HEART);

                default:
                    throw new UnsupportedOperationException("No such type");
        }
    }
}
