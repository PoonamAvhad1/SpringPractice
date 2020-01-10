package com.yash.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ParentCollection {

private  List<String> cityNames;
private List<String> city;



private Set<String> stateNames;
private Map<String,String> country;
	public List<String> getCityNames() {
		return cityNames;
	}
	public void setCityNames(List<String> cityNames) {
		this.cityNames = cityNames;
	}
	public Set<String> getStateNames() {
		return stateNames;
	}
	public void setStateNames(Set<String> stateNames) {
		this.stateNames = stateNames;
	}
	
	
	public Map<String, String> getCountry() {
		return country;
	}
	public void setCountry(Map<String, String> country) {
		this.country = country;
	}
	
	
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "ParentCollection [cityNames=" + cityNames + ", city=" + city + ", stateNames=" + stateNames
				+ ", country=" + country + "]";
	}
	
}
