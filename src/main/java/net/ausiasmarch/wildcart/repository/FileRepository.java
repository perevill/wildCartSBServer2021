package net.ausiasmarch.wildcart.repository;

import java.util.Optional;
import net.ausiasmarch.wildcart.entity.FileEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {

    Optional<FileEntity> findByName(String name);
}