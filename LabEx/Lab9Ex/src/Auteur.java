public class Auteur {
    private int code;
    private String nom;
    private String prenom;
    private int age;
    private static int counter = 0;
    
    public Auteur(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        counter++;
        code = counter;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int newCode){
        this.code = newCode;
    }
    @Override
    public String toString(){
        return this.nom + " " + this.prenom + " " + this.age + " " + this.code;
    }
    
    public static void main(String[] args) throws Exception {
        Auteur Gabi = new Auteur(null, null, counter);
        System.out.println(Gabi.toString());
    }
}
