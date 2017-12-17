package com.udacity.jokes;

import java.util.Random;

public class JokeFactory {
	
	int nextIndex = 0;
	String[] jokes = {"What breed of dog tells off-color jokes? A smutt.",
			"Did you hear that Santa knows karate?\n" + "\n" + "He has a black belt.\n",
			"“I would like vitamins for my son,” a mother said."
					+ " “Vitamin  A, B or C?” the pharmacist asked. “It doesn’t matter,”" +
					" the mother replied. “He can’t read yet.",
			"Q. When is a baseball player like a spider?\n" +
					"A. When he catches a fly!"," Anton, do you think I’m a bad mother?\n" +
			"\n" +
			"My name is Paul." ,"\n" +
			" “My wife suffers from a drinking problem.”\n" +
			"-\n" +
			"“Oh is she an alcoholic?”\n" +
			"-\n" +
			"“No, I am, but she’s the one who suffers.”\n" ,"I managed to lose my rifle when I was" +
			" in the army. I had to pay $855 to cover the loss.\n" +
			" \n" +
			"I’m starting to understand why a Navy captain always goes down with his ship." ,
			"Coco Chanel once said that you should put perfume on places where you want to be " +
					"kissed by a man. But hell does that burn!"};

	public String getJoke() {
		return jokes[new Random().nextInt(jokes.length)];
	}
	
	
}
