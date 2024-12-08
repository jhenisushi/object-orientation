# Runtime Exception

Throwable is the superclass of all errors and exceptions in the Java language. Only objects that are instances of this 
class (or one of its subclasses) are thrown by the Java Virtual Machine or can be thrown by the Java throw statement. 
Similarly, only this class or one of its subclasses can be the argument type in a catch clause.

Instances of two subclasses, Error and Exception, are conventionally used to indicate that exceptional situations have
occurred. Error is used to indicate those serious problems that an application should not catch. Exception is used to
indicate conditions that an application should catch.

RuntimeException is a subclass of Exception. It is used for exceptions that can be thrown during the normal operation of
the Java Virtual Machine. These exceptions are called runtime exceptions. They do not need to be declared in a method's
throws clause, and they do not need to be caught. Although it is possible to catch them, it is not considered good
programming practice to do so. A runtime exception is thrown when the Java Virtual Machine detects an error at runtime.

Checked exceptions are exceptions that the compiler forces you to catch or declare. IOException is a checked exception.
Unchecked exceptions are exceptions that the compiler does not force you to catch or declare. RuntimeException is an
unchecked exception.

So like the name suggests, RuntimeException is a type of exception that occurs during the runtime of the program. It is
not checked by the compiler, so the compiler does not force you to catch or declare it. It is not considered good
programming practice to catch a runtime exception. It is better to prevent them from happening in the first place.

