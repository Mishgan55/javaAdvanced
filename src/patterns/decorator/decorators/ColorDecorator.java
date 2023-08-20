package patterns.decorator.decorators;

import patterns.decorator.objects.Component;

public class ColorDecorator extends Decorator{
    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("draw color");
    }
}
