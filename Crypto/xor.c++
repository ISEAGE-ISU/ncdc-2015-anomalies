#include <stdio.h>

int main(int argc, char** argv) {
	FILE* f;
	int c = -1;
	int i = 0;
	int length = 4;
	char code[4] = {'a', 'b', 'd', 'd'};
	f = fopen(argv[1], "r");
	int count = 0;
	for (int j = 0; j < 2063; j++) {
		c = getc(f);
		printf("%c", c^code[i]);
		i++;
		if (i >= length) {
			i -= length;
		}
		count++;
		fflush(stdout);
	}
	fclose(f);
	return 1;
}