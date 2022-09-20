package TinhHinhHoc.Tinh_Cv_Dt;

public class Square extends Geometry {
    private double canh;

    public Square(double canh) {

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
        return "Square{" +
                "Perimeter=" + chuVi() +
                ", Area=" + dienTich() +
                '}';
    }
}
