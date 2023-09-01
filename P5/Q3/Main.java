package P5.Q3;

public class Main {
    public static void main(String args[]) {
         
        if(args.length < 2) {
            System.out.println("Usage: java Main.java <name | [surname]> <pronounce>");
            System.exit(1);
        }
        String name = "";
        String pronounce = "";
        String surname = "";
        for (int i = 0; i < args.length; i++) {
            if (i == args.length - 1) {
                pronounce = args[i];
            } else {
                args[i] = args[i].toLowerCase();
                String s = args[i];
                if (args[i].startsWith("[")) {
                    s = s.replace("[", "");
                    s = s.replace("]", "");
                    s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
                    surname = s;
                } else {
                    s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
                }
                name += (name == "" ? "" : " ") + s;
            }
        }
        surname = Character.toUpperCase(surname.charAt(0)) + surname.substring(1);
        System.out.println("To: " + name);
        System.out.println("Wishing you a Merry Christmas, " + pronounce + " " + surname + ".");
    }
}
