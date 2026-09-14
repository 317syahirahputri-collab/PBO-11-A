public class MemberVIP extends Member {

    private double diskonDenda; // Contoh: 0.20 berarti diskon 20%
    private int poinReward;

    // Constructor
    public MemberVIP(String idMember, String nama, String email, double diskonDenda) {
        super(idMember, nama, email);
        this.diskonDenda = diskonDenda;
        this.poinReward = 0;
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

    // Method khusus VIP
    public void tambahPoin(int poin) {
        this.poinReward += poin;
        System.out.println(getNama() + " mendapatkan " + poin + " poin reward! Total poin: " + this.poinReward);
    }

    // Menampilkan informasi (Override dari class Member)
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Member   : " + getIdMember());
        System.out.println("Nama        : " + getNama());
        System.out.println("Email       : " + getEmail());
        System.out.println("Tipe Member : VIP");
        System.out.println("Diskon Denda: " + (diskonDenda * 100) + "%");
        System.out.println("Poin Reward : " + poinReward);
        tampilkanBukuDipinjam();
    }
}