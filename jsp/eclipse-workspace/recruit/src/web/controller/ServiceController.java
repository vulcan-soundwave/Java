package web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import common.Common;
import web.service.AllService;

@Controller
public class ServiceController {
	@Autowired
	AllService allservice;
	Common common;

	@RequestMapping(value = "html/" + Common.name1)
	public String name1controller(ModelMap map, HttpServletRequest request) {
		String json = allservice.processType1((allservice.getinfo(common.name1)));
		map.addAttribute("info", json);
		return Common.name1;
	}

	@RequestMapping(value = "html/" + Common.name2)
	public String name2controller(ModelMap map, HttpServletRequest request) {
		String json = allservice.processType1((allservice.getinfo(common.name2)));
		map.addAttribute("info", json);
		return Common.name2;
	}

	@RequestMapping(value = "html/" + Common.name3)
	public String name3controller(ModelMap map, HttpServletRequest request) {
		String json = allservice.processType1((allservice.getinfo(common.name3)));
		map.addAttribute("info", json);
		return Common.name3;
	}

	@RequestMapping(value = "html/" + Common.name4)
	public String name4controller(ModelMap map, HttpServletRequest request) {
		String json = allservice.processType1((allservice.getinfo(common.name4)));
		map.addAttribute("info", json);
		return Common.name4;
	}

	@RequestMapping(value = "html/" + Common.name7)
	public String name7controller(ModelMap map, HttpServletRequest request) {
		List<String> json = allservice.processType4_7x((allservice.getinfo(common.name7)));
		map.addAttribute("info1", json.get(0));
		map.addAttribute("info2", json.get(1));
		return Common.name7;
	}

	@RequestMapping(value = "html/" + Common.name8)
	public String name8controller(ModelMap map, HttpServletRequest request) {
		List<String> info = allservice.processType2((allservice.getinfo(common.name8)));
		map.addAttribute("info", info);
		return Common.name8;
	}

	@RequestMapping(value = "html/" + Common.name9)
	public String name9controller(ModelMap map, HttpServletRequest request) {
		Map<String, Object> info = allservice.process4_9((allservice.getinfo(common.name9)));
		map.addAttribute("info", info);
		return Common.name9;
	}

	@RequestMapping(value = "html/" + Common.name10)
	public String name10controller(ModelMap map, HttpServletRequest request) {
		List<String> json = allservice.processType4_7x((allservice.getinfo(common.name10)));
		map.addAttribute("info1", json.get(0));
		map.addAttribute("info2", json.get(1));
		return Common.name10;
	}

	// 11 12 13
	@RequestMapping(value = "html/" + Common.name11)
	public String name11controller(ModelMap map, HttpServletRequest request) {
		List<String> info = allservice.processType4_11((allservice.getinfo(common.name11)));
		map.addAttribute("names", info.get(0));
		map.addAttribute("datas", info.get(1));
		return Common.name11;
	}

	@RequestMapping(value = "html/" + Common.name12)
	public String name12controller(ModelMap map, HttpServletRequest request) {
		Map<String,Object> inf = allservice.processType4_12((allservice.getinfo(common.name12)));
		map.addAttribute("citys", inf.get("citys"));
		map.addAttribute("posts", inf.get("posts"));
		map.addAttribute("datas", inf.get("datas"));	
		return Common.name12;
	}
	@RequestMapping(value = "html/" + Common.name13)
	public String name13controller(ModelMap map, HttpServletRequest request) {
		List<String> info = allservice.process4_13((allservice.getinfo(common.name13)));
		map.addAttribute("info", info.get(0));
		map.addAttribute("data1", info.get(1));
		map.addAttribute("data2", info.get(2));
		return Common.name13;
	}

	
	@RequestMapping(value = "html/" + Common.name14)
	public String name14controller(ModelMap map, HttpServletRequest request) {
		String json = allservice.processType1((allservice.getinfo(common.name14)));
		map.addAttribute("info", json);
		return Common.name14;
	}

	@RequestMapping(value = "html/" + Common.name15)
	public String name15controller(ModelMap map, HttpServletRequest request) {
		List<String> json = allservice.process4_15((allservice.getinfo(common.name15)));
		map.addAttribute("name", json.get(0));
		map.addAttribute("data", json.get(1));
		return Common.name15;
	}

	@RequestMapping(value = "html/" + Common.name16)
	public String name16controller(ModelMap map, HttpServletRequest request) {
		List<String> info= allservice.process4_16((allservice.getinfo(common.name16)));
		map.addAttribute("info", info.get(0));
		map.addAttribute("data1", info.get(1));
		map.addAttribute("data2", info.get(2));
		map.addAttribute("data3", info.get(3));
		return Common.name16;
	}
	
	/**
	 * 
	 * 
	 * @RequestMapping(value = "html/ ") public String bdrcontroller(ModelMap
	 *                       map,HttpServletRequest request) {
	 *                       map.addAttribute("",""); return " "; }
	 *                       china-average_salary-distribution
	 *                       china-company-distribution china-requirement
	 *                       CoverTemplate database diff_area-average_salary
	 *                       education-backgroud effective_data hands-on
	 *                       background highest_bigdata-requirement
	 *                       highest_city-requirement
	 *                       highest_salary-post-requirement
	 *                       highestarea_requirement_area-big_data
	 *                       language-requirement language-salary pages ppt
	 *                       source
	 **/
}
