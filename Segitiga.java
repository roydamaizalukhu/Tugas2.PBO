public class Segitiga {
    private double alas;
    private double tinggi;
    
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public void setAlas(double alas) {
        if (alas > 0) {
            this.alas = alas;
        } else {
            System.out.println("Nilai alas harus positif");
        }
    }
    
    public void setTinggi(double tinggi) {
        if (tinggi > 0) {
            this.tinggi = tinggi;
        } else {
            System.out.println("Nilai tinggi harus positif");
        }
    }
    
    public double getLuas() {
        double luas = 0.5 * alas * tinggi;
        return luas;
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        Segitiga segitiga = new Segitiga(5, 3);
        System.out.println("Luas segitiga: " + segitiga.getLuas());
    }
}
