import java.net.URI
import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.artifacts.repositories.MavenArtifactRepository

/**
 * Adds the repository in which the
 * [Aurelius design system](https://github.com/jeanbarrossilva/aurelius-android) is located.
 *
 * @param project [Project] to which the repository is being added.
 **/
fun RepositoryHandler.aurelius(): MavenArtifactRepository {
    return maven {
        url = URI.create("https://maven.pkg.github.com/jeanbarrossilva/aurelius-android")

        credentials {
            username = System.getenv("GITHUB_USERNAME")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
}
