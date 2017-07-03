package com.sda.Practice_SoftwareDevs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by andrzej on 03.07.17.
 */
public class DevsTest {

	LanguagesDataBase database = new LanguagesDataBase();
	//create developers here



	SoftwareDeveloper developer1 = new SoftwareDeveloper("Andrzej",37, setLanguagesAndrzej());

	SoftwareDeveloper developer2 = new SoftwareDeveloper("Tomek",24, setLanguagesTomek());

	SoftwareDeveloper developer3 = new SoftwareDeveloper("Bartek",29, setLanguagesBartek());

	SoftwareDeveloper developer4 = new SoftwareDeveloper("Alicja",22, setLanguagesAlicja());

	SoftwareDeveloper developer5 = new SoftwareDeveloper("Janusz",39, setLanguagesJanusz());

	private Set<String> setLanguagesJanusz() {
		Set<String> collect = Stream.of(database.getSQL(), database.getSCALA(), database.getJAVASCRIPT(), database.getJAVA(), database.getCSS())
				.collect(Collectors.toSet());
		return collect;

	}


	private Set<String> setLanguagesAlicja() {

	Set<String> collect = Stream.of(database.getGROOVY(), database.getCSS(), database.getHESKEL(), database.getCSHARP(), database.getJAVA())
			.collect(Collectors.toSet());

	return collect;
	}



	public Set<String> setLanguagesAndrzej() {

		Set<String> collect = Stream.of(database.getJAVA(), database.getJAVASCRIPT(), database.getCSHARP())
				.collect(Collectors.toSet());

		return collect;

	}

	public Set<String> setLanguagesTomek() {

		Set<String> collect = Stream.of(database.getSCALA(), database.getHESKEL(), database.getHTML())
				.collect(Collectors.toSet());

		return collect;
	}



	public Set<String> setLanguagesBartek() {
		Set<String> collect = Stream.of(database.getGROOVY(), database.getCSS(), database.getJAVASCRIPT(), database.getHTML())
				.collect(Collectors.toSet());

		return collect;
	}

}
