public class Ej5R {
}


/*
//Se debe crear una matriz con las siguientes palabras como se muestra a continuación. Luego de
//eso debemos acomodar las palabras para que la primera letra "R" de cada una quede en la
//posición 5, alineándose.

Algoritmo Guia05_Encuentro22_25_EjCooperativo
	Definir matriz, vector, palabra Como Cadena
	Definir fil, col, x, vecPos Como Entero
	fil <- 9
	col <- 12
	Dimension matriz[fil,col]
	Dimension vector[fil], vecPos[fil]

	inicializarMatriz(matriz, fil, col)

	imprimirMatriz(matriz, fil, col)
	Mostrar ""

	vector[0] <- "VECTOR"
	vector[1] <- "MATRIX"
	vector[2] <- "PROGRAMA"
	vector[3] <- "SUBPROGRAMA"
	vector[4] <- "SUBPROCESO"
	vector[5] <- "VARIABLE"
	vector[6] <- "ENTERO"
	vector[7] <- "PARA"
	vector[8] <- "MIENTRAS"

	Para x<-0 Hasta fil-1 Hacer
		palabra<-vector[x]
		agregarPalabra(matriz, x, palabra, col)
	Fin Para

	Para x<-0 Hasta fil-1 Hacer
		vecPos[x]<-buscarR(matriz, x, col)
		//Mostrar vecPos[x] Sin Saltar
	Fin Para

	acomodarPalabra(matriz, fil, col)

	imprimirMatriz(matriz, fil, col)
	Mostrar ""
FinAlgoritmo


//subprograma inicializarMatriz:
//Debe recibir como parámetros la matriz a inicializar, la cantidad de filas y la cantidad de columnas.
//En primera instancia inicializaremos la matriz con un "*" (asterisco) en cada lugar para que la
//misma no esté vacía y no tengamos problemas.
//
SubProceso  inicializarMatriz(matriz, fil, col)
	Definir i, j Como Entero
	Para i<-0 Hasta fil-1 Hacer
		Para j<-0 Hasta col-1 Hacer
			matriz[i,j] <- "*"
			//Mostrar " ", matriz[i,j], " " Sin Saltar
		Fin Para
		//Mostrar ""
	Fin Para
FinSubProceso

//subprograma imprimirMatriz:
//Debe recibir como parámetros la matriz a imprimir, la cantidad de filas y la cantidad de columnas.
//Para que veamos la matriz en la consola cuando lo necesitemos.
//Tengamos en cuenta que para que no queden pegadas las letras vamos a imprimir un espacio, la
//letra y otro espacio. Lo hacemos en imprimir para no modificar el contenido de la matriz.
//Ambos subprogramas son similares al ejercicio 8 de la guía.
//
SubProceso  imprimirMatriz(matriz, fil, col)
	Definir i, j Como Entero
	Para i<-0 Hasta fil-1 Hacer
		Para j<-0 Hasta col-1 Hacer
			Mostrar " ", matriz[i,j], " " Sin Saltar
		Fin Para
		Mostrar ""
	Fin Para
FinSubProceso

//subprograma agregarPalabra:
//Se le debe indicar en los parámetros la matriz donde se va a agregar la palabra, la fila en la que se
//agregará y la propia palabra. Una vez el subprograma reciba eso debe descomponer la palabra y
//agregarla a la matriz en la posición deseada.
//Similar al ejercicio 12 de la guía.
//
SubProceso agregarPalabra(matriz, x, palabra, col)
	Definir j Como Entero
	Para j<-0 Hasta col-1 Hacer
		Si Subcadena(palabra,j,j)<>"" Entonces
			matriz[x,j] <- Subcadena(palabra,j,j)
		SiNo
			matriz[x,j] <- "*"
		Fin Si
	Fin Para
FinSubProceso

//subprograma buscarR:
//Se le debe indicar la matriz donde se buscará la letra R y el número de fila en el que buscaremos.
//Debe comparar cada letra de la fila indicada hasta que encuentre la primera letra ?R?. Ahí debe
//devolvernos la posición de ?R?.
//Nota: cuidado! debe devolver la posición de la primera R solamente.
//Aquí podemos usar principios que usamos en el ejercicio 5
//
Funcion retorno <- buscarR(matriz, x, col)
	Definir retorno, contador Como Entero
	Definir flag Como Logico
	flag <- Falso
	contador<-0
	Repetir
		Si matriz[x,contador]=="R" Entonces
			retorno<-contador
			flag<-Verdadero
		SiNo
			contador<-contador+1
		Fin Si
	Hasta Que flag==Verdadero O contador>=col
FinFuncion


//subprograma acomodarPalabra:
//Se le debe indicar sólo la matriz en donde se acomodarán las palabras.
//Ahora debemos crear una lógica que nos permita mover las palabras de las filas. Recordar que
//podemos llamar a buscarR para saber cuántos espacios hay que mover las palabras.
//Una vez que las palabras se muevan hay que llenar los espacios con asteriscos nuevamente: es
//decir, si la palabra se mueve dos posiciones a la derecha hay que agregar dos asteriscos a la
//izquierda de la fila.
//
//Nota: ¡recuerden que la primera letra ?R? debe quedar en la posición 5 de la matriz! Ya sabemos
//en qué posición se encuentra ?R? así que sólo debemos llevarla a la posición 5 corriendo toda la
//palabra.
SubProceso acomodarPalabra(matriz, fil, col)
	Definir i, j, posicionR Como Entero
	Definir matrizAux Como Caracter
	Dimension matrizAux[fil,col]
	Para i<-0 Hasta fil-1 Hacer
		posicionR<-buscarR(matriz, i, col)
		Para j<-0 Hasta col-1 Hacer
			Si j<5-posicionR Entonces
				matrizAux[i,j]<-"*"
			SiNo
				matrizAux[i,j]<-matriz[i,(j-(5-posicionR))]
			Fin Si
		Fin Para
	Fin Para
	Para i<-0 Hasta fil-1 Hacer
		Para j<-0 Hasta col-1 Hacer
			matriz[i,j]<-matrizAux[i,j]
		Fin Para
	Fin Para
FinSubProceso

*/