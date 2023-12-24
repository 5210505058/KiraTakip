import java.util.Collections;
public class Main {

    public static void main(String[] args) {

        Bina binam = new Bina("Lorem Ipsum", 17);


        EvSahibi sahip1 = new EvSahibi("Name1", "Surname1");
        EvSahibi sahip2 = new EvSahibi("Name2", "Surname2");

        Daire daire1 = new Daire("Ut enim ad minim veniam, quis nostrud exercitation ullamco ", 5);
        Daire daire2 = new Daire("Lorem ipsum dolor sit amet, consectetur adipiscing elit", 21);

        sahip1.daireEkle(daire1);
        sahip2.daireEkle(daire2);

        binam.Ekle(daire1);
        binam.Ekle(daire2);

        sahip1.Goster();
        sahip2.Goster();
        System.out.println("\n");

        Kiraci kiraci1 = new Kiraci("Name1", "Surname1", sahip1);
        Kiraci kiraci2 = new Kiraci("Name2", "Surname2", sahip2);

        kiraci1.Goster();
        kiraci2.Goster();
    }
}
