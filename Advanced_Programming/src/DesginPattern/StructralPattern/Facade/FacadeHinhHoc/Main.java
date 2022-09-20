package DesginPattern.StructralPattern.Facade.FacadeHinhHoc;

public class Main   {
    public static void main(String[] args) {
        ShapeMaker artist = ShapeMaker.getInstance();
        artist.drawCircle();
        artist.drawRectangle();
        artist.drawSquare();
        artist.veHinhTru();
    }
}
