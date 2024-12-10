# RepositorioProjetoEngenharia

## Sobre o projeto

todoupdatelater

## Preparações do ambiente para rodar o projeto.

## Ambiente

### MySql
Para começar se deve baixar o banco de dados disponibilizado.<br />
A plataforma para utilização do banco de dados foi o MySql Server + MySql Workbench.<br />
Download do MySql Community: https://dev.mysql.com/downloads/installer/  <br/>
Download do MySql Workbench (caso necessário: https://www.mysql.com/products/workbench/ )<br/>

### Editor de texto
O editor de texto utilizado no projeto foi o Apache Netbeans.<br/>
Download do Apache Netbeans: https://netbeans.apache.org/front/main/download/nb23/<br/>
Download do Java : https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR<br/>
(Check da versão do jdk pra update dps)<br/>

## Preparações do Projeto.
Adendo: haverá zip separados do projeto, caso os passos falhem e/ou não consiga executar-lo.<br/>

### MySql
1- Abra o MySql Workbench<br/>
2.1- Faça download do arquivo pews_bd.sql<br/>
2.2- O mesmo arquivo se encontra dentro da pasta do projeto.<br/>
3- Logue na conexão default do projeto.<br/>
4- Há dois métodos de se fazer agora:<br/>
4.1- Copie e cole o código nessa tela, clique no raio para confirmar.<br/>
![image](https://github.com/user-attachments/assets/2bae0100-4dee-4e60-abc0-99d46f9713d5)
4.1.1- Cheque se funcionou clicando em Schemas, e clicando no icone de rotação destacado.<br/>
![image](https://github.com/user-attachments/assets/40d2f8e0-4abf-42a6-806c-b00452c2a2a0)<br/>
Se aparecer um BD chamado pews, funcionou.<br/>
Outro método:<br/>
4.2- Clique em file, add sql file.<br/>
![n](https://github.com/user-attachments/assets/22522411-dd94-42c2-aaeb-1fff826909da)<br/>
4.2.1- Ache o arquivo que fez download anteriormente e selecione ele.<br/>
4.2.2- Clique no raio, cheque se o BD pews apareceu.<br/>

### Java Netbeans<br/>
Como o projeto foi feito pelo java netbeans, vou dizer como o projeto funcionaria no NetBeans.<br/>
1- Cheque se tudo está funcionando no Java Netbeans.<br/>
2- Faça donwload do arquivo projeto.zip disponibilizado.<br/>
3- Nas opções do netbeans, File > Open Project , selecione o projeto do arquivo.<br/>
4- Aguarde carregar, tente rodar.<br/>

#### Erros conhecidos do Java Netbeans:
Persistência:<br/>
Há erros de persistência quando adicionado a uma nova máquina.<br/>
Para resolver ele :<br/>
todoupdatelater<br/>

Connector do MySql:<br/>
O conector sempre está desconfigurado quando se troca de máquina.<br/>
Para resolver:<br/>
1- Clique em resolver.<br/>
2- Na pasta do projeto, ache a pasta utilitarios, dentro da pasta utilitario, ache o arquivo mysql-connector. (Caminho: src/main/java/utilitario/mysql-connector).<br/>
3- Após selecionar ele, clique em confirmar e o erro vai estar resolvido.<br/>



