package com.sda.Practice_SoftwareDevs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by andrzej on 03.07.17.
 */
public class App_SD {


	public static void main(String[] args) {

		DevsTest devsTest = new DevsTest();

		devsTest.setLanguagesAndrzej();
		devsTest.setLanguagesBartek();
		devsTest.setLanguagesTomek();

		SoftwareDevsFetcher fetcher = new SoftwareDevsFetcher();

		List<SoftwareDeveloper> softwareDevelopers = new ArrayList<>();
		softwareDevelopers.add(devsTest.developer1);
		softwareDevelopers.add(devsTest.developer2);
		softwareDevelopers.add(devsTest.developer3);
		softwareDevelopers.add(devsTest.developer4);
		softwareDevelopers.add(devsTest.developer5);

		fetcher.getAllDevsWithJava(softwareDevelopers);
		fetcher.printDevsToFile(softwareDevelopers);


	}
}
