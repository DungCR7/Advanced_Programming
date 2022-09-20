package Shape;

public class HinhChuNhat extends HinhHoc{
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public double dienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat: C = "  + chuVi() + " | S = " + dienTich() ;
    }
}
