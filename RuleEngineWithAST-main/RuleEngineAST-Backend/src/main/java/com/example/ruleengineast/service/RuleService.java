package com.example.ruleengineast.service;


import com.example.ruleengine.model.Rule;
import com.example.ruleengine.repository.RuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleService {

    @Autowired
    private RuleRepository ruleRepository;

    public Rule saveRule(Rule rule) {
        return ruleRepository.save(rule);
    }

    public List<Rule> getAllRules() {
        return ruleRepository.findAll();
    }

    // Additional methods for handling rules
}
}