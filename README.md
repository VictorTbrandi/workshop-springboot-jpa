API de Gerenciamento de Pedidos E-commerce

Este projeto é uma API back-end robusta desenvolvida com Spring Boot, projetada para gerenciar pedidos de usuários, produtos, categorias e status de pagamento dentro de um contexto de e-commerce. Ele utiliza um banco de dados H2 em memória para simplificar a implantação e os testes.

Sumário
. Tecnologias Utilizadas
. Modelo de Domínio
. Estrutura do Projeto
. Funcionalidades
. Primeiros Passos
. Pré-requisitos
. Executando a Aplicação
. Endpoints da API (com Postman)
. Acesso ao Banco de Dados (Console H2)
. Contribuindo
. Licença

Tecnologias Utilizadas
O projeto foi construído utilizando as seguintes tecnologias e ferramentas principais:

. Spring Boot: Framework para construir aplicações Spring robustas, autônomas e de nível de produção.
. Apache Tomcat: Servidor embarcado utilizado pelo Spring Boot para executar a aplicação.
. Maven: Ferramenta de gerenciamento de dependências e automação de build.
. H2 Database: Um banco de dados relacional em memória utilizado para desenvolvimento e testes.
. Postman: Ferramenta para teste e desenvolvimento de APIs.

Modelo de Domínio
O núcleo da lógica da aplicação é estruturado em torno das seguintes entidades de domínio e seus relacionamentos:

. Product (Produto): Representa um produto com detalhes como nome, descrição, preço e URL da imagem.
. Category (Categoria): Agrupa produtos em categorias.
. User (Usuário): Gerencia informações do usuário, incluindo nome, e-mail, telefone e senha.
. Order (Pedido): Representa o pedido de um usuário, contendo o momento da compra, status atual e valor total.
. OrderItem (Item de Pedido): Vincula produtos a pedidos específicos, detalhando a quantidade e o preço no momento da compra.
. Payment (Pagamento): Registra os detalhes de pagamento associados a um pedido.
. OrderStatus (Status do Pedido - Enum): Define os vários estados possíveis de um pedido (ex: WAITING_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELED).

Estrutura do Projeto
O projeto segue uma estrutura padrão de aplicação Spring Boot, organizada para clareza e manutenção:

. org.springframework.projectspringboot:
. config: Classes de configuração (ex: TestConfig).
. entities: Entidades JPA representando o modelo de domínio.
. enums: Enumerações, como OrderStatus.
. pk: Classes para chaves primárias compostas (ex: OrderItemPK).
. repositories: Interfaces para acesso a dados (JPA Repositories).
. exceptions: Classes de exceção personalizadas e handler global de exceções.
. resources: Controladores REST (endpoints da API).
. services: Lógica de negócio e camada de serviço.
. exceptions: Exceções específicas do serviço.
. resources: Arquivos estáticos e propriedades da aplicação.

Funcionalidades
. Gerenciamento de Usuários: Criar, recuperar, atualizar e excluir contas de usuário.
. Catálogo de Produtos: Gerenciar produtos e suas categorias.
. Processamento de Pedidos: Criar pedidos, adicionar/remover itens e rastrear o status do pedido.
. Rastreamento de Pagamentos: Associar pagamentos a pedidos.
. API RESTful: Todas as funcionalidades expostas via uma API REST limpa e intuitiva.
. Banco de Dados em Memória: Fácil configuração e teste com o banco de dados H2.
. Tratamento Global de Exceções: Gerenciamento de erros robusto para respostas consistentes da API.
