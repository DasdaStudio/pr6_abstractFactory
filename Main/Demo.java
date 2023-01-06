package Main;

import Race.HumanFactory;
import Race.RaceFactory;
import Classes.ClassFactory;

public class Demo {

    public static void main(String[] args){
        Character character = new Character("Dasda", ClassFactory.getClass("Druid"), RaceFactory.getRace(new HumanFactory()));

        character.setAttributes(Stats.generate());
        character.addRaceBonuses();
        character.printSheet();

    }
}
