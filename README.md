# Commonality
Mod which houses common elements used by various mods.

As of right now this mod exists purely for a good place to house common Tags, but the contents maybe expanded on in the future.

Feel free to forke & create pull requests to add additional content to this mod.

### Tags
**Location**: `xyz.apex.forge.commonality.init.<Type>Tags`<br>
These classes house all **Vanilla** & **Forge** tags plus any commonality tags used by various mods.

### Dependency 
This entire repo can shaded into your mod without any issues using the [**Gradle Shadow plugin**](https://imperceptiblethoughts.com/shadow/).<br>
But be aware that [**ApexCore**](https://github.com/ApexStudios-Dev/ApexCore) is also shading this into the compiled mod jar with no class relocation,
so when shading the contents of this mod, please do use the shadow plugin to relocate the classes to some other package.

<details>
<summary>Shading into your Project</summary>

Add the [**Gradle Shadow plugin**](https://imperceptiblethoughts.com/shadow/) to your build script like so:

```groovy
plugins {
	id 'com.github.johnrengelman.shadow' version '7.1.2'
}
```

Once you have the plugin, it needs to be configured. First add the `shade` configuration,

```groovy
configurations {
	shade
}
```

Next you must configure the `shadowJar` task, This is what will shade Commonality into your mod.

```groovy
shadowJar {
	configurations = [ project.configurations.shade ]
	relocate 'xyz.apex.forge.commonality', 'com.mymod.repack.commonality'
}
```

Next you must configure the `shadowJar` task to run during re-obfuscation.

```groovy
artifacts {
	archives shadowJar
}

reobf {
	shadowJar { }
}

build.dependsOn shadowJar
build.dependsOn reobfShadowJar
```

Finally, the dependency itself must be added. First add my maven repository,

```groovy
repositories {
	maven { url 'https://maven.apexmods.xyz/' }
}
```

and then the Commonality dependency to the `implementation` and `shade` configurations.

```groovy
dependencies {
	// commonality_version -> Version of commonality to include
	def commonality_version = '1.0.0'
	implementation fg.deobf("xyz.apex.forge:commonality:${minecraft_version}-${commonality_version}")
	shade "xyz.apex.forge:commonality:${minecraft_version}-${commonality_version}"
}
```

</details>

**Note:** It is possible to make use of Commonality without having to shading it in its entirety into your mod.<br>
To do this you must have your mod depend on [**ApexCore**](https://github.com/ApexStudios-Dev/ApexCore) as this mod comes with Commonality pre-shaded into it.

<details>
<summary>Depending on ApexCore</summary>

Note: That when depending on [**ApexCore**](https://github.com/ApexStudios-Dev/ApexCore) you will also have to have [**Registrator**](https://github.com/ApexStudios-Dev/Registrator) as an additional dependency as
ApexCore requires it in order to function.

First add my maven repository,

```groovy
repositories {
	maven { url 'https://maven.apexmods.xyz/' }
}
```

and then the ApexCore dependency to the `implementation` configuration.

```groovy
dependencies {
	implementation fg.deobf("xyz.apex.forge.utility:registrator:${minecraft_version}-${registrator_version}")
	implementation fg.deobf("xyz.apex.forge:apexcore:${minecraft_version}-${apexcore_version}")
}
```

</details>