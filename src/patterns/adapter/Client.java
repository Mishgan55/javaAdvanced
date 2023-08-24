package patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("Java");

        PrinterAdapter printerAdapter=new PrinterAdapter();

        printerAdapter.print(list);
    }
}
