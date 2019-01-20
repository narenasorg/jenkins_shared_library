def call(Closure body) {
    def userInput = input(
        id: 'userInput', message: 'Escoja una rama', parameters: [
        [$class: 'ChoiceParameterDefinition',
            choices: ['one' , 'two' , 'three'],
            description: 'dropdown',
            name: 'dropdown'
            ]
        ])
    body()

}
