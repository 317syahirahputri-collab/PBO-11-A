import java.util.ArrayList;

public class Member {

    private String idMember;
    private String nama;
    private String email;
    private ArrayList<Buku> daftarBukuDipinjam;

    // Constructor
    public Member(String idMember, String nama, String email) {
        this.idMember = idMember;
        this.nama = nama;
        this.email = email;
        this.daftarBukuDipinjam = new ArrayList<>();
    }

    // Getter (Diperlukan agar subclass dapat mengakses nilainya)
    public String getIdMember() {
        return idMember;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Buku> getDaftarBukuDipinjam() {
        return daftarBukuDipinjam;
    }

    // Method meminjam buku
    public void pinjamBuku(Buku buku) {
        if (buku != null && buku.pinjamBuku()) {
            daftarBukuDipinjam.add(buku);
            System.out.println(nama + " berhasil meminjam buku \"" + buku.getJudul() + "\".");
        } else {
            System.out.println("Buku \"" + (buku != null ? buku.getJudul() : "") + "\" tidak tersedia.");
        }
    }

    // Method mengembalikan buku
    public void kembalikanBuku(Buku buku) {
        if (buku != null && daftarBukuDipinjam.remove(buku)) {
            buku.kembalikanBuku();
            System.out.println(nama + " mengembalikan buku \"" + buku.getJudul() + "\".");
        } else {
            System.out.println("Buku tersebut tidak sedang dipinjam oleh " + nama + ".");
        }
    }

    // Menampilkan informasi member
    public void tampilkanInfo() {
        System.out.println("ID Member : " + idMember);
        System.out.println("Nama      : " + nama);
        System.out.println("Email     : " + email);
        tampilkanBukuDipinjam();
    }

    // Helper method untuk menampilkan buku
    protected void tampilkanBukuDipinjam() {
        System.out.println("Buku yang dipinjam:");
        if (daftarBukuDipinjam.isEmpty()) {
            System.out.println("- Tidak ada buku yang dipinjam");
        } else {
            for (Buku buku : daftarBukuDipinjam) {
                System.out.println("- " + buku.getJudul());
            }
        }
    }
}