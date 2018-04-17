package web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import common.Common;

@Controller
public class WithOutServiceContorller {
	Common common;

	@RequestMapping(value = "index")
	public String indexcontroller() {
		return "../index";
	}

	@RequestMapping(value = "html/" + Common.name5)
	public String name1controller() {
		return Common.name5;
	}

	@RequestMapping(value = "html/" + Common.name6)
	public String name6controller() {
		return Common.name6;
	}

	@RequestMapping(value = "html/" + Common.name17)
	public String name17controller() {
		return Common.name17;
	}

	@RequestMapping(value = "html/" + Common.name18)
	public String name18controller() {
		return Common.name18;
	}

	@RequestMapping(value = "html/" + Common.name19)
	public String name19controller() {
		return Common.name19;
	}

}
