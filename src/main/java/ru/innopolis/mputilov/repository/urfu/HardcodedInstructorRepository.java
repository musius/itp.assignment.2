package ru.innopolis.mputilov.repository.urfu;

import ru.innopolis.mputilov.domain.schedule_agnostic.humans.FullName;
import ru.innopolis.mputilov.domain.schedule_agnostic.humans.Instructor;
import ru.innopolis.mputilov.repository.BaseInstructorRepository;

import java.util.UUID;

/**
 * Instructor's repository
 * <p>
 * Singleton. Because we can't use spring's singletons.
 * Caution: do not use this in production systems.
 * <p>
 * Created by mputilov on 20/10/16.
 */
public class HardcodedInstructorRepository extends BaseInstructorRepository {
    private final static HardcodedInstructorRepository INSTANCE = new HardcodedInstructorRepository();

    private HardcodedInstructorRepository() {
        instructors.add(new Instructor(UUID.randomUUID().toString(), new FullName("Maxim", "Alshanskyi")));
    }

    public static HardcodedInstructorRepository getInstance() {
        return INSTANCE;
    }

}
