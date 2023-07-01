package com.jsp.Annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("camera")
public class MobileCamera 
{
	private int pixels;
	private String sensor;
	
	public int getPixels() {
		return pixels;
	}
	@Value("64")
	public void setPixels(int pixels) {
		this.pixels = pixels;
	}
	public String getSensor() {
		return sensor;
	}
	@Value("CCD")
	public void setSensor(String sensor) {
		this.sensor = sensor;
	}
	
	@Override
	public String toString() {
		return "MobileCamera [pixels=" + pixels + "MP, sensor=" + sensor + "]";
	}
	
	
	
}
