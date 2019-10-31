package SKARBFI;

public class treasureHunt {
    private int baseVertical = 0;
    private int baseHorizon = 0;

    public int changeVertical(int vertical) {
        int verticalOutpu = baseVertical + vertical;
        return verticalOutpu;
    }

    public int changeHorizon(int horizon) {
        int horizonOutput = baseHorizon + horizon;
        return horizonOutput;
    }

    public String showVerticalCoordinate(int vertical) {
        if (vertical > 0) {
            return "0 " + vertical;
        } else if (vertical < 0) {
            return "1 " + Math.abs(vertical);
        } else {
            return "0 " + vertical;
        }
    }

    public String showHorizonCoordinate(int horizon) {
        if (horizon > 0) {
            return "3 " + horizon;
        } else if (horizon < 0) {
            return "2 " + Math.abs(horizon);
        } else {
            return "0 " + horizon;
        }
    }

}
