JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = product.java officeChair.java officeDesk.java meetingTable.java bookcase.java officeCabinet.java automationSystem.java admin.java branchEmployee.java customer.java driver.java

default: classes

classes: $(CLASSES:.java=.class)
	java driver

clean:
	$(RM) *.class
