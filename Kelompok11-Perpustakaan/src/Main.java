public class Main {

    public static void main(String[] args) {

        // ==========================================
        // MEMBUAT OBJEK GENRE
        // ==========================================

        GenreBuku fiksi = new GenreBuku(
            "G01",
            "Fiksi"
        );

        GenreBuku teknologi = new GenreBuku(
            "G02",
            "Teknologi"
        );

        GenreBuku sejarah = new GenreBuku(
            "G03",
            "Sejarah"
        );


        // ==========================================
        // MEMBUAT OBJEK BUKU
        // ==========================================

        Buku buku1 = new Buku(
            "B001",
            "Laskar Pelangi",
            "Andrea Hirata",
            2005,
            fiksi
        );

        Buku buku2 = new Buku(
            "B002",
            "Belajar Java",
            "Budi Santoso",
            2024,
            teknologi
        );

        Buku buku3 = new Buku(
            "B003",
            "Sejarah Indonesia",
            "Ahmad Wijaya",
            2023,
            sejarah
        );


        // ==========================================
        // MEMBUAT OBJEK MEMBER
        // ==========================================

        MemberReguler member1 = new MemberReguler(
            "M001",
            "Syahirah",
            "syahirah@gmail.com"
        );


        // ==========================================
        // MENAMPILKAN DATA BUKU
        // ==========================================

        System.out.println("=================================");
        System.out.println("       DATA BUKU PERPUSTAKAAN");
        System.out.println("=================================");

        buku1.tampilkanInfo();

        System.out.println("---------------------------------");

        buku2.tampilkanInfo();

        System.out.println("---------------------------------");

        buku3.tampilkanInfo();


        // ==========================================
        // MENAMPILKAN DATA MEMBER
        // ==========================================

        System.out.println("\n=================================");
        System.out.println("          DATA MEMBER");
        System.out.println("=================================");

        member1.tampilkanInfo();


        // ==========================================
        // PROSES PEMINJAMAN
        // ==========================================

        System.out.println("\n=================================");
        System.out.println("          PEMINJAMAN BUKU");
        System.out.println("=================================");

        member1.pinjamBuku(buku1);
        member1.pinjamBuku(buku2);


        // ==========================================
        // MENAMPILKAN DATA MEMBER SETELAH MEMINJAM
        // ==========================================

        System.out.println("\n=================================");
        System.out.println("   DATA MEMBER SETELAH MEMINJAM");
        System.out.println("=================================");

        member1.tampilkanInfo();


        // ==========================================
        // MENAMPILKAN STATUS BUKU
        // ==========================================

        System.out.println("\n=================================");
        System.out.println("       STATUS BUKU");
        System.out.println("=================================");

        buku1.tampilkanInfo();

        System.out.println("---------------------------------");

        buku2.tampilkanInfo();


        // ==========================================
        // PROSES PENGEMBALIAN
        // ==========================================

        System.out.println("\n=================================");
        System.out.println("        PENGEMBALIAN BUKU");
        System.out.println("=================================");

        member1.kembalikanBuku(buku1);


        // ==========================================
        // DATA AKHIR MEMBER
        // ==========================================

        System.out.println("\n=================================");
        System.out.println("       DATA AKHIR MEMBER");
        System.out.println("=================================");

        member1.tampilkanInfo();

        // ==========================================
        // PENGUJIAN INHERITANCE (MEMBER VIP)
        // ==========================================

        System.out.println("\n=================================");
        System.out.println("    PENGUJIAN MEMBER VIP (INHERITANCE)");
        System.out.println("=================================");

        
        MemberVIP memberVIP1 = new MemberVIP(
            "VIP001",
            "Bunga",
            "bunga@gmail.com",
            0.20
        );

        
        memberVIP1.tampilkanInfo();

        System.out.println("---------------------------------");

        memberVIP1.pinjamBuku(buku3);

        memberVIP1.tambahPoin(50);

        System.out.println("---------------------------------");

        System.out.println("Data Member VIP setelah transaksi:");
        memberVIP1.tampilkanInfo();
        

        // ==========================================
        // (Abstract Class Member + Interface Tampilkan/Peminjam)
        // ==========================================

        System.out.println("\n=================================");
        System.out.println("    DEMONSTRASI POLIMORFISME");
        System.out.println("=================================");

        Member[] daftarMember = { member1, memberVIP1 };

        for (Member m : daftarMember) {
            m.tampilkanInfo();
            System.out.println("---------------------------------");
        }
    }
}