package ru.agent.gradle.nginx

import org.gradle.api.Plugin
import org.gradle.api.Project

class NginxConfigPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.configure(project) {
        }
    }
}
