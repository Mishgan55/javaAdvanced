package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson2 {
    public static void main(String[] args) {
        String s="boleh di kirim ke email saya ekoprasetyo.crb@outlook.com tks...\n" +
                "boleh minta kirim ke db.maulana@gmail.com. \n" +
                "dee.wien@yahoo.com. .\n" +
                "deninainggolan@yahoo.co.id Senior Quantity Surveyor\n" +
                "Fajar.rohita@hotmail.com, terimakasih bu Cindy Hartanto\n" +
                "firmansyah1404@gmail.com saya mau dong bu cindy\n" +
                "fransiscajw@gmail.com \n" +
                "Hi Cindy ...pls share the Salary guide to donny_tri_wardono@yahoo.co.id thank a";

        Pattern pattern=Pattern.compile("[A-Za-z.0-9]+@(gmail|yahoo|hotmail|outlook)\\.(com|co\\.id)");
        Matcher matcher=pattern.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
