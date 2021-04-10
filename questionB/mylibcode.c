#include "code.h"
#include<string.h>


int affiche(char *string1, char *string2){
	if(string1<string2) return -1;
	if(string1>string2) return 1;
	return 0;
}