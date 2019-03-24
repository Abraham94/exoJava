package exo.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Banque b = new Banque();
        b.setNomBanque("AbdBanque");
        b.setCodeBanque("337334558");
        b.setAdresseBanque("Champs");

        System.out.println(b);
    }
}

