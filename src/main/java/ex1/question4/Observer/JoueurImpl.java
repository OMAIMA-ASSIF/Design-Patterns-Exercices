package ex1.question4.Observer;


import java.util.ArrayList;
import java.util.List;

//Observable Impl
public class JoueurImpl implements Joueur{
    private int score;
    private List<ObjetJeu> observateurs = new ArrayList<>();
    @Override
    public void addObserver(ObjetJeu objetJeu) {
        observateurs.add(objetJeu);
    }

    @Override
    public void removeObserver(ObjetJeu objetJeu) {
        observateurs.remove(objetJeu);
    }

    @Override
    public void notifyObservers() {
        for(ObjetJeu objetJeu : observateurs){
            objetJeu.update(this);
        }
    }

    public void setScore(int score){
        this.score=score;
        notifyObservers();
    }

    public int getScore(){
        return score;
    }


}
