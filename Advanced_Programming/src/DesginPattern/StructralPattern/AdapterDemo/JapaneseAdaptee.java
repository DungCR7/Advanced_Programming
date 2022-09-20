package DesginPattern.StructralPattern.AdapterDemo;

public class JapaneseAdaptee {
    public void receiveMessage (String translatedWords){
        System.out.println("\nJapanese :" +translatedWords);
        System.out.println("Finished!");
    }
}
