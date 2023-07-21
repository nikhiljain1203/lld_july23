package Factory;

public class UIFactoryCreator {
    public static UIFactory getUIFactoryForPlatform(SupportedPlatforms platform) {
        if(platform == SupportedPlatforms.ANDROID) {
            return new AndroidFactory();
        } else {
            return new IOSFactory();
        }
    }
}
