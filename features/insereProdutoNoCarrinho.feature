# language: pt

Funcionalidade: Inserção de um produto no carrinho

  Cenário: Um cliente deseja inserir um produto da página inicial no carrinho
    Dado que o cliente esta na página inicial do site
    Quando eu vejo um produto do meu interesse
    Então ele coloca um produto no carrinho
    #E sou redirecionado para página do carrinho

  Cenário: um cliente inseriu um produto no carrinho e voltou a página inicial
    Dado que o cliente esta na página inicial do site
    Então ele coloca um produto no carrinho
    Quando ele retorna a página inicial do site
    E ele ve que o número de produtos no carrinho mudou
