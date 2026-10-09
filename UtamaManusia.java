public class UtamaManusia {
    public static void main(String[] args) {
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();
        Manusia m3 = new Manusia();

        m1.bernafas();
        m1.makan();
        m2.bernafas();
        m2.makan();
        m3.makan();

        ((Dosen) m1).lembur();
        ((Mahasiswa) m2).tidur();
    }
}