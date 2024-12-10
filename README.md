# RepositorioProjetoEngenharia

## Sobre o projeto

todoupdatelater

## Preparações do ambiente para rodar o projeto.

## Ambiente

### MySql
Para começar se deve baixar o banco de dados disponibilizado.
A plataforma para utilização do banco de dados foi o MySql Server + MySql Workbench.
Download do MySql Community: https://dev.mysql.com/downloads/installer/
Download do MySql Workbench (caso necessário: https://www.mysql.com/products/workbench/ )

### Editor de texto
O editor de texto utilizado no projeto foi o Apache Netbeans.
Download do Apache Netbeans: https://netbeans.apache.org/front/main/download/nb23/
Download do Java : https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
(Check da versão do jdk pra update dps)

## Preparações do Projeto.
Adendo: haverá zip separados do projeto, caso os passos falhem e/ou não consiga executar-lo.

### MySql
1- Abra o MySql Workbench
2.1- Faça download do arquivo pews_bd.sql
2.2- O mesmo arquivo se encontra dentro da pasta do projeto.
3- Logue na conexão default do projeto.
4- Há dois métodos de se fazer agora:
4.1- Copie e cole o código nessa tela, clique no raio para confirmar.
![image](https://github.com/user-attachments/assets/2bae0100-4dee-4e60-abc0-99d46f9713d5)
4.1.1- Cheque se funcionou clicando em Schemas, e clicando no icone de rotação destacado.
![image](https://github.com/user-attachments/assets/40d2f8e0-4abf-42a6-806c-b00452c2a2a0)
Se aparecer um BD chamado pews, funcionou.
Outro método:
4.2- Clique em file, add sql file.
![n](https://github.com/user-attachments/assets/22522411-dd94-42c2-aaeb-1fff826909da)
4.2.1- Ache o arquivo que fez download anteriormente e selecione ele.
4.2.2- Clique no raio, cheque se o BD pews apareceu.

### Java Netbeans
Como o projeto foi feito pelo java netbeans, vou dizer como o projeto funcionaria no NetBeans.
1- Cheque se tudo está funcionando no Java Netbeans.
2- Faça donwload do arquivo projeto.zip disponibilizado.
3- Nas opções do netbeans, File > Open Project , selecione o projeto do arquivo.
4- Aguarde carregar, tente rodar.

#### Erros conhecidos do Java Netbeans:
Persistência:
Há erros de persistência quando adicionado a uma nova máquina.
Para resolver ele :
todoupdatelater

Connector do MySql:
O conector sempre está desconfigurado quando se troca de máquina.
Para resolver:
1- Clique em resolver.
2- Na pasta do projeto, ache a pasta utilitarios, dentro da pasta utilitario, ache o arquivo mysql-connector. (Caminho: src/main/java/utilitario/mysql-connector).
3- Após selecionar ele, clique em confirmar e o erro vai estar resolvido.



