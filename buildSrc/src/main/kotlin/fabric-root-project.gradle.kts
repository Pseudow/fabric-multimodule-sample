plugins {
    id("fabric-mod")
}

loom {
    /*
    runs {
        create("testClient") {
            environment = "client"
            configName = "Minecraft Client"

            client()
        }

        create("testServer") {
            environment = "server"
            configName = "Minecraft Server"

            server()
        }
    }
     */

    runConfigs.configureEach {
        ideConfigGenerated(true)
        runDir = "build/run"
    }
}