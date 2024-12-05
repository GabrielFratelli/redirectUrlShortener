# Encurtador de URL com Redirecionamento

O Encurtador de URL com Redirecionamento é um serviço de encurtamento de URL baseado em Java, projetado para funcionar com AWS Lambda e S3.

## Visão Geral do Projeto

Este projeto tem como objetivo fornecer um serviço simples e eficiente de encurtamento de URLs. Ele utiliza o AWS Lambda para computação sem servidor e o S3 para armazenamento, tornando-o uma solução escalável e econômica.

## Tecnologias Utilizadas

- Java 17
- Maven
- AWS Lambda
- Amazon S3
- Jackson (para processamento de JSON)
- Lombok (para redução de código boilerplate)
- Log4j2 (para logs)

## Estrutura do Projeto

```
RedirectUrlShortener
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   └── resources
    └── test
        └── java
```

## Dependências

O projeto utiliza as seguintes dependências principais:

- `aws-lambda-java-core` (version 1.2.1)
- `aws-lambda-java-log4j2` (version 1.4.0)
- `aws-java-sdk-s3` (version 2.17.106)
- `lombok` (version 1.18.34)
- `jackson-databind` (version 2.12.3)

## Construindo o Projeto

Para construir o projeto, use o seguinte comando Maven:

```bash
mvn clean package
```

Isso criará um arquivo JAR que pode ser implantado no AWS Lambda.

## Configuração

Certifique-se de configurar suas credenciais AWS corretamente para permitir que a função Lambda interaja com o S3.

## Contribuindo

Contribuições para o projeto RedirectUrlShortener são bem-vindas. Fique à vontade para enviar um Pull Request.
