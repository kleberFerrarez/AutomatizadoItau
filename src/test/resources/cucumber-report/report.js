$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Feature.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Testes Básicos",
  "description": "",
  "id": "testes-básicos",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 6,
  "name": "Teste Pesquisa BRQ",
  "description": "",
  "id": "testes-básicos;teste-pesquisa-brq",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 5,
      "name": "@BRQ"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "acessei o google",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "pesquisar sobre a BRQ",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "abra o site da BRQ",
  "keyword": "Então "
});
formatter.match({
  "location": "Tests.brq()"
});
formatter.result({
  "duration": 6183071000,
  "status": "passed"
});
formatter.match({
  "location": "Tests.pesquisaBRQ()"
});
formatter.result({
  "duration": 1467465000,
  "status": "passed"
});
formatter.match({
  "location": "Tests.abrirSiteBRQ()"
});
formatter.result({
  "duration": 2531982900,
  "status": "passed"
});
});