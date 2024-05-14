plugins {
    kotlin("jvm") version "1.9.24"
    `project-report`
    `maven-publish`
}

group = "com.example.jackson217"

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
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.17.1")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
}
