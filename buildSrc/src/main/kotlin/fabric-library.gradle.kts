import org.gradle.kotlin.dsl.`maven-publish`

plugins {
    id("fabric-mod")
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group as String
            artifactId = project.name
            version = project.version as String

            pom {
                name.set(project.base.archivesName)
                description.set("Inworld SDK used in Kotlin/Java platform")

                developers {
                    developer {
                        // never copy/paste always read before, or else you are gay
                        id.set("pseudow")
                        name.set("Nathan OGUETON")
                        url.set("https://github.com/Pseudow")
                    }
                }
            }

            from(components["java"])
        }
    }
}