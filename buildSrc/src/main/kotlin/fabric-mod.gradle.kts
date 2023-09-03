plugins {
    id("kotlin-common")
    id("fabric-loom")
}

base {
    project.parent?.let {
        archivesName.set("${it.name}_${project.name}")
    }
}

loom {
    runConfigs.configureEach {
        ideConfigGenerated(false)
        runDir = "build/run"
    }
}

repositories {
    mavenLocal()
    maven {
        name = "GeckoLib"
        url = uri("https://dl.cloudsmith.io/public/geckolib3/geckolib/maven/")
    }
}

dependencies {
    // Fabric
    minecraft("com.mojang:minecraft:${properties["minecraft_version"]}")
    mappings("net.fabricmc:yarn:${properties["yarn_mappings"]}:v2")

    modImplementation("net.fabricmc:fabric-loader:${properties["loader_version"]}")
    modImplementation("net.fabricmc.fabric-api:fabric-api:${properties["fabric_version"]}")
}