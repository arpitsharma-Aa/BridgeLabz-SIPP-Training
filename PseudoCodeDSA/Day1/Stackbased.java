// Stack-based Undo system
CLASS TextEditor {
    STACK<String> history
    STRING currentText = ""

    METHOD typeText(newText) {
        history.push(currentText)
        currentText = currentText + newText
    }

    METHOD undo() {
        IF history is NOT empty
            currentText = history.pop()
        ELSE
            PRINT "Nothing to undo"
    }

    METHOD showText() {
        PRINT "Current Text: " + currentText
    }
}

// MAIN
editor = TextEditor()
editor.typeText("Hello ")
editor.typeText("World!")
editor.showText()

editor.undo()
editor.showText()
