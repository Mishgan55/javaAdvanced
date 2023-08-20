package patterns.decorator;

import patterns.decorator.decorators.BorderDecorator;
import patterns.decorator.objects.Component;
import patterns.decorator.objects.TextView;
import patterns.decorator.objects.Window;

public class Test {


    public static void main(String[] args) {
        Component component;
        boolean boarder = true;
        if (boarder){

            component =new Window();
        }else {
            component =new BorderDecorator(new TextView());

        }

        component.draw();
    }
}
