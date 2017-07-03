package com.sda.Practice_SoftwareDevs;

import java.util.Set;

/**
 * Created by andrzej on 03.07.17.
 */
public class SoftwareDeveloper {
		private String name;
		private	int age;
		private Set<String> knownLanguages;


	public SoftwareDeveloper(String name, int age, Set<String> knownLanguages) {
		this.name = name;
		this.age = age;
		this.knownLanguages = knownLanguages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<String> getKnownLanguages() {
		return knownLanguages;
	}

	public void setKnownLanguages(Set<String> knownLanguages) {
		this.knownLanguages = knownLanguages;
	}
}
