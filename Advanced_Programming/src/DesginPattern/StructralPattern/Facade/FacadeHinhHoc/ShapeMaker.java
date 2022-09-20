package DesginPattern.StructralPattern.Facade.FacadeHinhHoc;

public class ShapeMaker {
    private static ShapeMaker instance;
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    private ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public static ShapeMaker getInstance(){
        if (instance == null){
            instance = new ShapeMaker();
        }
        return instance;
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    public void veHinhTru(){
        circle.draw(); //day tren
        rectangle.draw(); //than
        circle.draw(); //day duoi
    }
}
