# Desafios diarios - JavaNinja

Use estes desafios para treinar logica de programacao sem misturar com a progressao oficial do curso.

Nivel atual de referencia:

- Arrays, condicionais, repeticao, scanner e switch.
- Classes, construtores, encapsulamento e enums.
- Heranca, polimorfismo, interfaces, classes abstratas, sobrecarga e final methods.

## Semana 1

### Dia 1 - Cadastro de ninjas com validacao

Crie um pequeno sistema em Java para cadastrar 3 ninjas.

Requisitos:

- Cada ninja deve ter nome, idade, aldeia e rank.
- Use `enum` para representar o rank.
- Nao permita idade menor que 0.
- Mostre uma lista final com os ninjas cadastrados.

Foco: classe, construtor, enum, validacao e array/lista.

### Dia 2 - Sistema de missoes

Crie classes para representar ninjas e missoes.

Requisitos:

- Uma missao tem nome, dificuldade e recompensa.
- Um ninja so pode aceitar missoes de acordo com seu rank.
- Use condicionais para validar se a missao pode ser aceita.

Foco: if/else, regra de negocio simples e composicao entre classes.

### Dia 3 - Heranca entre cla

Crie uma classe base `Ninja` e classes filhas como `Uchiha`, `Uzumaki` e `Hyuga`.

Requisitos:

- Cada classe filha deve ter uma habilidade propria.
- Use sobrescrita de metodo para exibir a habilidade principal.
- No `main`, crie objetos diferentes e chame o mesmo metodo.

Foco: heranca, sobrescrita e polimorfismo.

### Dia 4 - Treino com interfaces

Crie interfaces como `SharinganInterface` ou `SensorialInterface`.

Requisitos:

- Pelo menos duas classes devem implementar interfaces diferentes.
- Uma classe pode implementar mais de uma interface.
- Demonstre o comportamento no `main`.

Foco: contrato, implementacao e heranca multipla via interfaces.

### Dia 5 - Banco de Konoha simplificado

Crie um sistema simples de contas.

Requisitos:

- Classe abstrata `Conta`.
- Classes `ContaCorrente` e `ContaPoupanca`.
- Metodos para depositar, sacar e mostrar saldo.
- Use sobrescrita para regras diferentes de saque.

Foco: classe abstrata, heranca, encapsulamento e polimorfismo.

### Dia 6 - Estrategia de batalha

Crie uma estrutura para escolher estrategias de batalha.

Requisitos:

- Use `enum` para tipo de estrategia.
- Crie um metodo `final` que calcula ou exibe uma regra fixa da batalha.
- Crie classes filhas que personalizam apenas o que pode mudar.

Foco: final methods, enum, heranca e limites de sobrescrita.

### Dia 7 - Revisao e refatoracao

Escolha um desafio da semana e melhore o codigo.

Checklist:

- Renomeie classes/metodos pouco claros.
- Reduza repeticao.
- Separe responsabilidades.
- Escreva no arquivo de revisao o que voce entendeu e onde ainda travou.

Foco: revisao, leitura de codigo e melhoria incremental.
