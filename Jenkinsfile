node{
    stage('SCM Checkout'){
        git 'https://github.com/vinaysingh254/vsportal-demo.git'
    }
    stage('Compile-Package'){
        bat 'mvn clean package'
    }
    stage('Email Notification'){
        mail bcc: '', body: 'Test', cc: '', from: '', replyTo: '', subject: 'Test', to: 'vinaysingh.singh254@gmail.com'
    }
}