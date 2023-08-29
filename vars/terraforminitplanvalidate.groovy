def call() {
  sh 'terraform init'
	sh 'terraform fmt'
	sh 'terraform validate'
	sh 'terraform plan -out tf.plan'
}
