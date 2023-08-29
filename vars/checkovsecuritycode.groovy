def call(String branch = 'main') {
    sh "/home/ubuntu/.local/bin/checkov -d . --framework terraform --bc-api-key 45350cfe-0f3b-461c-94e3-19b4c60ed0dd -o cli -o junitxml --output-file-path console,results.xml --repo-id rakesh635/firstterraform --branch ${branch}"
}
