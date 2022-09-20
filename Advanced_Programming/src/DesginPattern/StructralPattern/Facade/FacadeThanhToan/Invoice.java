package DesginPattern.StructralPattern.Facade.FacadeThanhToan;

public class Invoice implements iBuying{
    @Override
    public void payment() {
        System.out.printf("Invoice");
    }
}
