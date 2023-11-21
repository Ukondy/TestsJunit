package app;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerService {
    private final WorkerRepository workerRepository;

    public int getSumOfSalariesOfAllWorkers() {
        List<Worker> workers = workerRepository.getWorker();
        return workers.stream()
                .mapToInt(Worker::getSalary)
                .sum();
    }

    public void hire(Worker worker) {
        if(worker.getSalary() < 16_242) {
            throw new TooLowSalaryException();
        }
        workerRepository.saveWorker(worker);
    }
}
