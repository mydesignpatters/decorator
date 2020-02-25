package app.controle.principal;

import app.controle.window.IWindow;
import app.controle.window.SimpleWindow;
import app.controle.window.VerticalScrollBarDecorator;
import app.controle.window.HorizontalScrollBarDecorator;

/**
 * the decorator pattern is a design pattern that allows behavior to be added to an individual object, 
 * dynamically, without affecting the behavior of other objects from the same class.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Usando o padrao Decorator");

        // Create a decorated Window with horizontal and vertical scrollbars
        IWindow decoratedWindowHorizontalAndVerticalBar = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow(400, 500)));
        // Print the Window's description
        System.out.println(decoratedWindowHorizontalAndVerticalBar.getDescription());
    }
}