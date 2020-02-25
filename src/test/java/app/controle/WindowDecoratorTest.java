package app.controle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import app.controle.window.HorizontalScrollBarDecorator;
import app.controle.window.IWindow;
import app.controle.window.SimpleWindow;
import app.controle.window.VerticalScrollBarDecorator;

public class WindowDecoratorTest {

    @Test
    public void testWindowDecoratorTest() {
        IWindow decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow(400, 500)));
        assertEquals("Janela Simples de altura 500 e largura 400, including vertical scrollbars, including horizontal scrollbars", decoratedWindow.getDescription());
    }
}