public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int liczbaMiejsc;
    private int liczbaZarezerwowanych;

    public Wydarzenie(String nazwa, String data, String miejsce, int liczbaMiejsc) {
        this.nazwa = nazwa;
        this.data = data;
        this.miejsce = miejsce;
        this.liczbaMiejsc = liczbaMiejsc;
        this.liczbaZarezerwowanych = 0;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getData() {
        return data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public int getLiczbaZarezerwowanych() {
        return liczbaZarezerwowanych;
    }

    public boolean zarezerwujMiejsce() {
        if (liczbaZarezerwowanych < liczbaMiejsc) {
            liczbaZarezerwowanych++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Wydarzenie: " + nazwa + ", Data: " + data + ", Miejsce: " + miejsce +
                ", Dostępne miejsca: " + (liczbaMiejsc - liczbaZarezerwowanych);
    }
}
