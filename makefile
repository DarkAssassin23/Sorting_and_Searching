JAR = 'Sorting_and_Searching.jar'
JC = javac
MAIN = SortAndSearchMain 

JCFLAGS = -d $(BINDIR)

#Class Files Directory
BINDIR = bin

#Source Files
SRCS = $(wildcard *.java)

#Class Files
CLS = $(patsubst %.java, $(BINDIR)/%.class, $(SRCS))

default: jar
all: jar

$(CLS): $(BINDIR)/%.class: %.java
	@mkdir -p $(@D)
	$(JC) $(JCFLAGS) $<
	
jar: $(CLS)
	jar cfe $(JAR) $(MAIN) -C $(BINDIR) .
	
clean:
	$(RM) -r $(BINDIR) $(JAR)
