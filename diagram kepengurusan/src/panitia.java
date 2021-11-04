 class Panitia extends Anggota{
    String namaKegiatan;
    String periodeKepengurusan;
   
    @Override
   String melihatLaporan() {
        return super.nama + " melihat laporan acara kegiatan panitia";
   }
    @Override
    String melihatJadwal() {
        return super.nama + " melihat jadwal kegiatan panitia";
    }
    @Override
    String melihatAnggaran() {
        return super.nama +  " melihat anggaran kegiatan panitia";
    }
    
}
