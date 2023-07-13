package regexp;

public class lesson1 {
    /*  \\d- одна цифра
        \\w- любая буква
    *    * - 1 или более
    *    + - 0 или более
    *    ? - выбираем из множества
    *    (-|\\+) - множество значений
    *    [a-zA-Z]- все английские буквы
    *    [0-9]  - все возможные цифры
    *    ^  -   не равно
    *    .  -  любой символ
    *    {2}  - до 2 символов   \\d{2}
    *    {2,} - 2 или более
    *    {2,4}- от 2 до 4 символов
    *
    *
    * */



    public static void main(String[] args) {
    String s="1234123";
    String s1="+21343124";
    String s2="-21341234";
        System.out.println(s.matches("(-|\\+)?\\d*"));

        String b = "assaSdfaFDSdDF3dew43dsf5443132";

        System.out.println(b.matches("[a-zA-z43]+\\d*"));


        String url="http://www.google.com";

        System.out.println(url.matches("http://www\\..+\\.(com|pl)"));


        String c="1234";

        System.out.println(c.matches("\\d{2,5}"));
    }
}
