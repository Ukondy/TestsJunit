package app;

import java.util.List;

public class WorkerRepository {
    private List<Worker> workers;

    public List<Worker> getWorker() {
        return workers;
    }

    public void saveWorker(Worker worker) {
        workers.add(worker);
    }
}
