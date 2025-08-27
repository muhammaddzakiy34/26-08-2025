public class TesObligasi {
    public static void main(String[] args) {
        // Buat obligasi baru
        Bond bond = new Bond("Andi", 1000000.0, 24);
        // saldo awal 1.000.000, termin 24 bulan

        // simulasi 26 bulan
        for (int i = 0; i < 26; i++) {
            System.out.println("Bulan ke-" + (i+1));
            double bunga = bond.dapatkanBunga();
            System.out.println("Bunga bulan ini: Rp" + bunga);
   
        }
    }   
}
