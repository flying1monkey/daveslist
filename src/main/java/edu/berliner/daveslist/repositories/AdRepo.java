package edu.berliner.daveslist.repositories;

import edu.berliner.daveslist.models.Ad;
import org.springframework.data.repository.CrudRepository;

public interface AdRepo extends CrudRepository<Ad, Long>
{

}
