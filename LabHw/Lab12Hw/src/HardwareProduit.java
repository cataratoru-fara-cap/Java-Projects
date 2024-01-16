public abstract class HardwareProduit {
    private double monnaiePrix;
    private double leiPrix;
    private double note;
    private double performace;

    public abstract void calculerPerformance();
    public abstract double calculerRApportLeiPrixPerformance();
    public abstract void calculerPrixLei();
    
    @Override
    public String toString() {
        return "HardwareProduit [monnaiePrix=" + monnaiePrix + ", leiPrix=" + leiPrix + ", note=" + note
                + ", performace=" + performace + "]";
    }
    
}
