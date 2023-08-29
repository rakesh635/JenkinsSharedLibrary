def call(String init = 'yes', String fmt = 'yes', String validate = 'yes', String plan = 'yes', ) {
  if(init == 'yes') { 
    sh 'terraform init'
  }
  if(fmt == 'yes') { 
	sh 'terraform fmt'
  }
  if(validate == 'yes') { 
	sh 'terraform validate'
  }
  if(plan == 'yes') { 
	sh 'terraform plan'
  }
}
