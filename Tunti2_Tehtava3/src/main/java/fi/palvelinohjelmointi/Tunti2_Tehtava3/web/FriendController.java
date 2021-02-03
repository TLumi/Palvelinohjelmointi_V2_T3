package fi.palvelinohjelmointi.Tunti2_Tehtava3.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.palvelinohjelmointi.Tunti2_Tehtava3.domain.Friend;


@Controller
public class FriendController {
		
	
		@RequestMapping(value = "/index", method = RequestMethod.GET)
		public String greetingForm(Model model) {
			model.addAttribute("name", new Friend());
			return "friends";
			}
		
		@RequestMapping(value = "/index", method = RequestMethod.POST)
		public String greetingSubmit(@Validated Friend name, BindingResult bindingResult, Model model) {
			if(bindingResult.hasErrors()) {
				return "redirect: friends";
			}
			model.addAttribute("name", name);
			return "friends";
		}
				
			@RequestMapping("/index")
			public String showFriends(Model model) {
				ArrayList<Friend> friendList =new ArrayList<>();
				model.addAttribute("friends", friendList.findAll());
				return "friends";
					}
					
}

