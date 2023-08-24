package patterns.adapter;

import java.util.List;

public class PrinterAdapter implements ListPrinter{

    Printer printer =new Printer();
    @Override
    public void print(List<String> list) {
        for (String s : list) {
            printer.print(s);
        }
    }
}
