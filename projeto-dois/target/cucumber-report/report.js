$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Manter%20Cadastro.feature");
formatter.feature({
  "name": "Manter usuario",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@ManterCadastro"
    }
  ]
});
formatter.scenario({
  "name": "Mostrar usuarios",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ManterCadastro"
    },
    {
      "name": "@Mostrarusuarios"
    },
    {
      "name": "@Teste"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "O sistema apresenta todos os usuarios",
  "keyword": "Entao "
});
formatter.match({
  "location": "stepsdefinitions.BaseSteps.oSistemaApresentaTodosOsUsuarios()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});