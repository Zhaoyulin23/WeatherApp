package edu.neu.cs5200.weather;

import org.json.simple.JSONArray;

public class Weather {
	private int id;
	private String locationName;
	private String zip;
	private Condition currentConditions;
	public Weather(String locationName, String zip) {
		super();
		this.locationName = locationName;
		this.zip = zip;
	}
	
	public Weather(int id, String locationName, String zip) {
		super();
		this.id = id;
		this.locationName = locationName;
		this.zip = zip;
	}

	public Weather(int id, String locationName, String zip,
			Condition currentConditions, List<Condition> forecast) {
		super();
		this.id = id;
		this.locationName = locationName;
		this.zip = zip;
		this.currentConditions = currentConditions;
		this.forecast = forecast;
	}
	public Weather(String locationName, String zip,
			Condition currentConditions, List<Condition> forecast) {
		super();
		this.locationName = locationName;
		this.zip = zip;
		this.currentConditions = currentConditions;
		this.forecast = forecast;
	}
	
	public Weather() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public List<Condition> getForecast() {
		return forecast;
	}
	public void setForecast(List<Condition> forecast) {
		this.forecast = forecast;
	}
	public void setCurrentConditions(Condition currentConditions) {
		this.currentConditions = currentConditions;
	}
    private List<Condition> forecast;
}