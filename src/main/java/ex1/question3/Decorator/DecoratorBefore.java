package ex1.question3.Decorator;

public class DecoratorBefore extends Decorator{

    public DecoratorBefore(Composant composant) {
        super(composant);
    }

    @Override
    public void traitement(){
        System.out.println("Avant Traitement : ");
        super.traitement();
    }
}
