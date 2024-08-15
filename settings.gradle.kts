import java.util.Locale

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "enchantedpaper"

for (name in listOf("EnchantedPaper-MasterMessagingProtocol", "EnchantedPaper-API", "EnchantedPaper-Server", "EnchantedPaper-Master")) {
    val projName = name.toLowerCase(Locale.ENGLISH)
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}
