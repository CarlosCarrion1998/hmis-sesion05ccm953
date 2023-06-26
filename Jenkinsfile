pipeline {
  agent any

  tools {
    // Nombre dado a la instalación de Maven en "Tools configuration"
    maven "maven default"
  }

  stages {
    stage('Git fetch') { 
      steps {
        // Get some code from a GitHub repository
        git branch: 'main', url: 'https://github.com/CarlosCarrion1998/hmis-sesion05ccm953'
      }
    }
    stage('Compile, Test, Package') { 
      steps {
        // When necessary, use '-f path-to/pom.xml' to give the path to pom.xml
        // Run goal 'package'. It includes compile, test and package.
        sh "mvn  -f pom.xml clean package" 
      }
      post { 
        // Record the test results and archive the jar file.
        success {
          junit '**/target/surefire-reports/TEST-*.xml'
          archiveArtifacts '**/target/*.jar'
          jacoco( 
            execPattern: '**/target/jacoco.exec',
            classPattern: '**/target/classes',
            sourcePattern: '**/src/',
            exclusionPattern: '**/test/'
        )
            publishCoverage adapters: [jacocoAdapter('**/target/site/jacoco/jacoco.xml')]
        }
      }
    }
    stage ('Analysis') {
    steps {
	  // Warnings next generation plugin required
	  sh "mvn -f pom.xml checkstyle:checkstyle site"
    }
    post {
      success {
        dependencyCheckPublisher pattern: '**/target/site/es/dependency-check-report.xml'
        recordIssues enabledForFailure: true, tool: checkStyle()
      }
    }
  }
  stage ('Documentation') {
      steps {
	    sh "mvn -f pom.xml javadoc:javadoc javadoc:aggregate" 
      }
      post{
        success {
          step $class: 'JavadocArchiver', javadocDir: 'target/site/apidocs', keepAll: false 
          publishHTML(target: [reportName: 'Maven Site', reportDir: 'target/site/es', reportFiles: 'index.html', keepAll: false]) 
        }
      }
    }
  }
}