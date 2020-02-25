package app.controle.window;

public abstract class WindowDecorator implements IWindow {
    private final IWindow windowToBeDecorated; // the Window being decorated

    public WindowDecorator(IWindow windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    @Override
    public void draw() {
        windowToBeDecorated.draw(); // Delegation
    }

    @Override
    public String getDescription() {
        return windowToBeDecorated.getDescription(); // Delegation
    }
}