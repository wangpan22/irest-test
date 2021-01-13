FROM maven:ppc64le as builder
WORKDIR /build/
# copy these two for now, may need to copy all
#COPY . /build/
COPY pom.xml /build/
COPY src /build/src/
# build and package, note unit test will be run
RUN mvn package

# build iRest app image
FROM websphere-liberty:20.0.0.12-full-java8-ibmjava
COPY --chown=1001:0 --from=builder  /build/target/iRest.war /config/dropins/
RUN configure.sh