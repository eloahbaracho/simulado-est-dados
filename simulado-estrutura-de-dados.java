package packageProva;

public class Pilha {
    Pilha pilha = new Pilha();
    pilha.empilhar("A");
    pilha.empilhar("B");
    pilha.empilhar("C");
    pilha.empilhar("D");
    System.out.printLn(pilha.topo());
    System.out.printLn(pilha.desempilhar()); //mostra o D e depois remove.
pilha.empilhar("X");
System.out.printLn(pilha.desempilhar());
System.out.printLn(pilha.topo()); 

// DDXC

//__________________________________________________________
Pilha pilha = new Pilha();
pilha.empilhar("A");
pilha.empilhar("B");
pilha.empilhar("C");
pilha.empilhar("D");
pilha.empilhar("E");
pilha.empilhar("F");

while(pilha.desempilhar()!=null { //desempilha sem imprimir
System.out.printLn(pilha.topo()); //mostra o topo desempilhado
System.out.printLn(pilha.desempilhar()); //mostra o topo e desempilha
	}
}

//A A, B B, C C, E E 

//___________________________________________________________

public class xxxx {
	public static void main(String... args) {
	int num = 5;
	int resultado = misterioTotal(num);
	System.out.printLn(resultado + "");
	}
public static int misterioTotal (int n) { //NUM CAIU AQUI NO INT N 
	if (n == 0) {
	return 1;
} else { 
	return n * misterioTotal (n-1); // 5 * mt(4);
	}                               // 5 * mt(3);
 					// 5 * mt(2);
					// 5 * mt(1);
					// 56 * mt(0);
					// 5 * 24
}


//_____________________________________________________________

public class lista {
long tamanho;
No inicio;
No fim;

Lista() {
tamanho = 0;
inicio = null;
fim = null;
}

----------
void adicionar(Object info) {
No no = new No(info);
if(estaVazia()) {
	inicio = no;
}
fim= no;
tamanho++;
}
-----------

void adicionar(Object info) {
	No no = new No(info);
	if(estaVazia()) {
		inicio = no;
}

else {
fim.prox = no;
}
fim = no;
tamanho++;
}
----------

void adicionar(Object info) {
No no = new No(info); 
fim = no;
if(estaVazia()) {
inicio = no; 
}
else { 
	fim.prox = no;
} 
tamanho++;
}

publick class Stack {
	public static void main(String... args) {
			Pilha pilha = new Pilha();
			pilha.add("A");
			pilha.add("B");
			pilha.add("C");
			pilha.add("D");
			pilha.add("E");
			
			System.out.printLn("Pilha: " + pilha);
			boolean subtracao = pilha.remover("E");
			System.out.printLn("Foi removido um elemento da pilha: " + subtracao);
			System.out.printLn("Pilha final: " + pilha);
----------------------------------------------------------------------------
Stack remove =======
// Java code to illustrate remove() when position of
// element is passed as parameter
  
import java.util.*;
  
public class StackDemo {
    public static void main(String args[])
    {
  
        // Creating an empty Stack
        Stack<String> stack = new Stack<String>();
  
        // Use add() method to add elements in the Stack
        stack.add("Geeks");
        stack.add("for");
        stack.add("Geeks");
        stack.add("10");
        stack.add("20");
  
        // Output the Stack
        System.out.println("Stack: " + stack);
  
        // Remove the element using remove()
        boolean res = stack.remove("20");
  
        // Print the removed element
        System.out.println("Was 20 removed: "
                           + res);
  
        // Print the final Stack
        System.out.println("Final Stack: "
                           + stack);
    }
} 
------------------------------------
	
Pilha pilhaAUX = new Pilha();
while (pilhax.estavazia() == false) {
	object info = pilhax.desempilhar();
	pilhaaAUX.emp(info);
}
			
