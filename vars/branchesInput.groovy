def call() {
    data = [1,2,3,4]
    branch = input(
        id: 'userInput', message: 'Escoja una rama', parameters: [
        [$class: 'DropdownAutocompleteParameterDefinition',
            description: 'dropdown',
            name: 'dropdown' ,
            displayExpression: "name" ,
            valueExpression: "name",
            dataProvider: [
                $class: "InlineJsonDataProvider",
                autoCompleteData: '[
                        {"name": "Eddard Stark","id":"estark", "house":"Stark"},
                        {"name": "John Snow","id":"jsnow", "house":"Stark"},
                        {"name": "Tyrion Lannister","id":"tlannister", "house":"Lannister"}
                    ]'
                ]
            ]
        ])
    return branch
}
