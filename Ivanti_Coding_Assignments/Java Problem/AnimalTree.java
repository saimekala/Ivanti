package com.ivanti ;

// This is the Java Problem-2

 abstract class Animal {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
			
}

	interface Jump
	{
		void jumpChar();
	}
	
	interface Bark
	{
		void barkChar();
	}
	
	interface Croak
	{
		void croakChar();
	}
	
	
	class Frog extends AnimalTree implements Croak, Jump
	{
		String frogPoisonLevel;
		
		
		public void jumpChar()
		{
			System.out.println(" I Jump! ");
		}
		
		public void croakChar()
		{
			System.out.println(" I Croak! ");
		}
				
		public String getFrogPoisonLevel() {
			return frogPoisonLevel;
		}

		public void setFrogPoisonLevel(String frogPoisonLevel) {
			this.frogPoisonLevel = frogPoisonLevel;
		}

		
	}
	
	class Dog extends AnimalTree implements Bark, Jump
	{
		String dogFurColor;
		
		
		public String getDogFurColor() {
			return dogFurColor;
		}

		public void setDogFurColor(String dogFurColor) {
			this.dogFurColor = dogFurColor;
		}

		public void jumpChar()
		{
			System.out.println(" I Jump! ");
		}
				
		public void barkChar()
		{
			System.out.println(" I Bark! ");
		}
	}
	
	public class AnimalTree
	{
		public static void main(String args[])
		{
			
			Dog dog = new Dog();
			dog.barkChar();
			dog.jumpChar();
			dog.setDogFurColor("Brown");
			System.out.println(dog.getDogFurColor());
			
			Frog frog = new Frog();
			frog.jumpChar();
			frog.croakChar();
			frog.setFrogPoisonLevel("30p");
			System.out.println(frog.getFrogPoisonLevel());
	
		}
	}
	
	