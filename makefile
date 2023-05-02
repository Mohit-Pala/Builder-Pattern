# makefile modified from softgel pills assignment makefile

JFLAGS = -d bin -sourcepath src

default: 
	@echo "usage: make target"
	@echo "3 available targets: clean - removes editor tmpfiles and .class files"
	@echo "____________________ compile - builds codebase"
	@echo "____________________ demo - runs demo (client)"
	@echo "Just starting with make? Try these 3 make commands successively:"
	@echo "________ make clean ; make compile ; make demo"

compile: 
	javac $(JFLAGS) -cp .: src/**/**/*.java

demo: bin/client/Demo.class
	java -cp .:bin client/Demo

clean:
	rm -f ./bin/**/*.class
