def call() {
    def userInput = input(
        id: 'userInput', message: 'Let\'s promote?', parameters: [
        [$class: 'TextParameterDefinition', defaultValue: 'uat', description: 'Environment', name: 'env']
        ])
}
