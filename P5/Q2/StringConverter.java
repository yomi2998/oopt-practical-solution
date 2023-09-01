package P5.Q2;

public class StringConverter {
    public String convert(String str) {
        str = str.toUpperCase();
        str = str.replace("A", "x");
        str = str.replace("E", "x");
        str = str.replace("I", "x");
        str = str.replace("O", "x");
        str = str.replace("U", "x");
        return str;
    }
}
