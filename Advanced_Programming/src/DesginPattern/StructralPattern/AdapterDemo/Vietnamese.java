package DesginPattern.StructralPattern.AdapterDemo;

public class Vietnamese {
    public static void main(String[] args) {
        Target vietnam = new TranslatorApdater();
        vietnam.sendMessage("Xin chao");

    }
}
