
package Aplicatii;

public class Instante {
    public static void main(String[] args) {
        Presedinte p=Presedinte.getPresedinte("Iohanis", "Klaus", "Romania");
        Presedinte q=Presedinte.getPresedinte("Ion", "Klaus", "Romania");
        System.out.println(p==q);
        System.out.println(q);
        System.out.println(p);
    }
    
}
