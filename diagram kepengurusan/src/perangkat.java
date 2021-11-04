class Perangkat extends Anggota{
    String periode;
    int tanggalMenjabat;
    int tanggalSelesai;

    String membuatLaporan () {
        return super.nama + "membuat laporan";
    }
    String menghapusLaporan () {
        return super.nama + "menghapus laporan";
    }
}
