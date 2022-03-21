package com.aetna

import org.gradle.api.Plugin
import org.gradle.api.Project

abstract class SubConventions: Plugin<Project> {

    override fun apply(target: Project) {
        // inspect the target to decide what libraries we pre configure, etc....
        val libs = (target as org.gradle.api.plugins.ExtensionAware).extensions.getByName("libs") as org.gradle.accessors.dm.LibrariesForLibs
        target.dependencies.add(
            "api",
            libs.commons.lang3
        )
    }
}
