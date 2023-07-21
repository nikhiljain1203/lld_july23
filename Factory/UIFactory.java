package Factory;

import Factory.Components.Button;
import Factory.Components.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
}
