import java.util.Objects;

public class Buku implements Tampilkan{

    private String idBuku;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia;

    // Relasi Buku dengan GenreBuku
    private GenreBuku genre;

    // Constructor
    public Buku(String idBuku, String judul, String penulis,
                int tahunTerbit, GenreBuku genre) {

        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.genre = genre;
        this.tersedia = true;
    }

    // Getter
    public String getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public GenreBuku getGenre() {
        return genre;
    }

    // Method untuk meminjam buku
    public boolean pinjamBuku() {
        if (tersedia) {
            tersedia = false;
            return true;
        }
        return false;
    }

    // Method untuk mengembalikan buku
    public void kembalikanBuku() {
        tersedia = true;
    }

    // Menampilkan informasi buku
    @Override 
    public void tampilkanInfo() {
        System.out.println("ID Buku      : " + idBuku);
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Genre        : " + genre.getNamaGenre());
        System.out.println("Status       : " +
                (tersedia ? "Tersedia" : "Sedang Dipinjam"));
    }

    // Membandingkan kesamaan objek buku berdasarkan ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buku buku = (Buku) o;
        return Objects.equals(idBuku, buku.idBuku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBuku);
    }
}
