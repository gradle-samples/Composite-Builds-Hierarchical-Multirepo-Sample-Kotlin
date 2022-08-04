rootProject.name = "multirepo-app"

include("app")

file("modules").listFiles().forEach { moduleBuild: File ->
    includeBuild(moduleBuild)
}
