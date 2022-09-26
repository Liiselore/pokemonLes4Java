package com.sandbox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 1, 10, true, true, true, false);
        GrassPokemon ivysar = new GrassPokemon("Ivysar", 2, 16, true, true, true, true);
        GrassPokemon venusar = new GrassPokemon("Venusar", 3, 36, false, true, true, true);
        FirePokemon charmander = new FirePokemon("Charmander", 4, 10, true, true, false, false);
        FirePokemon charmeleon = new FirePokemon("Charmeleon", 5, 16, true, true, true, false);
        FirePokemon charizard = new FirePokemon("Charizard", 6, 36, false, true, true, true);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 7, 10, true, true, false, false );
        WaterPokemon wartortle = new WaterPokemon("Wartortle", 8, 16, true, true, true, false);
        WaterPokemon blastoise = new WaterPokemon("Blastoise", 9, 36, false, true, true, true);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 25, 16, false, true, true, false);

        bulbasaur.setLevel(36);
        bulbasaur.levelUp();
        bulbasaur.eat();


        System.out.println("Hello there!");
        System.out.println("Welcome to the world of POKéMON!");
        System.out.println("My name is Oak!");
        System.out.println("People call me the POKéMON PROF!");
        System.out.println("This world is inhabited by creatures called POKéMON!");
        System.out.println("For some people, POKéMON are pets. Others use them for fights.");
        System.out.println("Myself...");
        System.out.println("I study POKéMON as a profession.");
        System.out.println("First, what is your name?");

        Scanner input = new Scanner(System.in);
        String yourName = input.nextLine();

        System.out.println("Right! So your name is " + yourName + "!");
        System.out.println("This is my grandson. He's been your rival since you were a baby.");
        System.out.println("...Erm, what is his name again?");

        String rivalName = input.nextLine();

        System.out.println("That's right! I remember now! His name is " + rivalName + "!");
        System.out.println(yourName + "!");
        System.out.println("Your very own POKéMON legend is about to unfold!");
        System.out.println("A world of dreams and adventures with POKéMON awaits! Let's go!");
        System.out.println("Later in the professor Oak...");
        System.out.println("Here " + yourName + "!");
        System.out.println("There are 3 POKéMON here!");
        System.out.println("HAHA!");
        System.out.println("They are inside the POKé BALLs!");
        System.out.println("When I was young, I was a serious POKéMON trainer!");
        System.out.println("In my old age, I have only 3 left, but you can have one! Choose!");















    }
}
