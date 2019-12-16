$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Testes da Sprint 17/18/19/20",
  "description": "",
  "id": "testes-da-sprint-17/18/19/20",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 5,
  "name": "Validar o checklist para todas as telas e campos para cada portal",
  "description": "",
  "id": "testes-da-sprint-17/18/19/20;validar-o-checklist-para-todas-as-telas-e-campos-para-cada-portal",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 4,
      "name": "@Checklist"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "CL - acessar o portal do backoffice",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "CL - fazer o checklist para os campos da página home do backoffice",
  "keyword": "Então "
});
formatter.step({
  "line": 8,
  "name": "CL - acessar a opção de Serviços",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "CL - abrir a opção de Apontamento",
  "keyword": "Então "
});
formatter.step({
  "line": 10,
  "name": "CL - abrir a opção de Consultar Apontamento",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "CL - fazer o checklist para os elementos da página de Consulta de Apontamento",
  "keyword": "Então "
});
formatter.step({
  "line": 12,
  "name": "CL - acessar a opção de Incluir Apontamento",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "CL - fazer o checklist para os elementos da página de Incluir de Apontamento",
  "keyword": "Então "
});
formatter.match({
  "location": "TestsGIC.acessarPortalBackofficeCL()"
});
formatter.result({
  "duration": 15707007036,
  "status": "passed"
});
formatter.match({
  "location": "TestsGIC.checklistElementosTelaHomeBackofficeCL()"
});
formatter.result({
  "duration": 6304491464,
  "status": "passed"
});
formatter.match({
  "location": "TestsGIC.acessarOpcaoServicosCL()"
});
formatter.result({
  "duration": 3092550429,
  "status": "passed"
});
formatter.match({
  "location": "TestsGIC.acessarOpcaoApontamentoCL()"
});
formatter.result({
  "duration": 4255467773,
  "status": "passed"
});
formatter.match({
  "location": "TestsGIC.acessarOpcaoConsultarApontamentoCL()"
});
formatter.result({
  "duration": 4335310577,
  "status": "passed"
});
formatter.match({
  "location": "TestsGIC.checklistConsultaDeApontamentoCL()"
});
formatter.result({
  "duration": 11993921229,
  "status": "passed"
});
formatter.match({
  "location": "TestsGIC.acessarOpcaoIncluirApontamentoCL()"
});
formatter.result({
  "duration": 225519626,
  "status": "passed"
});
formatter.match({
  "location": "TestsGIC.fazerChecklistIncluirApontamentoCL()"
});
formatter.result({
  "duration": 58727404189,
  "status": "passed"
});
});