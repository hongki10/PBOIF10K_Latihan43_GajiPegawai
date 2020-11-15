import java.util.Scanner;

/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Gaji Pegawai
 */

public class PBOIF10K10119915Latihan43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GajiPegawai gaji = new GajiPegawai();
        gaji.setNama("Rizky Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dlm 4 No 72/66");
        gaji.setUangTunjangan(250000);
        gaji.setUangTransport(300000);
        gaji.setGajiPokok(4500000);
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok(), gaji.getGajiPokok());
        
    }
}