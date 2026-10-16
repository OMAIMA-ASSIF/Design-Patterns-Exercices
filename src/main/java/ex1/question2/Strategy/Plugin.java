package ex1.question2.Strategy;

public class Plugin {
    private PluginStrategyPartie1 partie1Strategy;
    private PluginStrategyPartie2 partie2Strategy;

    public Plugin(PluginStrategyPartie1 partie1Strategy, PluginStrategyPartie2 partie2Strategy) {
        this.partie1Strategy = partie1Strategy;
        this.partie2Strategy = partie2Strategy;
    }

    public void setPartie1Strategy(PluginStrategyPartie1 partie1Strategy) {
        this.partie1Strategy = partie1Strategy;
    }

    public void setPartie2Strategy(PluginStrategyPartie2 partie2Strategy) {
        this.partie2Strategy = partie2Strategy;
    }

    public void effectuerOperation() {
        System.out.println("Démarrage du plugin :");

        if (partie1Strategy != null) {
            partie1Strategy.OperationStrategy1();
        }

        if (partie2Strategy != null) {
            partie2Strategy.OperationStrategy2();
        }

    }
}
