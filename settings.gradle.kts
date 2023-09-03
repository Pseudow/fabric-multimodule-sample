rootProject.name = "fabric-multimodule-project"

includeSubProjects("common")
includeSubProjects("client")
includeSubProjects("server")

fun includeSubProjects(dirName: String) {
    file(dirName).listFiles()?.forEach { dir ->
        include(":$dirName-${dir.name}")
        project(":$dirName-${dir.name}").projectDir = dir
    }
}
