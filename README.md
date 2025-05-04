# KSoup #119 reproducible example

This repository was created to make [#119](https://github.com/fleeksoft/ksoup/issues/119) reproducible.

It fetches a few pages, in a blocking and non-blocking way successively and measures the fetching time. 

## Running the example : 

```bash
$ ./gradlew run
```

## Results : 

* Running from IntelliJ locally on my MBP, JDK 23 and 0.2.3 Ksoup:

```bash
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
title: jlengrand (julien Lengrand-Lambert) · GitHub
time: 1.271144834s to fetch GitHub page blocking
title: Wikipedia:Getting to Philosophy - Wikipedia
time: 254.305875ms to fetch Wikipedia page blocking
title: Julien's DevRel corner
time: 827.103542ms to fetch blog page blocking
////
title: jlengrand (julien Lengrand-Lambert) · GitHub
time: 88.389959ms to fetch GitHub page blocking
title: Wikipedia:Getting to Philosophy - Wikipedia
time: 45.912583ms to fetch Wikipedia page
title: Julien's DevRel corner
time: 773.195333ms to fetch blog page

Process finished with exit code 0
```

* Running from gradlew locally on my MBP, JDK 23 and 0.2.3 Ksoup:

```bash
    ~/Developer/ksoup-test-119    main +15 !5  ./gradlew run                                                                                          1 ✘  11:32:00  

> Task :run
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
title: jlengrand (julien Lengrand-Lambert) · GitHub
time: 994.989958ms to fetch GitHub page blocking
title: Wikipedia:Getting to Philosophy - Wikipedia
time: 330.964750ms to fetch Wikipedia page blocking
title: Julien's DevRel corner
time: 901.669ms to fetch blog page blocking
////
title: jlengrand (julien Lengrand-Lambert) · GitHub
time: 115.398542ms to fetch GitHub page blocking
title: Wikipedia:Getting to Philosophy - Wikipedia
time: 55.240125ms to fetch Wikipedia page
title: Julien's DevRel corner
time: 249.742709ms to fetch blog page
```

* [Running from GitHub actions, JDK 23 and 0.2.3 Ksoup](https://github.com/jlengrand/ksoup-test-119/actions/runs/14819932018/job/41605487243):

```bash
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
title: jlengrand (julien Lengrand-Lambert) · GitHub
time: 1.201088714s to fetch GitHub page blocking
title: Wikipedia:Getting to Philosophy - Wikipedia
time: 200.333303ms to fetch Wikipedia page blocking
title: Julien's DevRel corner
time: 1.036201021s to fetch blog page blocking
////
title: jlengrand (julien Lengrand-Lambert) · GitHub
time: 70.013051ms to fetch GitHub page blocking
title: Wikipedia:Getting to Philosophy - Wikipedia
time: 46.619529ms to fetch Wikipedia page
title: Julien's DevRel corner
time: 278.211056ms to fetch blog page
BUILD SUCCESSFUL in 1m 49s
2 actionable tasks: 2 executed
```