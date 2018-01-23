# Access

Para executar o projeto Access local é necessario ter instalado o postgress e o maven na máquina.
Após realizar o clone do projeto através do comando:<br/>
  git clone
  
Vá até o diretorio do mesmo pelo terminal execute o comando maven: <br/>
  mvn clean package<br/>
Com isso vc irá baixar todas as dependências necessarias para o projeto e também irá gerar um pacote .jar,<br/>
este se encontrará dentro da pasta target que foi criada a partir da execução do comando. Agora basta ir até a<br/>
pasta target ainda pelo terminal e executar o jar gerado, por meio do comando:<br/>
  java -jar 

Este ultimo comando é responsável por executar o projeto compilado, apartir de agora o Access deve estar funcionando<br/>
corretamente.

Caso não queira subir o projeto através de linha de comando, basta importar o projeto na sua IDE de preferrência<br/>
e roda-lo como um projeto SpringBoot comum.
