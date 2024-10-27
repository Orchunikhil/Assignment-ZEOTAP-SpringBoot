package com.example.ruleengineast.repository;

import com.example.ruleengineast.entity.Rule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ruleengine.model.Rule;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository

public interface RuleRepository extends JpaRepository<Rule, Long> {
}
