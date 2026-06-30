# Historico de evolucao - JavaNinja

Este arquivo registra os check-ins dos desafios feitos em `NexusDesafios`.

Objetivo:

- Entender sua evolucao real.
- Identificar onde voce trava com frequencia.
- Separar pratica extra da progressao oficial do curso.
- Escolher o proximo desafio com base no seu nivel atual.

## Como usar

Depois de cada desafio, registre um check-in com:

- Desafio feito.
- Onde travou.
- O que aprendeu.
- O que precisa revisar.
- Proximo desafio recomendado.

## Modelo de check-in

```md
## Check-in - AAAA-MM-DD

### Desafio feito

-

### Onde travei

-

### O que aprendi

-

### O que preciso revisar

-

### Proximo desafio recomendado

-

### Observacoes do codigo

-
```

## Check-ins

### Check-in - 2024-05-22

#### Desafio feito
*   **Dia 3: Herança entre clãs.**
*   Criada a classe base `Ninja` e as classes filhas `Uchiha`, `Uzumaki` e `Hyuga`, cada uma com sua própria implementação do método `habilidadeEspcecial()`.

#### Onde travei
*   A dúvida não foi na implementação, mas em como ver o poder do polimorfismo em ação. O "clique" veio ao entender como usar um laço `for` para tratar todos os ninjas da mesma forma (`Ninja`), mas ainda assim obter o comportamento específico de cada clã.

#### O que aprendi
*   Aplicação prática de **Herança** (`extends`), **Sobrescrita** (`@Override`) e o uso de `super()` nos construtores para reutilizar código da classe pai.
*   O conceito fundamental de **Polimorfismo**: a capacidade de tratar objetos de classes diferentes (Uchiha, Uzumaki) como se fossem do mesmo tipo (Ninja).
*   A sintaxe para demonstrar o polimorfismo de forma concisa: `for (Ninja ninja : new Ninja[]{...})`, que permite chamar o mesmo método (`ninja.habilidadeEspcecial()`) e obter resultados diferentes.

#### O que preciso revisar
*   Continuar aplicando o polimorfismo em cenários mais complexos para solidificar o conceito.

#### Proximo desafio recomendado
*   **Dia 4: Treino com interfaces.**
*   O próximo passo lógico é explorar outra forma de polimorfismo. As interfaces permitem que classes diferentes (que não precisam ser da mesma família de herança) compartilhem um "contrato" de comportamento. Por exemplo, como um `Uchiha` e um `Hyuga` podem ter uma `SensorialInterface`, mas um `Uzumaki` não?

### Check-in - 2024-05-21 (Refatoração)

#### Desafio feito
*   **Dia 7: Revisão e Refatoração.**
*   Refatorado o `DesafioDia1` para substituir o `Ninjas[]` (array estático) por um `ArrayList<Ninjas>`.

#### Onde travei
*   A principal dificuldade foi entender a sintaxe correta para acessar os objetos dentro do `ArrayList` em um laço `for`, diferenciando `.get(index)` (para ler) de `.set()` (para modificar).

#### O que aprendi
*   Aplicação prática de `ArrayList` com objetos complexos.
*   Como usar `.size()` para controlar laços e `.get(i)` para acessar cada objeto.
*   A importância de remover código obsoleto (como a variável `contador`) após a refatoração.
*   O código ficou mais limpo e robusto, sem a limitação de tamanho do array.

#### O que preciso revisar
*   Continuar praticando a manipulação de `ArrayLists`, talvez com outros métodos como `.remove()` dentro de um laço.

#### Proximo desafio recomendado
*   **Dia 3: Herança entre clãs.**
*   Criar uma classe base `Ninja` e classes filhas (`Uchiha`, `Uzumaki`, `Hyuga`) para praticar herança e polimorfismo, conforme descrito no `desafios-diarios.md`.

### Check-in - 2024-05-21

#### Desafio feito
*   Estudo e prática dos métodos básicos de `ArrayList` (`add`, `remove`, `set`, `size`) em `NivelIntermediario/ArrayList/Main.java`.

#### Onde travei
*   A dificuldade não foi no `ArrayList` em si, mas na manipulação de arrays com laços `for`, que é um ponto de confusão recorrente.

#### O que aprendi
*   A diferença prática entre `Array` (tamanho estático) e `List` (tamanho dinâmico).
*   A conveniência do `ArrayList` para adicionar e remover elementos sem gerenciamento manual de tamanho.

#### O que preciso revisar
*   Praticar o uso de laços (`for`, `for-each`) para percorrer e manipular elementos em `Arrays` e `ArrayLists`.
*   Revisão geral dos conceitos de POO vistos até o momento para fortalecer a mentalidade de programador.

#### Proximo desafio recomendado
*   **Refatorar o `DesafioDia1` (Cadastro de Ninjas):** Substituir o `Ninjas[]` (array estático) por um `ArrayList<Ninjas>`. Isso eliminará o limite de 10 ninjas e permitirá a prática de manipulação de listas com objetos complexos.

### Check-in - 2026-06-15

#### Desafio feito

- Preparacao inicial da estrutura `NexusDesafios`.
- Criadas as pastas `desafios/`, `exercicios/` e `revisoes/`.
- Criado o arquivo `desafios/desafios-diarios.md` com a primeira semana de desafios.

#### Onde travei

- Ainda nao houve desafio de codigo neste check-in.

#### O que aprendi

- A pratica extra ficara separada dos exercicios oficiais do curso.
- O historico de evolucao sera usado para acompanhar padroes de dificuldade.

#### O que preciso revisar

- Manter os desafios feitos dentro de `NexusDesafios/`.
- Registrar check-in depois de cada desafio.

#### Proximo desafio recomendado

- Dia 1: Cadastro de ninjas com validacao.

#### Observacoes do codigo

- Nenhum codigo revisado ainda.