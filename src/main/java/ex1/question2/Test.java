package question2.Strategy;

import ex1.question2.Strategy.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Configuration 1 : Partie1 VA + Partie2 VA ===");
        Plugin plugin = new Plugin(
                new StrategyPartie1ImplVA(),
                new StrategyPartie2ImplVA()
        );
        plugin.effectuerOperation();

        // 2. Changement dynamique de la Partie 1 vers Version B
        System.out.println("Configuration 2 : Partie1 VB + Partie2 VA ===");
        plugin.setPartie1Strategy(new StrategyPartie1ImplVB());
        plugin.effectuerOperation();

        // 3. Changement dynamique de la Partie 2 vers Version B puis Version C
        System.out.println("Configuration 3 : Partie1 VB + Partie2 VB ===");
        plugin.setPartie2Strategy(new StrategyPartie2ImplVB());
        plugin.effectuerOperation();

        System.out.println("Configuration 4 : Partie1 VB + Partie2 VC ===");
        plugin.setPartie2Strategy(new StrategyPartie2ImplVC());
        plugin.effectuerOperation();
    }
}