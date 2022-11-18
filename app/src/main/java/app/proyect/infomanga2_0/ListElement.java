package app.proyect.infomanga2_0;

public class ListElement {
    public String color;
    public String name;
    public String autor;

    public ListElement(String color, String name, String autor) {
        this.color = color;
        this.name = name;
        this.autor = autor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
