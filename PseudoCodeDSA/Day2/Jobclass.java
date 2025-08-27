// Job class
CLASS Job {
    STRING name
    INT deadline
    INT processingTime

    METHOD Job(n, d, p) {
        name = n
        deadline = d
        processingTime = p
    }
}

// Job Scheduler using Priority Queue
CLASS JobScheduler {
    PRIORITY_QUEUE<Job> jobQueue  // Priority: earliest deadline first

    METHOD addJob(job) {
        jobQueue.add(job, PRIORITY = job.deadline)
    }

    METHOD runJobs() {
        WHILE NOT jobQueue.isEmpty()
            job = jobQueue.remove()  // removes job with highest priority
            PRINT "Processing job: " + job.name
        ENDWHILE
    }
}

// MAIN
scheduler = JobScheduler()
scheduler.addJob(Job("Job1", 3, 5))
scheduler.addJob(Job("Job2", 1, 2))
scheduler.addJob(Job("Job3", 2, 4))
scheduler.runJobs()
