#Author: mayaracauny@gmail.com

@Regressivo
Feature: Realizar formulário de inscrição de estudante
Como estudante 
Quero informar os dados necessários
Para realizar a inscrição

Background: Acessar tela de login
Given que esteja na tela de login

@positivo
  Scenario: dados válidos
    When preencher todos os dados corretamente
    And clicar no botão submit
    Then inscrição realizada com sucesso

@negativo
 Scenario: campo nome vazio
    When não preencher o campo nome
    And preencher os outros dados
    And clicar no botão submit
    Then inscrição não realizada 

@negativo
 Scenario: campo sobrenome vazio
      When não preencher o campo sobrenome
    And preencher outros dados
    And clicar no botão submit
    Then inscrição não realizada 
    
