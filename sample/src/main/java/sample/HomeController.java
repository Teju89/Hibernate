package sample;

import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Address;
import model.Student;
import service.StudentService;

@Controller
@RequestMapping("/mycontroller")
public class HomeController {

	@Autowired
	private StudentService service;

	// When this method should get call
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name", "Time");
		model.addAttribute("rollNo", 101);
		Address addr = new Address();
		addr.setPlotNo(103);
		addr.setArea("KPHB");
		model.addAttribute("addr", addr);
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		model.addAttribute("list", list);
		System.out.println("Hello to Spring MVC");
		return "NewFile";
	}

	@RequestMapping("/mypage")
	public ModelAndView showMyPage() {
		Address addr = new Address();
		addr.setPlotNo(103);
		addr.setArea("KPHB");
		ModelAndView model = new ModelAndView();
		model.addObject("address1", addr);
		model.addObject("date", new Date());
		model.setViewName("mypage");
		return model;
	}

	@RequestMapping("/contact")
	public String showContact(Model m) {
		System.out.println("method showContact...");
		return "contact";
	}

	/*
	 * @RequestMapping(path = "/register", method = RequestMethod.POST) public
	 * ModelAndView registration(@RequestParam("rn") int rollNo,@RequestParam("sn")
	 * String name,@RequestParam("sc") String city) { ModelAndView modelAndView =
	 * new ModelAndView(); modelAndView.addObject("rollNo", rollNo);
	 * modelAndView.addObject("name", name); modelAndView.addObject("city", city);
	 * modelAndView.setViewName("mypage"); return modelAndView; }
	 */

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public ModelAndView registration(@ModelAttribute Student student, Model m) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("mypage");

		int record = service.createStudent(student);
		if (record > 0) {
			modelAndView.addObject("message", "Registration Successful");
//			m.addAttribute("message", "Registration Successful");
		} else {
			modelAndView.addObject("message", "Invalid");
		}
		System.out.println(student);
		System.out.println("method registration...");
		return modelAndView;
	}

	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("msg", "Learn with Tejal");
	}
}
