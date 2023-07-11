# spring-boot-oauth2-abordagem2

Outro exemplo de Resource Server com Spring Boot. Primeiro exemplo em: https://github.com/EdyKnopfler/spring-boot-oauth2.

No primeiro as dependências automaticamente liam as configurações nos arquivos `.properties` e tratavam de proteger 
automaticamente o servidor de recursos, comunicando-se com o servidor de autorização para validar os tokens.

Nesta abordagem a configuração é lida e feita de forma manual, permitindo controle granular dos níveis de proteção.

Para rodar, siga o mesmo procedimento do outro exemplo. Aqui os endpoints são:

* `/precious`: protegido (requer token)
* `/precious/not-so-much`: acesso livre
