def call(Closure body) {
    body.input(
        id: 'userInput', message: 'Escoja una rama', parameters: [
        [$class: 'ChoiceParameterDefinition',
            choices: ['one' , 'two' , 'three'],
            description: 'dropdown',
            name: 'dropdown'
            ]
        ])
}
