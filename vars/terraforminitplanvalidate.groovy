def call(String test = 'main') {
  sh 'terraform init'
  sh 'terraform fmt'
  sh 'terraform validate'
  sh 'terraform plan -out tf.plan'
}
