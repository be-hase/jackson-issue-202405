plugins {
    kotlin("jvm") version "1.9.24"
    `project-report`
    `maven-publish`
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
        vendor = JvmVendorSpec.ADOPTIUM
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    // jackson 2.15.4 is enforced
    // ref: https://repo1.maven.org/maven2/org/springframework/boot/spring-boot-dependencies/3.2.5/spring-boot-dependencies-3.2.5.pom
    implementation(enforcedPlatform("org.springframework.boot:spring-boot-dependencies:3.2.5"))

    implementation(project(":jackson217"))
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}
