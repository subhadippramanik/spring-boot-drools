package com.subhadip;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuleController {

	private final RuleService service;

	@Autowired
	public RuleController(RuleService service) {
		this.service = service;
	}

	@RequestMapping(value = "/applyRules", method = RequestMethod.POST, produces = "application/json")
	public Map<String, String> applyRules(@RequestBody Map<String, String> attributes) {
		return service.find(attributes);
	}
}