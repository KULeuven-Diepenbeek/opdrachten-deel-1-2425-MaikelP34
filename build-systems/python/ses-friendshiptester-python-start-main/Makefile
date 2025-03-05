FILE = app

compile:
	@echo "Compileren..."
	pyinstaller --onefile --name $(FILE).bin $(FILE).py
	@echo "Gedaan!"

run:
	@echo "Run Forest run!"
	./dist/$(FILE).bin
	@echo "Forest is moe."

clean:
	@echo "Cleaning..."
	rm -rf build $(FILE).spec __pycache__
	rm -rf dist/*
	@echo "Cleaned!"

test:
	@echo "Testing..."
	python3 $(FILE).py
	@echo "Tests voltooid!"