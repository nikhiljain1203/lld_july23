package Factory;

public class Fluter {
    public void setTheme() {

    }

    public void setRefreshRate() {

    }

    public UIFactory getUIFactory(SupportedPlatforms platform) {
        return UIFactoryCreator.getUIFactoryForPlatform(platform);
    }
}
