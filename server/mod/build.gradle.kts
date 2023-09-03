plugins {
    `fabric-mod`
}

group = "net.pseudow.fabric.server.mod"

dependencies {
    api(project(":server-api", configuration = "namedElements"))
    compileOnly(project(":common-mod", configuration = "namedElements"))
}