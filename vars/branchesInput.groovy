def selectBranch(options) {
    data = [1,2,3,4]
    branch = input(
        id: 'userInput', message: 'Escoja una rama', parameters: [
        [$class: 'ChoiceParameterDefinition',
            choices: data ,
            description: 'dropdown',
            name: 'dropdown'
            ]
        ])
    return branch
}
