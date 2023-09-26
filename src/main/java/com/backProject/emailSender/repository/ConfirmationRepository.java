package com.backProject.emailSender.repository;

import com.backProject.emailSender.domain.Confirmation;
import com.backProject.emailSender.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConfirmationRepository extends JpaRepository<Confirmation, Long> {
    Confirmation findByToken(String token);
}
