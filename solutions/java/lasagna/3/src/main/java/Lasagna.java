public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven () {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven (int actualTime) {
        return expectedMinutesInOven() - actualTime;
    }
    
    public int preparationTimeInMinutes(int layer) {
        return PREPARATION_TIME_PER_LAYER * layer;
    }

    public int totalTimeInMinutes (int layer, int actualTime) {
        return preparationTimeInMinutes(layer) + actualTime;
        
    }
}
