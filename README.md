# Design Patterns

### Atividade realizada para a disciplina de Análise e Desenvolvimento de Sistemas. Onde foi proposto:

* Criar um cenário e implementar 3 design patterns estudados em sala. O trabalho pode ser em dupla e apenas um dos membros da dupla deve enviar: Link para o projeto contendo código fonte commitado no github. OBS: Deve haver um arquivo readme.md com a explicação sucinta de quais design patterns foram implementados e porque eles foram úteis no cenário escolhido. Dica: Da pra ver que comitou o quê lá no github.

* O projeto criado foi o aluguel de carros onde foi utilizado os designs patterns: Factory, State e Builder.

```
Factory
```
Foi utilizado o design pattern factory para diminuir o acoplamento do sistema. Onde somente a factory conhece os carros a ser instanciados e devolve a instância correta à quem pedir.

```
Builder
```
Foi utilizado o design pattern buider para facilitar a instanciação de objetos opcionais para não ter que passar tudo por parâmetro,onde isso dificultaria na manutenibilidade do código.

```
State
```
Foi utilizado o design pattern state para gerenciar o estado do aluguel de: em andamento ou finalizado, onde consequentemente altera o comportamento de realizar o calculo de valor total do aluguel baseado nos dias do aluguel.
