class AnggotaDPR {
    public $id;
    public $nama;
    public $bidang;
    public $partai;

    public function __construct($id, $nama, $bidang, $partai) {
        $this->id = $id;
        $this->nama = $nama;
        $this->bidang = $bidang;
        $this->partai = $partai;
    }

    public function __toString() {
        return "ID: $this->id, Nama: $this->nama, Bidang: $this->bidang, Partai: $this->partai";
    }
}

// Daftar anggota DPR
$daftarAnggota = [];

// Menambah anggota
array_push($daftarAnggota, new AnggotaDPR(1, "Nama1", "Bidang1", "Partai1"));
array_push($daftarAnggota, new AnggotaDPR(2, "Nama2", "Bidang2", "Partai2"));

// Menampilkan daftar anggota
foreach ($daftarAnggota as $anggota) {
    echo $anggota . "\n";
}

// Mengubah data anggota
// Contoh: Mengubah data anggota dengan ID 1
foreach ($daftarAnggota as $anggota) {
    if ($anggota->id == 1) {
        $anggota->nama = "NamaBaru";
        $anggota->bidang = "BidangBaru";
        $anggota->partai = "PartaiBaru";
        break;
    }
}

// Menghapus anggota
// Contoh: Menghapus anggota dengan ID 2
$daftarAnggota = array_filter($daftarAnggota, function($anggota) {
    return $anggota->id != 2;
});
