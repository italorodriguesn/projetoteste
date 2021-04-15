#language:pt
#enconding:UTF-8

@ManterCadastro
Funcionalidade: Manter usuario

  @CadastrarUsuario
  Cenario: Cadastrar usuario
    Quando eu clicar em novo usuario
    E informar o nome "OLAOLAA"
    E informar o NAJ "NAJ DE PLANALTINA"
    E informar a senha do usuario "12345UCHIHAA12"
    E informar a matricula "621662872"
    E informar o cargo "APOIO1"
    E informar no campo de observacao "observação"
    E acionar o botao salvar
    E o sistema apresenta o alerta "USUÁRIO Cadastrado com sucesso"
    Entao O sistema apresenta o usuario "OLAOLAA"

  @EditarUsuario
  Cenario: Editar usuario
    Quando eu clicar no botao de editar do usuario
    E Limpar e informar o nome "NARUTOO"
    E informar o NAJ "NAJ DE BRAZLÂNDIA"
    E informar a senha do usuario "12345UZUMAKI"
    E informar a matricula "54666321"
    E informar o cargo "ASSESSOR"
    E informar no campo de observacao "Aldeia da folha"
    E acionar o botao salvar
    Entao o sistema apresenta o alerta "Dados Alterados com Sucesso!!!"
    E o sitema apresenta o usuario editado "NARUTOO"

  @Mostrarusuarios @Teste
  Cenario: Mostrar usuarios
    Entao O sistema apresenta todos os usuarios 

    @ExluirUsuario
    Cenario: Excluir usuario
    Quando eu clicar no botao de excluir usuario "MARCELO3"
    Entao o sistema apresenta a tela de alerta
    E o sistema apresenta o usuario excluido "MARCELO3"
    
