package com.subhadip;

import java.util.Map;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleService {

	private final KieContainer kieContainer;

	@Autowired
	public RuleService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public Map<String, String> find(Map<String, String> attributes) {
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(attributes);
		kieSession.fireAllRules();
		kieSession.dispose();
		return attributes;
	}
}
