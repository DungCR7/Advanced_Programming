package TinhHinhHoc.Tinh_Cv_Dt;

public class Rectangle extends Geometry {
    private double chieuDai;
    private double chieuRong;

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void setChieuDai(double chieuDai) {

        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {

        this.chieuRong = chieuRong;
    }

    @Override
    public double chuVi() {

        return (chieuDai+chieuRong)*2;
    }

    @Override
    public double dienTich() {

        return chieuDai*chieuRong;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Perimeter=" + chuVi() +
                ", Area=" + dienTich() +
                '}';
    }
}
