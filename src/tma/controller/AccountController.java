package tma.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import tma.entities.Account;
import tma.service.*;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap mm) {
		mm.addAttribute("la", accountService.findAll());
		return "index";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(ModelMap mm) {
		mm.addAttribute("acc", new Account());
		return "add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute(value = "acc") Account acc) {
		accountService.create(acc);
		return "redirect:/account.html";
	}

	@RequestMapping(value = "/delete/{username}", method = RequestMethod.GET)
	public String delete(@PathVariable(value = "username") String username) {
		accountService.remove(accountService.find(username));
		return "redirect:/account.html";
	}

	@RequestMapping(value = "/edit/{username}", method = RequestMethod.GET)
	public String edit(@PathVariable(value = "username") String username,
			ModelMap mm) {
		mm.addAttribute("acc", accountService.find(username));
		return "edit";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String edit(@ModelAttribute(value = "acc") Account acc) {
		accountService.edit(acc);
		return "redirect:/account.html";
	}

}
