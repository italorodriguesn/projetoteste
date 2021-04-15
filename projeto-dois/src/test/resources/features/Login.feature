#language:pt  
#enconding:UTF-8

@ManterLogin
Funcionalidade: Login

@LoginInvalido
Cenario: Realizar login invalido
Quando eu informar o usuario "admin"
E informar a senha "senhaerrada"
E acionar o botao entrar
Entao o sistema apresenta a mensagem "Usuário ou Senha Inválidos!"

@LoginValido
Cenario: Realizar login
Quando eu informar o usuario "ADM"
E informar a senha "MASTER"
E acionar o botao entrar
Entao o sitema apresenta a tela de administrador logado "BEM VINDO"
E o sitema apresenta a tela apresenta a imagem
