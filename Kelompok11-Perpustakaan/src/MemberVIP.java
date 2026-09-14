public class MemberVIP extends Member {

    // Atribut tambahan khusus member VIP
    private double diskonDenda; // Contoh: 0.20 berarti diskon 20%
    private int poinReward;

    // Constructor
    public MemberVIP(String idMember, String nama, String email, double diskonDenda) {
        // Memanggil constructor class induk (Member)
        super(idMember, nama, email);
        this.diskonDenda = diskonDenda;
        this.poinReward = 0; // Poin awal 0
    }

    // Getter & Setter
    public double getDiskonDenda() {
        return diskonDenda;
    }

    public void setDiskonDenda(double diskonDenda) {
        this.diskonDenda = diskonDenda;
    }

    public int getPoinReward() {
        return poinReward;
    }

    // Method khusus VIP: menambah poin setiap transaksi/aktivitas
    public void tambahPoin(int poin) {
        this.poinReward += poin;
        System.out.println(getNama() + " mendapatkan " + poin + " poin reward! Total poin: " + this.poinReward);
    }

    // Menampilkan informasi (Override dari method tampilkanInfo milik Member)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Menampilkan ID, Nama, Email, & Buku yang dipinjam dari class induk
        System.out.println("Tipe Member : VIP");
        System.out.println("Diskon Denda: " + (diskonDenda * 100) + "%");
        System.out.println("Poin Reward : " + poinReward);
    }
}