node{
    stage('SCM Checkout'){
        git 'git@bitbucket.org:vinaysingh913/vsportal-demo.git'
    }
    stage('Compile-Package'){
        bat 'mvn clean package'
    }
}