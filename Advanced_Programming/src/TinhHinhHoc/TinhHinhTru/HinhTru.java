package TinhHinhHoc.TinhHinhTru;

public class HinhTru extends HinhHoc {
    private final HinhTron canhDay;
    private double chieuCao;

    public HinhTru(HinhTron canhDay, double chieuCao) {
        this.canhDay = canhDay;
        this.chieuCao = chieuCao;
    }


    @Override
    public double tinhChuVi() {
        return 0;
    }

    @Override
    public double tinhDienTich() {
        return 0;
    }
}
