package com.samples.s01springcoredi;

import java.util.Properties;

public class CountriesandLanguages {
	
	private Properties countryLanguages;

	public Properties getCountryLanguages() {
		return countryLanguages;
	}

	public void setCountryLanguages(Properties countryLanguages) {
		this.countryLanguages = countryLanguages;
	}

	@Override
	public String toString() {
		return "CountriesandLanguages [countryLanguages=" + countryLanguages + "]";
	}
	
	
}
