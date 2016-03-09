# java-test-workshop

    mkdir out
    javac -d out src/Location.java
    javac -d out -cp out;libs/junit-4.12.jar;libs/hamcrest-core-1.3.jar test/LocationTest.java
    java -cp out;libs/junit-4.12.jar;libs/hamcrest-core-1.3.jar org.junit.runner.JUnitCore com.zealake.workshop.LocationTest
