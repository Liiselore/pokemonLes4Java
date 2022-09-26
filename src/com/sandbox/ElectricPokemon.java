package com.sandbox;

public class ElectricPokemon extends Pokemon{
    private boolean knowsThunderWave;
    private boolean knowsElectroBall;
    private boolean knowsSpark;

    public ElectricPokemon(String name, int indexNumber, int level, boolean canEvolve, boolean knowsThunderWave, boolean knowsElectroBall, boolean knowsSpark) {
        super(name, indexNumber, level, canEvolve);
        this.knowsThunderWave = knowsThunderWave;
        this.knowsElectroBall = knowsElectroBall;
        this.knowsSpark = knowsSpark;
    }


    @Override
    public void eat() {
        System.out.println("Your electric pokemon ate a Passho Berry and takes only half damage from a Water-type move!");
    }

    @Override
    public void levelUp() {
        System.out.println("Your electric pokemon is now level " + getLevel() + ". You can't evolve your pokemon.");
    }
}
