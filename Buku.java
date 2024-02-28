public class Buku {
    private String penulis;
    private String judul;
    private double harga;
    private int nomor_penerbit;

    // Constructor to initialize penulis, judul, harga, and nomor_penerbit
    public Buku(String penulis, String judul, double harga, int nomor_penerbit) {
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.nomor_penerbit = nomor_penerbit;
    }

    // Getter for penulis
    public String getPenulis() {
        return penulis;
    }

    // Setter for penulis
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    // Getter for judul
    public String getJudul() {
        return judul;
    }

    // Setter for judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Getter for harga
    public double getHarga() {
        return harga;
    }

    // Setter for harga
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Getter for nomor_penerbit
    public int getNomor_penerbit() {
        return nomor_penerbit;
    }

    // Setter for nomor_penerbit
    public void setNomor_penerbit(int nomor_penerbit) {
        this.nomor_penerbit = nomor_penerbit;
    }

    // Method to calculate total cost for all books
    public static double hitungHargaBuku(Buku[] buku) {
        double totalHarga = 0;
        for (Buku b : buku) {
            totalHarga += b.getHarga();
        }
        return totalHarga;
    }

    public static void main(String[] args) {
        // Create some book objects
        Buku buku1 = new Buku("Author 1", "Book Title 1", 10.0, 123);
        Buku buku2 = new Buku("Author 2", "Book Title 2", 20.0, 456);
        Buku buku3 = new Buku("Author 3", "Book Title 3", 30.0, 789);

        // Calculate the total cost of all books
        double totalCost = hitungHargaBuku(new Buku[]{buku1, buku2, buku3});

        System.out.println("The total cost of all books is $" + totalCost);
    }
}
