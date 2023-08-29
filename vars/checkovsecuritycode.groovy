def call(String branch = 'main') {
    sh "/home/ubuntu/.local/bin/checkov -d . --framework terraform --bc-api-key XXXXXXXX -o cli -o junitxml --output-file-path console,results.xml --repo-id rakesh635/firstterraform --branch ${branch}"
}
