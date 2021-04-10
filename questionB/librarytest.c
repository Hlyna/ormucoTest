#include "code.h"
#include <stdio.h>


int main(int argc, char **argv){
	if(argc>0) {

		if(affiche(argv[1],argv[2]) == 1) printf("%s is greater than %s\n",argv[1],argv[2]);
		if(affiche(argv[1],argv[2]) == -1) printf("%s is less than %s\n",argv[1],argv[2]);
		if(affiche(argv[1],argv[2]) == 0) printf("%s is equal to %s\n",argv[1],argv[2]);
	}
}