class App {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        anggota1.nama = "Alif Lakipadada";
        anggota1.noAnggota = 42030077;
        
        Ketua ketuapengurus = new Ketua();
        ketuapengurus.nama = "Kayla Annisa";
        ketuapengurus.noAnggota = 42030065;
        ketuapengurus.periode = "2020-2021";

        ketuaPanitia ketua_panitia = new ketuaPanitia();
        ketua_panitia.nama = "Winda Hidayat";
        ketua_panitia.noAnggota = 42030099;
        ketua_panitia.periodeKepengurusan = "2020-2021";
        
        System.out.print(anggota1.melihatJadwal());
        System.out.print("\n" + ketuapengurus.menyetujuiPekerjaan());
        System.out.print("\n" + ketua_panitia.melihatLaporan());
    }
}
