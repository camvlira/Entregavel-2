# Entregável 2 - Verificação de Número Primo

Aplicação Web desenvolvida em HTML, CSS e JavaScript para verificar se um número é primo.

## Estrutura do Projeto

```
Entregavel-2
│
├── index.html
├── style.css
├── script.js
└── README.md
```

## Tecnologias Utilizadas

- HTML5
- CSS3
- JavaScript
- Visual Studio Code
- GitHub

---

## Como executar o projeto

### 1. Baixar ou clonar o repositório

```bash
git clone https://github.com/camvlira/Entregavel-2.git
```

Ou faça o download dos arquivos.

---

### 2. Abrir o projeto no Visual Studio Code

Abra a pasta do projeto contendo:

- index.html
- style.css
- script.js

---

### 3. Executar a aplicação

Abra o arquivo `index.html` utilizando a extensão **Live Server**.

A aplicação será aberta no navegador.

Exemplo:

```
http://127.0.0.1:5500/index.html
```

---

## Funcionamento

1. Digite um número no campo de entrada.
2. Clique no botão **Verificar**.
3. O sistema informará se o número é primo ou não.

Exemplos:

- Entrada: `7`
- Saída: `O número 7 é primo.`

- Entrada: `10`
- Saída: `O número 10 não é primo.`

---

## Depuração (Debug)

Foram utilizados os seguintes recursos do Visual Studio Code:

### 1. Execução passo a passo
Utilização da ferramenta **Step Over (F10)** para executar o código linha por linha.

### 2. Step Into
Utilização da ferramenta **Step Into (F11)** para entrar na função `verificarPrimo()` sem utilizar breakpoint interno.

### 3. Modificação de variáveis
Alteração do valor da variável `n` através do **Debug Console**.

Exemplo:

```javascript
n = 10
```

### 4. Breakpoint condicional

Foi criado um breakpoint condicional com:

```javascript
i === 3
```

O programa pausa apenas quando essa condição é verdadeira.

---
