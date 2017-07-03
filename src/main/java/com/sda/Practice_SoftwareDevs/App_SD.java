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



		List<SoftwareDeveloper> devsJava = fetcher.getAllDevsWithJava(softwareDevelopers);
		List<SoftwareDeveloper> devsJS = fetcher.getAllDevsWithJavaScript(softwareDevelopers);
		System.out.println("Devs JAVA");
		fetcher.printTheList(devsJava);

		System.out.println("\n DEVS JS");
		fetcher.printTheList(devsJS);




//		for (int i = 0; i < softwareDevelopers.size(); i++) {
//
//			if(softwareDevelopers.get(i).getKnownLanguages().contains("java")) {
//				devsWithJava.add(softwareDevelopers.get(i));
//			}
//		}
//		System.out.println("Devs with Java");
//		for (int i = 0; i < devsWithJava.size(); i++) {
//			System.out.println(devsWithJava.get(i).getName() + " " +  devsWithJava.get(i).getAge());
//		}

//		Stream.of(devsWithJava).forEach(System.out::println);


		System.out.println("--------------------");


		Set<String> allLanguages = fetcher.getAllKnownLanguages(softwareDevelopers);

		Stream.of(allLanguages).forEach(System.out::println);

		Set<String> allLanguagesStartwithJ = fetcher.getAllLanguagesStartwithJ(softwareDevelopers);

		Stream.of(allLanguagesStartwithJ).forEach(System.out::println);




//		for (String language : devsTest.developer1.getKnownLanguages())
//			System.out.println(language);
//
//		devsTest.setLanguagesTomek();
//		devsTest.setLanguagesBartek();
//
//		for (String language : devsTest.developer2.getKnownLanguages())
//			System.out.println(devsTest.developer2.getName() + " " + language);
//
//		for (String language : devsTest.developer3.getKnownLanguages())
//			System.out.println(devsTest.developer3.getName() + " " + language);
//	}
	}
}
