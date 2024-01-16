package Ex2;
public class Carte {
    protected String iban;
    protected double somme;
    
    public Carte(String iban, double somme){
        this.iban = iban;
        this.somme = somme;
    }

    public void retirer(double somme){
        this.somme = this.somme - somme;
    }

    @Override
    public String toString() {
        return "Carte [iban=" + iban + ", somme=" + somme + "]";
    }

    
}
