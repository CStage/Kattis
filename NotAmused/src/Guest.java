public class Guest {
    private String name;
    private int entry;
    private int exit;
    private boolean inside;
    private double fee;
    private int earliestLegalEntry;

    public Guest(String gName, int gEntry) {
        name = gName;
        entry = gEntry;
        exit = 0;
        fee = 0.0;
    }

    public void setExit(int newExit) {
        exit = newExit;

    }

    public void setEarliestLegalEntry(int exit) {
        earliestLegalEntry = exit;
    }

    public void calculateFee() {
        double timeSpent = exit-entry;
        fee = fee + 0.10 * timeSpent;


    }
    public double getFee() {
        return fee;
    }

    public String getName() {
        return name;
    }

    public int getExit() {
        return exit;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int newEntry) {
        entry=newEntry;
    }

    public boolean getInside() {
        return inside;
    }

    public void setInside(boolean inside) {
        this.inside=inside;
    }

    public int getEarliestLegalEntry() {
        return earliestLegalEntry;
    }
}
