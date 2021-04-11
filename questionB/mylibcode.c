#include "code.h"
#include <stdlib.h>
#include <stdio.h>
#include <string.h>







int compare(char *string1, char *string2){
	
	if (string1[0] - '0' < 0 || (int)string1[0] - '0'> 9 || string2[0]-'0' < 0 || string2[0]-'0' > 9) {
		return -1;
	}

	double x1 = atof(string1);
	double x2 = atof(string2);
	if(x1<x2) return 0;
	if(x1>x2) return 2;
	return 1;
}