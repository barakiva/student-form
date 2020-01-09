package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Student;
import services.CityService;

@Controller
@ComponentScan("services")
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private CityService cityService;
	
	@RequestMapping("/show-form")
	public String showForm(Model theModel) {

		// create a student object
		Student student = new Student();
//		cityService = new CityService();
		// add student object to the model
		theModel.addAttribute("student", student);
		theModel.addAttribute("cities", cityService.getCityList());
		System.out.println(cityService.getCityList().get(1));
		
		return "student-form";
	}

	
	@PostMapping("/process-form")
	public String processForm(@ModelAttribute("student") Student student) {
		
		// log the input data
		System.out.println("theStudent: " + student.getFirstName()
							+ " " + student.getLastName());
		
		return "student-confirmation";
	}
	
}









