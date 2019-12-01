node{
    stage('SCM Checkout'){
        git 'https://github.com/vinaysingh254/vsportal-demo.git'
    }
    stage('Compile-Package'){
        bat 'mvn clean package'
    }
}