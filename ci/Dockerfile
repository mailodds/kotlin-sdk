FROM docker.io/library/gradle:8-jdk21-alpine
WORKDIR /sdk
COPY . .
RUN gradle build -x test --quiet
RUN echo 'task copyDeps(type: Copy) { from configurations.runtimeClasspath; into "build/deps" }' >> build.gradle && gradle copyDeps --quiet
RUN mkdir -p /smoke && javac -cp "build/libs/*:build/deps/*" -d /smoke ci/SmokeTest.java
CMD ["java", "-cp", "/smoke:/sdk/build/libs/*:/sdk/build/deps/*", "ci.SmokeTest"]
