#include <stdio.h>

int main(int argc, char** argv) {
	FILE* f;
	int c = -1;
	int i = 0;
	int length = 6;
	char code[6] = {'e', 'd', 'f', 'g', 'o', 'h'};
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
	printf("%d", count);
	fclose(f);
	return 1;
}