package DesginPattern.StructralPattern.Facade.FacadeThanhToan;

public class iBuyingMaker {
    private static iBuyingMaker instance;
    private Product product;
    private Payment payment;
    private Invoice invoice;
    private PaymentOffine paymentOffine;
    private PaymentOnline paymentOnline;
    private iBuyingMaker(){
        product = new Product();
        payment = new Payment();
        paymentOffine = new PaymentOffine();
        paymentOnline = new PaymentOnline();
        invoice = new Invoice();
    }
    public static iBuyingMaker getInstance(){
        if (instance == null) {
            instance = new iBuyingMaker();
        }
        return instance;
    }
    public void paymentProduct(){
        product.payment();
    }
    

    void iBuying(){
        try {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void invoice() {
    }
}
