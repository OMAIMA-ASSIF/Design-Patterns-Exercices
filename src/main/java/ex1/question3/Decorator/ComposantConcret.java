package ex1.question3.Decorator;

public class ComposantConcret implements Composant{
    @Override
    public void traitement() {
        System.out.println("Traitement principal du composant.");
    }
}
