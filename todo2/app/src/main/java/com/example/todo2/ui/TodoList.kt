package com.example.todo2.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todo2.viewmodel.TodoViewModel

@Composable
fun TodoList(viewModel: TodoViewModel = viewModel()) {
    LazyColumn {
        items(viewModel.todos) { todo ->
            Text(
                text = todo.title,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
