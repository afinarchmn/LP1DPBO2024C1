class AnggotaDPR:
    def __init__(self, id, nama, bidang, partai):
        self.id = id
        self.nama = nama
        self.bidang = bidang
        self.partai = partai

    def __str__(self):
        return f"ID: {self.id}, Nama: {self.nama}, Bidang: {self.bidang}, Partai: {self.partai}"

# Daftar anggota DPR
daftar_anggota = []

# Menambah anggota
daftar_anggota.append(AnggotaDPR(1, "Nama1", "Bidang1", "Partai1"))
daftar_anggota.append(AnggotaDPR(2, "Nama2", "Bidang2", "Partai2"))

# Menampilkan daftar anggota
for anggota in daftar_anggota:
    print(anggota)

# Mengubah data anggota
# Contoh: Mengubah data anggota dengan ID 1
for anggota in daftar_anggota:
    if anggota.id == 1:
        anggota.nama = "NamaBaru"
        anggota.bidang = "BidangBaru"
        anggota.partai = "PartaiBaru"
        break


daftar_anggota = [anggota for anggota in daftar_anggota if anggota.id != 2]
