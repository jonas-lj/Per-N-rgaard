# The Nørgård Palindrome

This code was used to compose the track "The Nørgård Palindrome" by Morten Bach ad Jonas Lindstrøm from the album [pieces of infinity 01](https://promo.theorchard.com/0VNkK7jSZSr7CQNGq4Ny?fbclid=IwAR396l5asHEt6SK-2kbKJ5-bzyQGoTGuIGytP26PBcd9UwPyqJs48Lf92Zg). It computes [Per Nørgårds Infinity Series](https://oeis.org/A004718) whichs was invented by the danish composer Per Nørgård. The numbers in the series is then mapped to musical notes according to a diatonic scale and the resulting tracks are saved as MIDI files.

The program may be built and run using Maven by executing `mvn install` to build and then `mvn exec_java`to run.

The MOSEF library is included as a submodule since this code depends on it. You may also clone it directly from [GitHub](https://github.com/jonas-lj/MOSEF).

![The first 160 notes in Per Nørgårds infinity series in C minor](https://raw.githubusercontent.com/jonas-lj/PerNoergaard/main/noergaard3.png)

*The first 160 notes in Per Nørgårds infinity series in C minor. *
