package police.repository;

import police.model.Accident;

import java.util.List;

public interface RepoInterface {
    List<Accident> getAccidents();
}