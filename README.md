# training-senang-pay-01

# Install SDKMan
Follow instruction on https://sdkman.io/install/

# Java Print (javap)
- To print Java class bytecode: javap -c MyFirstClassWithoutPackage

# GraalVM
- Enable JDK GraalVM: sdk use java 21.0.2-graalce
- Compile java class using: javac MyFirstClassWithoutPackage.java
- Create Native-Image using: native-image MyFirstClassWithoutPackage
- Run Native-Image: ./MyFirstClassWithoutPackage
