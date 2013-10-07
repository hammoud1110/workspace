package edu.bonn.jbc.exceptions.task7;

public class Singer {
	public static void main(String[] args) {
		((NeedToFindBeer) (new Drinkers())).pointAtBeer(new WallOfBeer());
	}
}

interface NeedToFindBeer {
	void pointAtBeer(WallOfBeer wob);
}

class Drinkers extends Thread implements NeedToFindBeer {
	static final int drinkRate = 2;
	WallOfBeer ourBeer;

	public void run() {
		while (ourBeer.takeOne() > 0) {
			try {
				Thread.sleep(drinkRate * 1000);
			} catch (InterruptedException ignore) {
			}
		}
	}

	public void pointAtBeer(WallOfBeer wob) {
		ourBeer = wob;
		this.start();
	}
}

interface Countable {
	int howMany();
}

class WallOfBeer implements Countable {
	static final int full = 99;
	int count = 0;
	WallWatcher ww;
	{
		ww = new Narrator();
		putSome(full);
	}

	void putSome(int some) {
		count += some;
		if (ww != null) {
			ww.wallEvent(this);
		}
	}

	int takeOne() {
		count--;
		if (ww != null) {
			ww.wallEvent(this);
		}
		return count;
	}

	public int howMany() {
		return count;
	}

}

interface WallWatcher {
	void wallEvent(Countable wob);
}

class Narrator implements WallWatcher {
	static final int singspeed = 500;

	public void wallEvent(Countable wob) {
		int b = wob.howMany();
		try {
			System.out.print(bob(b, true) + onwall + ", ");
			Thread.sleep(singspeed);
			System.out.print(bob(b, false) + ".\n");
			Thread.sleep(singspeed);
			System.out.print((b > 0) ? takedown : gostore);
			Thread.sleep(singspeed);
			System.out.print((b > 0) ? bob(b - 1, false) : bob(WallOfBeer.full,
					false));
			System.out.print(onwall + ".\n");
		} catch (InterruptedException ignore) {
		}
	}

	static final String bob(int i, boolean c) {
		String word = word(i);
		if (c) {
			word = (word.substring(0, 1).toUpperCase()) + word.substring(1);
		}
		return word + " bottle" + ((i == 1) ? "" : "s") + " of beer";
	}

	static final String word(int i) {
		if (i == 0)
			return "no more";
		if (i < 20)
			return units[i];
		return tens[i / 10]
				+ ((units[i % 10] == "") ? "" : "-" + units[i % 10]);
	}

	static final String onwall = " on the wall";
	static final String takedown = "Take one down and pass it around, ";
	static final String gostore = "Go to the store, get soe more, ";

	static final String[] tens = { "", "", "twenty", "thirty", "forty",
			"fifty", "sixty", "seventy", "eighty", "ninety" };
	static final String[] units = { "", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine", "ten", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen" };
}
