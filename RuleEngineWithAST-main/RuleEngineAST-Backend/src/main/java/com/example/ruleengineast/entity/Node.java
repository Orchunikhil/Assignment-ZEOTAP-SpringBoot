package com.example.ruleengineast.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Rule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ruleString;
    private String ast;  // JSON representation of the AST

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRuleString() { return ruleString; }
    public void setRuleString(String ruleString) { this.ruleString = ruleString; }

    public String getAst() { return ast; }
    public void setAst(String ast) { this.ast = ast; }
}
