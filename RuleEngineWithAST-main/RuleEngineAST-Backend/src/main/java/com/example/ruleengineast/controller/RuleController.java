package com.example.ruleengineast.controller;

import com.example.ruleengine.model.Rule;
import com.example.ruleengine.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rules")
public class RuleController {

    @Autowired
    private RuleService ruleService;

    @PostMapping("/create")
    public Rule createRule(@RequestBody Rule rule) {
        return ruleService.saveRule(rule);
    }

    @GetMapping("/all")
    public List<Rule> getAllRules() {
        return ruleService.getAllRules();
    }
}
