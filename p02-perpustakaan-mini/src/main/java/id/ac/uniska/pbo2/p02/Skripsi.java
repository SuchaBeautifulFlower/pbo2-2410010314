package id.ac.uniska.pbo2.p02;

/**
 * Skripsi hanya dibaca di tempat dan tidak dapat dipinjam.
 */
public class Skripsi extends Koleksi {
    private final String penulis;
    private final String programStudi;

    public Skripsi(String kode, String judul, int tahunTerbit, String penulis, String programStudi) {
        super(kode, judul, tahunTerbit);
        this.penulis = penulis;
        this.programStudi = programStudi;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    @Override
    public int batasHariPinjam() {
        return 0;
    }

    @Override
    public boolean pinjam() {
        return false; // Skripsi tidak dapat dipinjam
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
        return 0L; // Denda skripsi selalu 0
    }

    @Override
    public String keterangan() {
        return "Skripsi karya " + penulis + " (" + programStudi + ")";
    }
}