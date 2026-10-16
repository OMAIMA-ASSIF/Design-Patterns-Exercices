package ex1.question1.Composite;

import java.util.ArrayList;
import java.util.List;

public class GroupeFigures extends Figure{
    private List<Figure> content = new ArrayList<>();
    public GroupeFigures(String name) {
        super(name);
    }

    // Gestion des enfants
    public void ajouter(Figure figure) {
        content.add(figure);
    }

    public void retirer(Figure figure) {
        content.remove(figure);
    }

    public List<Figure> getContent() {
        return content;
    }

    @Override
    public void print() {
        System.out.println("=== Groupe [" + name + "] ===");
        for (Figure figure : content) {
            figure.print();
        }
    }
}
