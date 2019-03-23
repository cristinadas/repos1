
package Aplicatii;

import java.util.Scanner;


public class TablouAngajati {
    public static void main(String[] args) {
        Angajat ta[]=new Angajat[5];
        //ta contine doar referinte nule!!!
        Scanner in= new Scanner("System.in");
        String nume;
        int varsta;
        double salariu;
        for(int i=0; i<ta.length;i++)
        {
          
            nume=in.next();
            varsta=in.nextInt();
            salariu=in.nextDouble();
            /*
            ta[i].setNume(nume);
            ta[i].setSalariu(salariu);
            ta[i].setVarsta(varsta);
*/         
              ta[i]=new Angajat(nume, varsta, salariu);
        }
        //System.out.println(ta);
        
        for(Angajat item:ta)
            System.out.println(item);
        System.out.println(Angajat.getNrIntern());
    }
    
}
