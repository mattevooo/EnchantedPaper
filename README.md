# EnchantedPaper

**EnchantedPaper is in public alpha.** Most features work for most players most of
the time, however things can occasionally break.

1.21+ [MultiPaper](https://github.com/MultiPaper/MultiPaper) fork that enables a server admin
to scale a single world across multiple servers. Multiple EnchantedPaper servers run
the same world and use an EnchantedPaper-Master to coordinate with each other and
store server data. While the EnchantedPaper-Master is usually run as a standalone
server, it can also be run as a BungeeCord or Velocity plugin, which has some benefits
including being able to send players to the least busy server when they
join.

## Building
Requirements:
- You need `git` installed, with a configured user name and email. 
   **On windows you need to run from git bash.**
- You need `jdk` 17+ installed to compile (and `jre` 17+ to run)

Build instructions:
1. Patch paper with: `./gradlew applyPatches`
2. Build the EnchantedPaper jars with: `./gradlew shadowjar createReobfPaperclipJar`
3. Get the EnchantedPaper jar from `build/libs`
4. Get the EnchantedPaper-Master jar from `MultiPaper-Master/build/libs`

## Publishing to maven local
Publish to your local maven repository with: `./gradlew publishToMavenLocal`

Note for mac users: The latest macOS version includes an incompatible version of
diff and you'll need to install a compatible one. Use `brew install diffutils`
to install it, and then reopen the terminal window.

If `diff --version` returns the following, it is incompatible and will not work:
```
Apple diff (based on FreeBSD diff)
```

### Licensing

All code is licensed under [GPLv3](LICENSE.txt) excluding EnchantedPaper-Master
which is licensed under [MIT](EnchantedPaper-Master/LICENSE.txt).

### Acknowledgements

EnchantedPaper builts upon
[MultiPaper](https://github.com/MultiPaper/MultiPaper).

EnchantedPaper includes optimisations from both
[Airplane](https://github.com/TECHNOVE/Airplane) and
[Pufferfish](https://github.com/pufferfish-gg/Pufferfish).

EnchantedPaper uses PaperMC's paperweight framework found
[here](https://github.com/PaperMC/paperweight).

