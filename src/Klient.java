public class Klient {
    private String imie;
    private String nazwisko;
    private String email;

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " (" + email + ")";
    }
}

