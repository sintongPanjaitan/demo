package id.myindo.demo.form;

public class RequestCabang {
    private String namaBarang;
    private String jumlah;
    private String hargaSatuan;
    private String totalHarga;
    private String anggaran;


    public RequestCabang() {
    }

    public RequestCabang(String namaBarang, String jumlah, String hargaSatuan, String totalHarga, String anggaran) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.totalHarga = totalHarga;
        this.anggaran = anggaran;
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

    public String getAnggaran() {
        return anggaran;
    }

    public void setAnggaran(String anggaran) {
        this.anggaran = anggaran;
    }

    @Override
    public String
    toString() {
        return "RequestCabang{" +
                "namaBarang='" + namaBarang + '\'' +
                ", jumlah='" + jumlah + '\'' +
                ", hargaSatuan='" + hargaSatuan + '\'' +
                ", totalHarga='" + totalHarga + '\'' +
                ", anggaran='" + anggaran + '\'' +
                '}';
    }
}
