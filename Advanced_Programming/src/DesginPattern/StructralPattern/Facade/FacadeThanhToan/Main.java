package DesginPattern.StructralPattern.Facade.FacadeThanhToan;

public class Main {
    public static void main(String[] args) {
        iBuyingMaker pay = iBuyingMaker.getInstance();
        pay.invoice();
        pay.paymentProduct();

    }
}
