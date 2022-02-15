pipeline {
    agent none

}
def getCommitHash() {
    node {
        return sh(script: 'git rev-parse --short HEAD || echo latest', returnStdout: true)
    }
}
