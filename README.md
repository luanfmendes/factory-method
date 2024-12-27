# Notification System - Factory Method Design Pattern

Este projeto implementa o **padrão de design Factory Method**, que é utilizado para criar objetos sem expor a lógica de criação ao cliente e permitindo que as subclasses decidam qual classe concreta instanciar. Neste exemplo, o projeto simula um sistema de envio de notificações, onde diferentes tipos de notificações (como e-mail, SMS e push) são criados dinamicamente.

## Sobre o Padrão Factory Method

O **Factory Method** é um padrão de design criacional que permite a criação de objetos de forma flexível e desacoplada. Ele define um método para criar objetos, mas deixa as subclasses decidirem qual classe instanciar.

### Vantagens do Factory Method:
- **Desacoplamento**: O cliente não precisa se preocupar com a criação de instâncias. A lógica de criação é delegada à fábrica.
- **Extensibilidade**: Novos tipos de objetos podem ser facilmente adicionados sem alterar o código do cliente.
- **Manutenção**: Alterações na criação de objetos podem ser feitas na fábrica, sem impactar diretamente outras partes do sistema.

## Estrutura do Projeto

O projeto segue uma estrutura simples para demonstrar o **Factory Method** com um sistema de notificações.

### Classes Principais:

- **Notification** (Interface): Define o método `send()` para enviar a mensagem da notificação.
- **EmailNotification**, **SMSNotification**, **PushNotification** (Classes concretas): Implementam a interface `Notification` para enviar notificações de diferentes tipos.
- **NotificationFactory** (Classe abstrata): Define o método abstrato `createNotification()` para ser implementado pelas fábricas concretas.
- **EmailNotificationFactory**, **SMSNotificationFactory**, **PushNotificationFactory** (Fábricas concretas): Cada uma dessas fábricas cria uma instância específica do tipo de notificação correspondente.
- **FactoryTest**: Testes unitários para garantir que as fábricas estão criando os objetos corretamente.

Como Funciona
1. Notificação (Produto):
- A interface Notification define o método send(), que deve ser implementado pelas classes concretas como EmailNotification, SMSNotification e PushNotification.
Cada tipo de notificação tem seu comportamento de envio de mensagens.
2. Fábrica Abstrata:
- A classe abstrata NotificationFactory define o método createNotification(), que será implementado pelas fábricas concretas para criar o tipo de notificação apropriado.
3. Fábricas Concretas:
- As fábricas concretas, como EmailNotificationFactory, SMSNotificationFactory e PushNotificationFactory, implementam o método createNotification() para criar instâncias específicas de EmailNotification, SMSNotification ou PushNotification.
4. Cliente:
- O cliente utiliza uma fábrica para criar instâncias de notificações sem precisar se preocupar com a criação direta do objeto concreto. Ele apenas interage com a interface Notification e chama o método send().
