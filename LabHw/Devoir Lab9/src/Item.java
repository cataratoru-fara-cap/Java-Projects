public class Item {
    private char[] nom;
    private String description;
    private double prix;
    private long id;

    public Item(String nom, String description, long id, double prix) {
        this.nom = nom.toCharArray();
        this.description = description;
        this.id = id;
        this.prix = prix;
    }

    public Item(String nom, long id, double prix) {
        this.nom = nom.toCharArray();
        this.id = id;
        this.prix = prix;
    }
    
    public double getPrix() {
        return prix;
    }

    public double getPrix(int q) {
        if (q >= 5)
            return prix * 0.95;
        return prix;
    }
    
    public String toString() {
        if (description == null)
            return new String(nom) + " " + id + " " + prix;
        return new String(nom) + " " + description + " " + id + " " + prix;
    }

    public static void main(String[] args) throws Exception {
        Item i1 = new Item("Vodka", "Une bouteille de Vodka", 5483918746738L, 75.5);
        Item i3 = new Item("Fillet de citron 200g", 5473664615361L, 3.25);
        System.out.println(i1.toString());
        System.out.println(i3.toString());
    }
}
