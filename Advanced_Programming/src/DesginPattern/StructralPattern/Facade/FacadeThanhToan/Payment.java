package DesginPattern.StructralPattern.Facade.FacadeThanhToan;

public class Payment implements iBuying{
    @Override
    public void payment() {
        System.out.printf("Payment");
    }
}
