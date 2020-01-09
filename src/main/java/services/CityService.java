package services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import model.City;


@Service
public class CityService {
	private List<City> cityList;
	
	public CityService() {
		cityList = new ArrayList<>();
		cityList.add(new City("London"));
		cityList.add(new City("New York"));
		cityList.add(new City("Paris"));
		cityList.add(new City("Berlin"));
		cityList.add(new City("Dublin"));
	}

	public List<City> getCityList() {
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	
}
