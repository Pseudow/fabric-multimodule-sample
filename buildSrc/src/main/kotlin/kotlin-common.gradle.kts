plugins {
    kotlin("jvm")
    java
}

kotlin {
    jvmToolchain(17)
}

java {
    withSourcesJar()
    withJavadocJar()

    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


tasks.jar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}