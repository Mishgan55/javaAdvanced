package patterns.decorator.objects;

public class Window implements Component{
    @Override
    public void draw() {
        System.out.println("window");
    }
}
