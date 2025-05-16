import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> wydarzenia;
    private ArrayList<Klient> klienci;

    public SystemRezerwacji() {
        wydarzenia = new ArrayList<>();
        klienci = new ArrayList<>();
    }

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public boolean zarezerwujBilet(String nazwaWydarzenia, String emailKlienta) {
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwaWydarzenia);
        Klient klient = znajdzKlienta(emailKlienta);

        if (wydarzenie != null && klient != null) {
            if (wydarzenie.zarezerwujMiejsce()) {
                System.out.println("Zarezerwowano bilet dla: " + klient);
                return true;
            } else {
                System.out.println("Brak miejsc na wydarzenie: " + nazwaWydarzenia);
            }
        } else {
            System.out.println("Nie znaleziono wydarzenia lub klienta.");
        }
        return false;
    }

    private Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : wydarzenia) {
            if (w.getNazwa().equalsIgnoreCase(nazwa)) {
                return w;
            }
        }
        return null;
    }

    private Klient znajdzKlienta(String email) {
        for (Klient k : klienci) {
            if (k.getEmail().equalsIgnoreCase(email)) {
                return k;
            }
        }
        return null;
    }

    public void wyswietlWszystkieWydarzenia() {
        for (Wydarzenie w : wydarzenia) {
            System.out.println(w);
        }
    }
}
