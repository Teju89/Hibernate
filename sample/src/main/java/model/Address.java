package model;

public class Address {
	private int plotNo;
	private String area;
	
	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address [plotNo=" + plotNo + ", area=" + area + "]";
	}
	
	
}
