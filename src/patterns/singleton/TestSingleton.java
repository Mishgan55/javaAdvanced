package patterns.singleton;

public class TestSingleton {
    private static final TestSingleton instance=new TestSingleton();

    private TestSingleton() {
    }
    public static TestSingleton getInstance(){
        return instance;
    }

    public void print(){
        System.out.println("Testing singleton pattern");
    }
}
