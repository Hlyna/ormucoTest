#include "code.h"
#include <stdio.h>
#include<assert.h>


int main(int argc, char **argv){
	if( argc > 0 ) {

		assert(0 == compare("1.2", "3.2"));
  		assert(2  == compare("7.99","0"));
  		assert(1  == compare("1.2", "1.20"));
  		assert(-1 == compare(".", "1.20"));


		if(compare(argv[1],argv[2]) == 1) printf("%s is greater than %s\n",argv[1],argv[2]);
		if(compare(argv[1],argv[2]) == -1) printf("%s is less than %s\n",argv[1],argv[2]);
		if(compare(argv[1],argv[2]) == 0) printf("%s is equal to %s\n",argv[1],argv[2]);
	
	}
}