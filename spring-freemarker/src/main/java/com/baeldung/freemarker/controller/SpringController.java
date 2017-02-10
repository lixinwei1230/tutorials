package com.baeldung.freemarker.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.baeldung.freemarker.model.Affiliate;
import com.baeldung.freemarker.model.Affiliates;
import com.baeldung.freemarker.model.PaginationData;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baeldung.freemarker.model.Car;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SpringController {

	private static List<Car> carList = new ArrayList<>();

	static {
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
		carList.add(new Car("Honda", "Civic"));
		carList.add(new Car("Toyota", "Camry"));
		carList.add(new Car("Nissan", "Altima"));
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "redirect:/cars";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView testPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("test");
		BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("affiliate.json"), Charset.forName("UTF-8")));
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("affiliates.json"), Charset.forName("UTF-8")));
		ObjectMapper mapper = new ObjectMapper();
		try {
			Affiliate affiliate = mapper.readValue(reader, Affiliate.class);
			Affiliates affiliates = mapper.readValue(reader1, Affiliates.class);
			//jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(affiliate);
			//System.out.println(jsonInString);
			mav.addObject("affiliates", affiliates);
			mav.addObject("affiliate", affiliate);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return mav;
	}

	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	public ModelAndView freshPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("cars", carList);
		if (request.getParameter("pageindex") == null) {
			int pageSize = 2;
			PaginationData paginationData = new PaginationData(0, pageSize, carList.size() / pageSize);
			mav.addObject("paginationData", paginationData);
			return mav;
		} else {
			int pageIndex = Integer.parseInt(request.getParameter("pageindex"));
			int pageSize = Integer.parseInt(request.getParameter("pagesize"));
			int pageAvailable = Integer.parseInt(request.getParameter("pagesavailable"));
			PaginationData paginationData = new PaginationData(pageIndex, pageSize, pageAvailable);
			mav.addObject("paginationData", paginationData);
			return mav;
		}
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addCar(@ModelAttribute("car") Car car) {
		if (null != car && null != car.getMake() && null != car.getModel() 
				&& !car.getMake().isEmpty() && !car.getModel().isEmpty()) {
			carList.add(car);
		}
		return "redirect:/cars";
	}
	
}
