

//-----------------------------------------------
// Model i.e Todo ( id,title,completed)
class Todo {
    constructor(title) {
        Todo.id++;
        this.id = Todo.id;
        this.title = title;
        this.completed = false
    }
}
Todo.id = 0;
//-----------------------------------------------

// Service i.e TodoService

class TodoService {
    constructor() {
        this.todos = []
    }
    addTodo(title) {
        // TODO:
    }
    editTodo(id, newTitle) {
        // TODO:
    }
    completeTodo(id) {
        // TODO:
    }
    deleteTodo(id) {
        // TODO:
    }
    completeAll() {
        // TODO:
    }
    clearCompleted() {
        // TODO:
    }
    viewTodos(filter) {
        // filter ==> 'ALL' | 'ACTIVE' | 'COMPLETED'
    }

}

//-------------------------------------------

const todosService=new TodoService();




