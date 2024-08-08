package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thinkConstructive.rest.demo.model.CloudVendor;
@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
