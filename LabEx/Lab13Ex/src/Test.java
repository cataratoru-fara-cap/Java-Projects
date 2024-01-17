import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        
        ArrayList <Projet> projects = new ArrayList<>();
        Manager Dumi = new Manager("Dumi");
        Programeur Elian = new Programeur("Elian");

        try {
            FileReader fr = new FileReader("projets.txt");
            BufferedReader br = new BufferedReader(fr);
            String strLine;

            while( (strLine = br.readLine()) != null ){
                String[] data = strLine.split(" ");
                String projname = data[0]; 
                Integer buget = Integer.parseInt(data[1]);
                
                Projet dummyProjet = new Projet(projname, buget);
                projects.add(dummyProjet);
            }
        
        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        Dumi.addProjets(projects);
        Elian.addProjets(projects);

        System.out.println(Dumi.calculerSalaire());
        System.out.println(Elian.calculerSalaire());

    }
}
