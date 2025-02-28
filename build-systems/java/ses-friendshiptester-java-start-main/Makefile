
MAINCLASS = App
JAR = app.jar

compile:
	@echo "Compileren..."
	javac -d ./build *.java
	@echo "Gedaan!."

clean:
	@echo "Even poetsen."
	-rm -R ./build/*
	@echo "Tis proper nu."

run: 
	@echo "Het loopt ze, gene paniek. $(JAR) ...\n---------------"
	@cd ./build && java -cp "$(JAR)" $(MAINCLASS)
	@echo "---------------\nTis alweer gedaan."

jar:
	@echo "Ik ben aant inpakken."
	cd ./build && jar cvfe $(JAR) $(MAINCLASS) *
	@echo "Tis ingepakt!"

make: 
	
	@echo "Even poetsen."
	-rm -R ./build/*
	@echo "Tis proper nu."
	
	@echo "Compileren..."
	javac -d ./build *.java
	@echo "Gedaan!."

	@echo "Ik ben aant inpakken."
	cd ./build && jar cvfe $(JAR) $(MAINCLASS) *
	@echo "Tis ingepakt!"
	
	@echo "Het loopt ze, gene paniek. $(JAR) ...\n---------------"
	@cd ./build && java -cp "$(JAR)" $(MAINCLASS)
	@echo "---------------\nTis alweer gedaan."