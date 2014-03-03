#globals
default: build
freshen: clean build
clean: clean-specials
	rm -rf bin/*
clean-specials:
	rm -f $(jarfile)

#variables
cp = -cp src:bin:lib/*:lib/processing/*
dest = -d bin
docscp = -classpath src:bin:lib/*:lib/processing/*
documentation = -d javadoc
jarfile = library/cpgraphics.jar
version = -source 1.6 -target 1.6
warnings = -Xlint:-options
#warnings = -Xlint:-deprecation -Xlint:-options

#include files
include dependencies.mk
include lists.mk

#compilation definitions
$(class_files): bin/%.class : src/%.java
	javac $(cp) $(dest) $(version) $(warnings) $<

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
test: build jar
	pshell test

