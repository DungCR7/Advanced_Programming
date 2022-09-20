package DesginPattern.StructralPattern.AdapterDemo;

public class TranslatorApdater implements Target{
    JapaneseAdaptee jp; //k đặt thì sẽ là null
    public TranslatorApdater(){

        jp  = new JapaneseAdaptee();
    }
    @Override
    public void sendMessage(String words) {
        System.out.printf("Vietnamese :" + words );
        String translatedWords = this.translateWords(words);
        jp.receiveMessage(translatedWords);

    }
    private String translateWords (String originWords){

        return "Konichiwa";
    }
}
