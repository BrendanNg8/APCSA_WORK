public class FrogSimulation {
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }
    public int hopDistance() {
        return 5;
    }
    public boolean simulate() {
        int currPosition = 0;
        int currHop = 0;
        while (currPosition < goalDistance && currHop < maxHops && currPosition >= 0) { //While not at goal, haven't done all the hops, not negative
            currHop++;
            currPosition += hopDistance();
        }
        if (currPosition < 0) {
            return false;
        } else if (currPosition >= goalDistance) {
            return true;
        } else if (currHop > maxHops && currPosition < goalDistance) {
            return false;
        } else {return false;}
    }
    public double runSimulations(int num) {
        int tot = 0;
        for (int i = 0; i < num; i++) {
            if (simulate()) {tot++;}
        }
        return (double) tot/num;
    }
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);
        System.out.println(sim.simulate());
        System.out.println(sim.runSimulations(400));
    }
}
