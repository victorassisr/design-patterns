View in: [Portuguese](https://github.com/victorassisr/design-patterns#Portugues) or [English](https://github.com/victorassisr/design-patterns#English)

###### Portuguese

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


###### English

Design Patterns
Activity performed for the Systems Analysis and Development discipline. Where it was proposed:
Create a scenario and implement 3 design patterns studied in the room. The work can be paired and only one member of the pair should submit: Link to the project containing github commit source code. NOTE: There should be a readme.md file with a brief explanation of which design patterns were implemented and why they were useful in the chosen scenario. Hint: You can see that you committed what there on github.

The project created was the car rental where the default designs were used: Factory, State and Builder.

Factory
The design pattern factory was used to decrease system coupling. Where only the factory knows the cars to be instantiated and returns the correct instance to the orderer.

Builder
Design pattern buider was used to facilitate the instantiation of optional objects so as not to have to pass everything by parameter, where this would make it difficult to maintain the code.

State
The design pattern state was used to manage the rent status of: in progress or finalized, which consequently alters the behavior of calculating the total rent value based on the days of the rent.
