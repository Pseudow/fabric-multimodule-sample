plugins {
    `fabric-root-project`
}

group = "net.pseudow.fabric"
version = "1.0.0"


dependencies {
    implementation(project(":common-mod", configuration = "namedElements"))
    implementation(project(":client-mod", configuration = "namedElements"))
    implementation(project(":server-mod", configuration = "namedElements"))
}