package core.basesyntax.models;

import core.basesyntax.interfaces.Calculable;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, Calculable {
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
