#globals
default: build
freshen: clean build
clean: clean-specials
	rm -rf bin/*
clean-specials:
	rm -f library/*.jar

#variables
cp = -cp bin:lib/processing/*
dest = -d bin
jarfile = library/pgdsr.jar
version = 0.0.1
java_version = -source 1.6 -target 1.6
warnings = -Xlint:-options
#warnings = -Xlint:-deprecation -Xlint:-options

#include files
include dependencies.mk
include lists.mk

#compilation definitions
$(class_files): bin/%.class : src/%.java
	javac $(cp) $(dest) $(java_version) $(warnings) $<

#basic commands
build: $(class_files)

jar: $(jarfile)
$(jarfile): build
	jar cf $(jarfile) -C bin kiwi

#extra commands
git-prepare:
	git add -u
	git add -A

#test commands
test-gl: build jar
	pshell testgl
test-gl-a: build jar
	pshell -a testgl
test-3d: build jar
	pshell test3d
test-3d-a: build jar
	pshell -a test3d
