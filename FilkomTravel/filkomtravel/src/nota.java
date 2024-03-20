class nota extends User{
    private double totalBiaya;
    private boolean member;
    public void cetakNotaMember(double hargaPaket) {
        double totalBiayaSetelahDiskon = (totalBiaya + hargaPaket) * 0.8;
        System.out.println("=".repeat(52));
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Lama Perjalanan: " + durasiSewa + " hari");
        System.out.printf("Harga: Rp %.0f\n", hargaPaket);
        System.out.printf("Total Biaya (Member): Rp %.0f\n", totalBiayaSetelahDiskon);
        System.out.println("=".repeat(52));
    }
    public void cetakNotaNonMember(double hargaPaket) {
        double totalBiayaNonMember = totalBiaya + hargaPaket;
        System.out.println("=".repeat(52));
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Lama Perjalanan: " + durasiSewa + " hari");
        System.out.printf("Harga: Rp %.0f\n", hargaPaket);
        System.out.printf("Total Biaya (Non Member): Rp %.0f\n", totalBiayaNonMember);
        System.out.println("=".repeat(52));
    }


//    public void setTotalBiaya(double totalBiaya) {
//        this.totalBiaya = totalBiaya;
//    }
//
//    public void setMember(boolean member) {
//        this.member = member;
    }
