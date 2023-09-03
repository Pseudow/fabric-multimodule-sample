plugins {
    `fabric-mod`
}

group = "net.pseudow.fabric.client.mod"

dependencies {
    api(project(":client-api", configuration = "namedElements"))
    compileOnly(project(":common-mod", configuration = "namedElements"))
}