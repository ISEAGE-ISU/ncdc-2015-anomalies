#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv){
	if(argc==0){
		int num=0;
		printf("%d\n", &num);
	}
	else{
		int num=argc+1337;
		num=num*2063;
		num=num%73;
		printf("%d\n", num);
	}
	return 0;
}
