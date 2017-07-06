package com.sda.Practice_SoftwareDevs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by andrzej on 03.07.17.
 */
public class SoftwareDevsFetcher {


	public Set<String> getAllKnownLanguages(List<SoftwareDeveloper> softwareDevelopers) {
		Set<String> result = new HashSet<>();
		for (SoftwareDeveloper softwareDeveloper : softwareDevelopers) {
			for (String language : softwareDeveloper.getKnownLanguages()) {
				result.add(language);
			}
		}


		//return result;

		return softwareDevelopers.stream()
				.map(SoftwareDeveloper::getKnownLanguages)
				.flatMap(Set::stream)
//				.filter(language -> language.startsWith("J"))
				.collect(Collectors.toSet());

	}

	public Set<String> getAllLanguagesStartwithJ(List<SoftwareDeveloper> softwareDevelopers) {
		Set<String> languagesWithJ = new HashSet<>();

		for (SoftwareDeveloper softwareDeveloper : softwareDevelopers) {
			for (String languageJ : softwareDeveloper.getKnownLanguages()) {
				languagesWithJ.add(languageJ);
			}
		}

		return softwareDevelopers.stream()
				.map(SoftwareDeveloper::getKnownLanguages)
				.flatMap(Set::stream)
				.filter(language -> language.startsWith("j"))
				.collect(Collectors.toSet());
	}




	public List<SoftwareDeveloper> getAllDevsWithJava(List<SoftwareDeveloper> softwareDevelopers) {

		List<SoftwareDeveloper> javaDevs = softwareDevelopers.stream()
				.filter(devs -> devs.getKnownLanguages().contains("java"))
				.collect(Collectors.toList());

		System.out.println("DEVS WITH JAVA: ");
		javaDevs.forEach(softwareDeveloper -> System.out.println(softwareDeveloper.getName() + " " +
		softwareDeveloper.getAge()));
/*
//OLD METHOD
		for (int i = 0; i < softwareDevelopers.size(); i++) {
			if(softwareDevelopers.get(i).getKnownLanguages().contains("java")) {
				devsWithJava.add(softwareDevelopers.get(i));
			}
		}*/
		return javaDevs;
	}

	public List<SoftwareDeveloper> getAllDevsWithJavaScript(List<SoftwareDeveloper> softwareDevelopers) {

		List<SoftwareDeveloper> javascriptDevelopers = softwareDevelopers.stream()
				.filter(devs -> devs.getKnownLanguages().contains("javascript"))
				.collect(Collectors.toList());

		System.out.println("DEVS WITH JS: ");
		javascriptDevelopers
				 .forEach(softwareDevelopers2 -> System.out.println(softwareDevelopers2.getName() + " " +  softwareDevelopers2.getAge()));


		/* OLD METHOD USING FOR LOOP
		for (int i = 0; i < softwareDevelopers.size(); i++) {
			if(softwareDevelopers.get(i).getKnownLanguages().contains("javascript")) {
				devsWithJS.add(softwareDevelopers.get(i));
			}
		}*/
	return javascriptDevelopers;
	}

	public void printDevsToFile(List<SoftwareDeveloper> devList) {

		try {
			FileWriter fileWriter = new FileWriter("devs.txt");


			for (SoftwareDeveloper softwareDeveloper : devList) {
				String singleDev = softwareDeveloper.getName() + " " + softwareDeveloper.getAge() + " " +
						softwareDeveloper.getKnownLanguages();
				fileWriter.write(singleDev + "\n");
			}
			fileWriter.close();


		} catch (java.io.IOException e) {
			e.printStackTrace();
		}



	}
}
