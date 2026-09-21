public class GenreBuku implements Tampilkan {

    private String idGenre;
    private String namaGenre;

    // Constructor
    public GenreBuku(String idGenre, String namaGenre) {
        this.idGenre = idGenre;
        this.namaGenre = namaGenre;
    }

    // Getter
    public String getIdGenre() {
        return idGenre;
    }

    public String getNamaGenre() {
        return namaGenre;
    }

    // Setter
    public void setNamaGenre(String namaGenre) {
        this.namaGenre = namaGenre;
    }

    // Menampilkan informasi genre
    @Override 
    public void tampilkanInfo() {
        System.out.println("ID Genre   : " + idGenre);
        System.out.println("Nama Genre : " + namaGenre);
    }
}