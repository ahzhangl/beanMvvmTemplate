package com.github.ahzhangl.beanmvvmtemplate.services

import com.intellij.openapi.project.Project
import com.github.ahzhangl.beanmvvmtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
