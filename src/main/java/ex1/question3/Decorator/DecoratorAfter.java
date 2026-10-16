package ex1.question3.Decorator;

public class DecoratorAfter extends Decorator{

    public DecoratorAfter(Composant composant) {
        super(composant);
    }

    @Override
    public void traitement(){
        super.traitement();
        System.out.println("Apres Traitement : ");
    }
}
