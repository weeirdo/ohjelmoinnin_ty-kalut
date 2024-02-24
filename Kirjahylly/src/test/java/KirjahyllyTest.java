import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KirjahyllyTest {

    @Test
    void lisaaKirja() {
        Kirjahylly kirjahylly = new Kirjahylly();
        kirjahylly.lisaaKirja("kirja1");
        kirjahylly.lisaaKirja("kirja2");
        assertEquals(2, kirjahylly.getKirjojaHyllyssa());
    }

    @Test
    void viimeksiLisatty() {
        Kirjahylly kirjahylly = new Kirjahylly();
        kirjahylly.lisaaKirja("kirja1");
        kirjahylly.lisaaKirja("kirja2");
        assertEquals("kirja2", kirjahylly.viimeksiLisatty());
    }

    @Test
    void onkoKirjaHyllyssa() {
        Kirjahylly kirjahylly = new Kirjahylly();
        kirjahylly.lisaaKirja("kirja1");
        kirjahylly.lisaaKirja("kirja2");
        assertEquals(true, kirjahylly.onkoKirjaHyllyssa());
    }

    @Test
    void getKirjojaHyllyssa() {
        Kirjahylly kirjahylly = new Kirjahylly();
        kirjahylly.lisaaKirja("kirja1");
        kirjahylly.lisaaKirja("kirja2");
        assertEquals(2, kirjahylly.getKirjojaHyllyssa());
    }
}