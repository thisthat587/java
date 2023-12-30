public class StringInJava {

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
    }

    public static void main(String args[]) {
        clearConsole();
        String str = "this is java program";
        char chars[] = new char[10];
        str.getChars(0, 5, chars, 2);
        System.out.println(chars);
    }
}
