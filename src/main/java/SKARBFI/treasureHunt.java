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

    public int getBaseVertical() {
        return baseVertical;
    }

    public int getBaseHorizon() {
        return baseHorizon;
    }
}
