all: Stella/TestStella Interpreter

Stella/TestStella: ../Stella.cf
	mkdir -p Stella/
	cd Stella/ && (bnfc -m --cpp ../../Stella.cf -l -p Stella; cd ../)
	cd Stella/ && (make; cd ../)

Interpreter:
	cmake -S. -Bbuild
	cmake --build build/ --target Interpreter --
