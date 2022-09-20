package DesginPattern.StructralPattern.Facade.FacadeThanhToan;

public class Product implements iBuying{
    @Override
    public void payment() {
        System.out.printf("Check Product");
    }
}
