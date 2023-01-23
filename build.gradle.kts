plugins {
    id("org.springframework.boot")version("2.5.6")
    id("io.spring.dependency-management")version("1.0.11.RELEASE")
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    implementation("org.springframework.boot:spring-boot-starter-security")

    implementation("com.h2database", "h2", "1.4.200" )
    implementation("org.jsoup","jsoup","1.7.2")
    implementation("org.apache.commons","commons-collections4","4.3")
    implementation("io.jsonwebtoken","jjwt","0.9.1")

    compileOnly("org.projectlombok", "lombok", "1.18.22")
    annotationProcessor("org.projectlombok", "lombok","1.18.22")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")



}


tasks.getByName<Test>("test") {
    useJUnitPlatform()
}