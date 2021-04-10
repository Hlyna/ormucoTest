CC = gcc
standard = -Wall -Wextra 


all : librarytest

librarycode.o: mylibcode.c code.h
	$(CC) $(standard) -c mylibcode.c

librarytest: librarytest.c mylibcode.o
	$(CC) $(standard) -o $@ $^


clean :
	rm -f *.out
	rm -f *.o