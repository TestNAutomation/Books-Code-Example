// Enum singleton - the preferred approach - Page 311
package com.sayem.chapter11.item77.enumSingleton;

import java.util.Arrays;

public enum Elvis {
	INSTANCE;
	private String[] favoriteSongs = { "Hound Dog", "Heartbreak Hotel" };

	public void printFavorites() {
		System.out.println(Arrays.toString(favoriteSongs));
	}
}