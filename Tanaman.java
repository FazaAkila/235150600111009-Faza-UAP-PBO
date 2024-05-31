abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    public Tanaman(int masaHidup, int lamaHidup,  int berbuah, int buah, double perkembangan, double prosesBerbuah) {
        this.masaHidup = masaHidup;
        this.lamaHidup = lamaHidup;
        this.berbuah = berbuah;
        this.buah = buah;
        this.perkembangan = perkembangan;
        this.prosesBerbuah = prosesBerbuah;
    }

    public void setMasaHidup(int M) {

    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setLamaHidup(int L) {

    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setBerbuah(int B) {

    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBuah(int H) {

    }

    public int getBuah() {
        return buah;
    }

    public void setPerkembangan(double P) {

    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setProsesBerbuah(double R) {

    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public abstract void berkembang();

    public String status() {
        if (lamaHidup >= masaHidup) {
            return "Mati";
        }
        return "Hidup";
    }

    @Override
    public String toString() {
        return "Masa Hidup : " + masaHidup + " hari, Umur : " + lamaHidup + " hari, Buah : " + buah + ", Status : " + status();
    }

}




