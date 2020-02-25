package app.controle.window;

public class SimpleWindow implements IWindow{
    public int width;
    public int height;

    public SimpleWindow(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(int width){
        return(width);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        String msg="";
        System.out.println(msg);
    }

    @Override
    public String getDescription() {
        return "Janela Simples de altura " + this.height + " e largura " + this.width;
    }
    
}