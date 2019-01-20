def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def test(dir) {
    sh "ls -l $dir"
}
