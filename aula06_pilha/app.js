// Criando uma pilha vazia
let pilha_prato = [];

// adicionando elementos

pilha_prato.push('Prato laranja');
pilha_prato.push('Prato verde');
pilha_prato.push('Prato azul');
pilha_prato.push('Prato vermelho');

// imprimir a pilha
console.log(pilha_prato);

// tamanho da pilha
let tam = pilha_prato.length;
console.log('O tamanho da pilha é: '+tam);

// verificando se a pilha está vazia (não tem funcao especifica)
let vazia = pilha_prato.length == 0;
console.log('A pilha está vazia '+vazia);

// acessando o topo da pilha(não tem funcao especifica)
// quantidade de elementos menos 1
let topo = pilha_prato[pilha_prato.length-1];
console.log('O elemento que está no topo: '+topo);

// removendo o elemento da pilha

let rem = pilha_prato.pop();
console.log('O elemento removido é: '+rem)

// percorrendo uma pilha
for (let i = pilha_prato.length-1; i>0; i--) {
    console.log(pilha_prato[i]);
}
