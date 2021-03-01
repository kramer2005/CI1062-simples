BIN=bin

all: clear folders compile

compile:
	@echo "Compilando..."
	@javac -d $(BIN) ./*.java
	@echo "Compilação concluída"

folders:
	@if [ ! -d $(BIN) ]; then \
		mkdir $(BIN); \
	fi

clear:
	@if [ -d $(BIN) ]; then \
		rm -rf $(BIN); \
	fi