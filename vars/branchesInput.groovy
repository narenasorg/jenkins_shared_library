def selectBranch(Int [] options) {
    branch = input(
        id: 'userInput', message: 'Escoja una rama', parameters: [
        [$class: 'ChoiceParameterDefinition',
            choices: options ,
            description: 'dropdown',
            name: 'dropdown'
            ]
        ])
    return branch
}
