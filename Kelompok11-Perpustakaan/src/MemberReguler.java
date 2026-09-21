public class MemberReguler extends Member {

    // Constructor
    public MemberReguler(String idMember, String nama, String email) {
        super(idMember, nama, email);
    }

    // Implementasi wajib dari method abstrak di Member
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Member   : " + getIdMember());
        System.out.println("Nama        : " + getNama());
        System.out.println("Email       : " + getEmail());
        System.out.println("Tipe Member : Reguler");
        tampilkanBukuDipinjam();
    }
}
