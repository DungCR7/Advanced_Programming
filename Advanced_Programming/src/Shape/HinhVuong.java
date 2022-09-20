package Shape;

public class HinhVuong extends HinhHoc{
    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    @Override
    public double chuVi() {
        return canh * 4;
    }

    @Override
    public double dienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return "Hinh Vuong: C = "  + chuVi() + " | S = " + dienTich() ;
    }
}
