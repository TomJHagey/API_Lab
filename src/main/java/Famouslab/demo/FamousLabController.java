package Famouslab.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Famouslab.demo.model.Complete;
import Famouslab.demo.model.Tiny;

//import co.grandcircus.apidemo.ApiService;

@Controller
public class FamousLabController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("/")
	public ModelAndView tinyForm() {
	List<Tiny> tiny = apiService.getTinyResponse();
	return new ModelAndView("tiny", "tiny", tiny);

	}

	@RequestMapping("/complete")
	public ModelAndView completeForm() {
	List<Complete> complete = apiService.getCompleteResponse();
		return new ModelAndView("complete", "complete", complete);

	}
}
