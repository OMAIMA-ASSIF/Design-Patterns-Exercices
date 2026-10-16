package ex1.question4.Observer;

//Observable
public interface Joueur {
    void addObserver(ObjetJeu objetJeu);
    void removeObserver(ObjetJeu objetJeu);
    void notifyObservers();
}
