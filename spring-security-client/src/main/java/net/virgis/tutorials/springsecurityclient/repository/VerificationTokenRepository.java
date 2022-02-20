package net.virgis.tutorials.springsecurityclient.repository;

import net.virgis.tutorials.springsecurityclient.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
}
