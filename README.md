# Commonality
Mod which houses common elements used by various mods.

As of right now this mod exists purely for a good place to house common Tags, but the contents maybe expanded on in the future.

Feel free to fork & create pull requests to add additional content to this mod.

The class `xyz.apex.forge.commonality.init.Mods` holds some useful mod id constants.

### Tags
**Location**: `xyz.apex.forge.commonality.tags.<Type>Tags`<br>
These classes house all **Vanilla** & **Forge** tags plus any commonality tags used by various mods.

### Dependency 
When depending on this Mod it is best to make use of Forge's Jar-in-Jar system.
[See here](https://forge.gemwire.uk/wiki/Jar-in-jar) for overview on how this system works.

Once you have the Jar-in-Jar system setup and working, when compiling your mod you will find an additional Jar is built (`-all.jar`).<br>
This is the Jar that will contain Commonality, the regular `.jar` is your mod compiled normally without using the Jar-in-Jar system.

<details>
<summary>Setting up Project</summary>

Enable the _JarJar_ System, add the following anywhere in your build script.<br>
Preferably under `archivesBaseName='My Mod Name'`

```groovy
jarJar.enable()
```

Next you must configure the `jarJar` task to run during re-obfuscation.

```groovy
tasks.jarJar.finalizedBy('reobfJarJar')
```

Finally, the dependency itself must be added. First add my maven repository,

```groovy
repositories {
	maven { url 'https://maven.apexstudios.dev/' }
}
```

and then the Commonality dependency

```groovy
dependencies {
	def commonality_version = '2.0.0' // Version of Commonality to compile against
	def commonality_version_range = '[2.0.0,3.0.0)' // Version range of Commonality Forge will load at user runtime
	def minecraft_version = '1.19' // Minecraft version
	implementation fg.deobf("xyz.apex.forge:commonality-${minecraft_version}:${commonality_version}")
	jarJar(group: 'xyz.apex.forge', name: "commonality-${minecraft_version}", version: "${commonality_version_range}")
}
```

</details>