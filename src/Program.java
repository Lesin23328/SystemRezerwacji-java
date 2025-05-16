public class Program {
    public static void main(String[] args) {
        SystemRezerwacji system = new SystemRezerwacji();

        // Dodaj wydarzenia
        Wydarzenie koncert = new Wydarzenie("Koncert Rockowy", "2025-06-20", "Stadion", 3);
        Wydarzenie teatr = new Wydarzenie("Hamlet", "2025-07-01", "Teatr Narodowy", 2);

        system.dodajWydarzenie(koncert);
        system.dodajWydarzenie(teatr);

        // Dodaj klientów
        Klient klient1 = new Klient("Jan", "Kowalski", "jan@example.com");
        Klient klient2 = new Klient("Anna", "Nowak", "anna@example.com");

        system.dodajKlienta(klient1);
        system.dodajKlienta(klient2);

        // Dokonaj rezerwacji
        system.zarezerwujBilet("Koncert Rockowy", "jan@example.com");
        system.zarezerwujBilet("Koncert Rockowy", "anna@example.com");
        system.zarezerwujBilet("Hamlet", "jan@example.com");
        system.zarezerwujBilet("Koncert Rockowy", "jan@example.com"); // powinien być ostatni wolny
        system.zarezerwujBilet("Koncert Rockowy", "anna@example.com"); // brak miejsc

        // Wyświetl wydarzenia z aktualną liczbą miejsc
        System.out.println("\nAktualna lista wydarzeń:");
        system.wyswietlWszystkieWydarzenia();
    }
}

