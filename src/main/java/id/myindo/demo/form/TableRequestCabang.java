package id.myindo.demo.form;

public class TableRequestCabang {
    private String namaBarang;
    private String jumlah;
    private String hargaSatuan;
    private String totalHarga;

    public TableRequestCabang() {
    }

    public TableRequestCabang(String namaBarang, String jumlah, String hargaSatuan, String totalHarga) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.totalHarga = totalHarga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(String hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public String getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    }

    @Override
    public String toString() {
        return "TableRequestCabang{" +
                "namaBarang='" + namaBarang + '\'' +
                ", jumlah='" + jumlah + '\'' +
                ", hargaSatuan='" + hargaSatuan + '\'' +
                ", totalHarga='" + totalHarga + '\'' +
                '}';
    }
}
