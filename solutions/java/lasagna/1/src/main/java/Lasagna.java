public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven () {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven (int actualTime) {
        return 40 - actualTime;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layer) {
        return 2 * layer;
    }


    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes (int layer, int minutes) {
        return layer * 2 + minutes;
        
    }
}
