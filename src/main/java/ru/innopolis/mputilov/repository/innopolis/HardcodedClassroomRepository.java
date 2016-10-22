package ru.innopolis.mputilov.repository.innopolis;

import ru.innopolis.mputilov.domain.schedule_agnostic.Classroom;

/**
 * Repository of course information without humans association
 * <p>
 * Singleton. Because we can't use spring's singletons.
 * Caution: do not use this in production systems.
 * <p>
 * Created by mputilov on 20/10/16.
 */
public class HardcodedClassroomRepository extends ru.innopolis.mputilov.repository.BaseClassroomRepository {
    private final static HardcodedClassroomRepository INSTANCE = new HardcodedClassroomRepository();

    private HardcodedClassroomRepository() {
        classrooms.add(new Classroom("108", "1th floor"));
        classrooms.add(new Classroom("109", "1th floor"));
        classrooms.add(new Classroom("110", "1th floor", "Big giant classroom"));
    }

    public static HardcodedClassroomRepository getInstance() {
        return INSTANCE;
    }

}
