package com.sda.Practice_SoftwareDevs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
		List<SoftwareDeveloper> devsWithJava = new ArrayList<>();

		for (int i = 0; i < softwareDevelopers.size(); i++) {
			if(softwareDevelopers.get(i).getKnownLanguages().contains("java")) {
				devsWithJava.add(softwareDevelopers.get(i));
			}
		}
		return devsWithJava;
	}

	public List<SoftwareDeveloper> getAllDevsWithJavaScript(List<SoftwareDeveloper> softwareDevelopers) {
		List<SoftwareDeveloper> devsWithJS = new ArrayList<>();

		for (int i = 0; i < softwareDevelopers.size(); i++) {
			if(softwareDevelopers.get(i).getKnownLanguages().contains("javascript")) {
				devsWithJS.add(softwareDevelopers.get(i));
			}
		}
		return devsWithJS;
	}

	public void printTheList(List<SoftwareDeveloper> list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " " + list.get(i).getAge());
		}
	}


//	public Set<String> getAllDevsWithJava(List<SoftwareDeveloper> softwareDevelopers) {
//		Set<String> devsWithJava = new HashSet<>();
//
//		for (SoftwareDeveloper softwareDeveloper : softwareDevelopers) {
//			for (String languageJ : softwareDeveloper.getKnownLanguages()) {
//				devsWithJava.add(languageJ);
//			}
//		}
//
//
//		return softwareDevelopers.stream()
//				.map(SoftwareDeveloper::getKnownLanguages)
//				.flatMap(Set::stream)
//				.filter()

//	}

}
