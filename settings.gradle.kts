import java.util.Locale

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "enchantedpaper"

for (name in listOf("EnchantedPaper-MasterMessagingProtocol", "EnchantedPaper-API", "EnchantedPaper-Server", "EnchantedPaper-Master")) {
    val projName = name.lowercase(Locale.ENGLISH)
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}
