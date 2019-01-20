def call(Closure body) {
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    def userInput = input(
        id: 'userInput', message: 'Escoja una rama', parameters: [
        [$class: 'ChoiceParameterDefinition',
            choices: ['one' , 'two' , 'three'],
            description: 'dropdown',
            name: 'dropdown'
            ]
        ])
    sh "echo hola"

}
