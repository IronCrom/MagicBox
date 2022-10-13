public class Main {
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox<>(3);
        magicBox.add(1);
        magicBox.add(2);
        magicBox.add(3);
        System.out.println(magicBox.pick());

        MagicBox magicBox1 = new MagicBox<>(4);
        magicBox1.add("Один");
        magicBox1.add("Два");
        magicBox1.add("Три");
        magicBox1.add("Четыре");

        System.out.println(magicBox1.pick());

    }
}
