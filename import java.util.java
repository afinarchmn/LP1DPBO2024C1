import java.util.ArrayList;
import java.util.List;

class AnggotaDPR {
    private int id;
    private String nama;
    private String bidang;
    private String partai;

    public AnggotaDPR(int id, String nama, String bidang, String partai) {
        this.id = id;
        this.nama = nama;
        this.bidang = bidang;
        this.partai = partai;
    }

    // Getter methods

    // Setter methods

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Bidang: " + bidang + ", Partai: " + partai;
    }
}

public class Main {
    public static void main(String[] args) {
        List<AnggotaDPR> daftarAnggota = new ArrayList<>();

        // Menambah anggota
        daftarAnggota.add(new AnggotaDPR(1, "Nama1", "Bidang1", "Partai1"));
        daftarAnggota.add(new AnggotaDPR(2, "Nama2", "Bidang2", "Partai2"));

        // Menampilkan daftar anggota
        for (AnggotaDPR anggota : daftarAnggota) {
            System.out.println(anggota);
        }

        // Mengubah data anggota
        // Contoh: Mengubah data anggota dengan ID 1
        for (AnggotaDPR anggota : daftarAnggota) {
            if (anggota.getId() == 1) {
                anggota.setNama("NamaBaru");
                anggota.setBidang("BidangBaru");
                anggota.setPartai("PartaiBaru");
                break;
            }
        }

        // Menghapus anggota
        // Contoh: Menghapus anggota dengan ID 2
        daftarAnggota.removeIf(anggota -> anggota.getId() == 2);
    }
}
