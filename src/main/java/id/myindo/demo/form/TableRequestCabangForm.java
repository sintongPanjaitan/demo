package id.myindo.demo.form;

public class TableRequestCabangForm {

    private String tableBarang;

    public TableRequestCabangForm() {
    }

    public TableRequestCabangForm(String tableBarang) {
        this.tableBarang = tableBarang;
    }

    public String getTableBarang() {
        return tableBarang;
    }

    public void setTableBarang(String tableBarang) {
        this.tableBarang = tableBarang;
    }

    @Override
    public String toString() {
        return "TableRequestCabangForm{" +
                "tableBarang='" + tableBarang + '\'' +
                '}';
    }
}
