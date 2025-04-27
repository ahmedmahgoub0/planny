package data

import data.util.Parser
import logic.model.Audit
import logic.model.Project
import logic.model.Task
import logic.model.User

class DataSourceImpl(
    private val usersParser: Parser,
    private val projectsParser: Parser,
    private val tasksParser: Parser,
    private val auditParser: Parser
): DataSource {
    override fun getAllUsers(): List<User> {
        TODO("Not yet implemented")
    }

    override fun getAllProjects(): List<Project> {
        TODO("Not yet implemented")
    }

    override fun getAllTasks(): List<Task> {
        TODO("Not yet implemented")
    }

    override fun getAllAuditRecords(): List<Audit> {
        TODO("Not yet implemented")
    }
}