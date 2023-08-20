package patterns.decorator.decorators;

import patterns.decorator.objects.Component;

public class BorderDecorator extends Decorator{
    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("draw border");
    }
}
