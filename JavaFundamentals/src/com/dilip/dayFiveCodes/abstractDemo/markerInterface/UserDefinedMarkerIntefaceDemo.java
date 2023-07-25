package com.dilip.dayFiveCodes.abstractDemo.markerInterface;

//Marker interface for characters with special abilities
interface SpecialAbilityCharacter {
	// No methods are declared in this marker interface
}

class Character {
	// Common attributes and behaviors for all characters
}

class Warrior extends Character {
	// Warrior-specific attributes and behaviors
}

class Mage extends Character implements SpecialAbilityCharacter {
	// Mage-specific attributes and behaviors with special abilities
}

class Archer extends Character {
	// Archer-specific attributes and behaviors
}

public class UserDefinedMarkerIntefaceDemo {

	public static void main(String[] args) {
		Character warrior = new Warrior();
		Character mage = new Mage();
		Character archer = new Archer();

		// Handle characters differently based on their abilities
		handleCharacterAbilities(warrior); // No special ability for warrior
		handleCharacterAbilities(mage); // Mage has special abilities
		handleCharacterAbilities(archer); // No special ability for archer
	}

	private static void handleCharacterAbilities(Character character) {
		if (character instanceof SpecialAbilityCharacter) {
			System.out.println("Character has special abilities.");
			// Perform actions specific to characters with special abilities
		} else {
			System.out.println("Character does not have special abilities.");
			// Perform actions for characters without special abilities
		}

	}

}
