def call(String repo) {
	pipeline {
	  agent {
		node {
		  label 'terraform'
		}
	  }
	  tools {
		git 'Gittool' 
	  }
	  stages {
	    stage("Checkout Code") {
		  steps {
		    git branch: 'master',
		    url: "${repo}"
		   }
		}
		stage('Terraform Init') {
		  steps {
			sh 'terraform init'
		  }
		}
		stage('Terraform format') {
		  steps {
			sh 'terraform fmt'
		  }
		}
		stage('Terraform validate') {
		  steps {
			sh 'terraform validate'
		  }
		}
		stage('Terraform Plan') {
		  steps {
			sh 'terraform plan'
		  }
		}
		stage('Terraform Apply') {
		  steps {
			sh 'terraform apply -auto-approve'
		  }
		}
	  }
	}
}
