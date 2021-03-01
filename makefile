BIN=bin

all: clear folders compile
	@echo "Compilando..."

compile:
	javac -d $(BIN) ./*.java

folders:
	@if [ ! -d $(BIN) ]; then \
		mkdir $(BIN); \
	fi

clear:
	@if [ -d $(BIN) ]; then \
		rm -rf $(BIN); \
	fi