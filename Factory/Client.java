package Factory;

import Factory.Components.Button;

public class Client {
    public static void main(String[] args) {
        Fluter fluter = new Fluter();
        UIFactory uiFactory = fluter
                .getUIFactory(SupportedPlatforms.ANDROID);


        Button button = uiFactory.createButton();
        button.changeColor();
    }
}
