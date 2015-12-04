# sample

Download sample project then import this project to eclipse, closed bar project then run `FooApplication` you could get below error
```
Caused by: java.lang.LinkageError: loader constraint violation: loader (instance of org/springframework/boot/devtools/restart/classloader/RestartClassLoader) previously initiated loading for a different type with name "org/dozer/DozerBeanMapper"
	at java.lang.ClassLoader.defineClass1(Native Method) ~[na:1.8.0_51]
	at java.lang.ClassLoader.defineClass(ClassLoader.java:760) ~[na:1.8.0_51]
```

Note you should cd into bar project and execute `mvn clean install` first.
