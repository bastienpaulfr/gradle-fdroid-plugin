package fr.coppernic.gradle.plugin

import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class FDroidPluginSpec extends Specification {

    def "apply() should load the plugin"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.with {
            apply plugin: 'fr.coppernic.fdroid'
        }

        then:
        project.plugins.hasPlugin(FDroidPlugin)
    }

}
