FROM  maven:3.6-jdk-14
LABEL maintainer EJANGUE (ejemaster@gmx.de)

COPY pom.xml/ /tmp
COPY src/main/java/org/i9Bach/mathUtils/Main.java /tmp
COPY src/main/java/org/i9Bach/mathUtils/Mathutils.java /tmp
COPY src/test/java/org/i9Bach/mathUtils/MathutilsTest.java /tmp
ADD /target/Mathlib-0.0.1-SNAPSHOT.jar /tmp
WORKDIR  /tmp
COPY target/Mathlib-0.0.1-SNAPSHOT.jar  /tmp
# COPY ./target/Mathlib-0.0.1-SNAPSHOT.jar/ /tmp
# WORKDIR /tmp
# EXPOSE 8085
# ENTRYPOINT ["java","-jar","Mathlib-0.0.1-SNAPSHOT.jar"]
CMD ["java","-jar","Mathlib-0.0.1-SNAPSHOT.jar"]

