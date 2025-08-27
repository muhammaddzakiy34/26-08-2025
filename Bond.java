public class Bond {
    //properti 
    public String nama;
    public double saldo, sukuBunga;
    public int termin,sisaBulan;

    //contructor
    public Bond(String nama, Double saldo, int termin ){
        this.nama = nama;
        this.saldo = saldo;
        aturTerminDanBunga(termin); //otomatis atur bunga dan sisa bulan
}
    //Methot untuk mengatur termin dan suku bunga
    public void aturTerminDanBunga(int t){
        if (t >= 0 && t <= 12) sukuBunga = 0.005;
        else if(t >= 12 && t<=24) sukuBunga = 0.010;
        else if(t >= 24 && t<=36) sukuBunga = 0.015;
        else if(t >= 36 && t<=48) sukuBunga = 0.020;
        else if(t >= 48 && t<=60) sukuBunga = 0.025;
        else {
            System.out.println("Termin tidak valid");
            t = 0;
            sukuBunga = 0;
        }
        termin = t;
        sisaBulan = t;
    }

    //Method untuk menambah bunga tiap bulan
    public double dapatkanBunga(){
        if (sisaBulan > 0){
            saldo += saldo * sukuBunga / 12; //Bunga bulan
            sisaBulan--;
            System.out.println("saldo: Rp" + saldo);
            System.out.println("suku bunga: " +(sukuBunga * 100) + "% per tahun");
            System.out.println("Sisa bulan: " + sisaBulan);
            System.out.println("=========================");
        }else {
            System.out.println("Obligasi jatuh tempo");   
        }
        return saldo;
    }
}
