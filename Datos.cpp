#include <iostream>
#include<stdlib.h>
#include<fstream>
#include<string.h>

using namespace std;



int main() {
	//-----------------------------------------------------------------------------------------------
	int notas [20][9];
	int notas_final [20][3];
	
	ofstream  doc ;
	
	doc.open("Texto.txt",ios::out);
	
	if(doc.fail()){
		
		cout<<"no se pudo abrir"<<endl;
		
		exit(1);
	}
	int dato =0;
	
	for(int i =0;i<20;i++){
		for (int x =0 ;x<9 ;x++){				
			dato= 1+rand()%(5);
			doc<<"  "<<dato;
			notas[i][x]=dato;
			if(x==2 || x==5 ){
				doc<<" ;";
			}
		}
		doc<<endl;
	}
	
	doc.close();
	
	//--------------------------------------------------------------------------------------------------
	int mate =0;
	int mate1 = 0;
	int mate2 = 0;
	
	for(int i = 0 ; i < 20 ; i++){
		for(int j = 0 ; j <9;j++){
		
			if(j==0  || j == 1 || j == 2 ){
				mate = mate+notas[i][j];
			}
			if( j ==3  || j == 4 || j == 5){
				mate1 = mate1+notas[i][j];
			}
			if(j==6 || j == 7 || j == 8){
				mate2 = mate2+notas[i][j];
			}			
	 	}
	}
	
	mate /= 60;
	mate1/= 60;
	mate2 /= 60;
	
	cout<<"El promedio de la materia 1 es  "<<mate<<endl;
	cout<<"El promedio de la materia 2 es  "<<mate1<<endl;
	cout<<"El promedio de la materia 3 es  "<<mate2<<endl;
	int cont1 =0;
	int cont2 =0;
	int cont3 =0;
	
	
	
	for(int i = 0 ; i < 20 ; i++){
		for(int j = 0 ; j <9;j++){		
			if(j==0  || j == 1 || j == 2 ){
				mate = mate+notas[i][j];
				
			}
			if( j ==3  || j == 4 || j == 5){
				mate1 = mate1+notas[i][j];
			}
			if(j==6 || j == 7 || j == 8){
				mate2 = mate2+notas[i][j];
			}			
	 	}
	 	if(mate/3>=3){
	 		cont1++;
		 }
		if(mate1/3 >=3){
			cont2++;
		 }
		if(mate2/3 >=3){
			cont3++;
		 }
		 
		 mate=0;
		 mate1=0;
		 mate2=0;
	}
	cout<<"La cantidad de estudiantes aprovados de la materia 1  es : "<<cont1<<endl;
	cout<<"La cantidad de estudiantes aprovados de la materia 2  es : "<<cont2<<endl;
	cout<<"La cantidad de estudiantes aprovados de la materia 3  es : "<<cont3<<endl;
	system("pause");
	return 0;
}


