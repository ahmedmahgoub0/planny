package data

import logic.model.User
import logic.model.Project
import logic.model.Task
import logic.model.Audit

interface DataSource {
    fun getAllUsers(): List<User>
    fun getAllProjects(): List<Project>
    fun getAllTasks(): List<Task>
    fun getAllAuditRecords(): List<Audit>
}