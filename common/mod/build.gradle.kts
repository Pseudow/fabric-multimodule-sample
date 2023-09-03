plugins {
    `fabric-mod`
}

group = "net.pseudow.fabric.commons"

dependencies {
    modApi("software.bernie.geckolib:geckolib-fabric-${properties["minecraft_version"]}:${properties["geckolib_version"]}")
}